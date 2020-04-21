package com.mudule.mumzonemarketcal.service.impl;

import com.mudule.mumzonemarketcal.configurer.EmailProperties;
import com.mudule.mumzonemarketcal.configurer.SpringContext;
import com.mudule.mumzonemarketcal.enums.BooleanEnum;
import com.mudule.mumzonemarketcal.enums.EmailSmtpValuesEnum;
import com.mudule.mumzonemarketcal.service.IEmailSendService;
import com.mudule.mumzonemarketcal.utils.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.Properties;

/**
 * @Description 邮件发送服务类
 * @ClassName IEmailSendServiceImpl
 * @Autor DZT
 * @Date 2019/8/12 15:38
 * @Version 1.0
 */
@Service
@Slf4j
public class IEmailSendServiceImpl  implements IEmailSendService {
    @Autowired
    private EmailProperties emailProperties;

    @PostConstruct
    public void init(){
        log.info("=========初始化可发送邮箱列表===========");
        if (StringUtils.isEmpty(emailProperties.getMail())){
            log.error("可发送邮箱列表为空！请检查！");
        }else {
            StringBuffer str=new StringBuffer("");
            for (Map<String,String> email:emailProperties.getMail().values()){
                str.append(email.get("username"));
                str.append(",");
            }
            String name=str.toString();
            if (StringUtils.isNotEmpty(name)){
                log.info("可发送邮箱:[{}]",name);
            }else {
                log.error("可发送邮箱列表为空！请检查！");
            }
        }
    }

    /**
     * 发送邮箱
     * @param subject
     * @param content
     * @return
     */
    @Override
    public boolean sendSimpleMail(String subject, String content) {
        log.info("发送邮箱...");
        try {
            JavaMailSenderImpl javaMailSender = getJavaMailSender();
            for (Map<String,String> email:emailProperties.getMail().values()){
                String username = javaMailSender.getUsername();
                log.info("当前发送邮箱:[{}]",username);
                SimpleMailMessage message = new SimpleMailMessage();
                message.setFrom(username);
                message.setTo(email.get("username"));
                message.setSubject(subject);
                message.setText(content);
                javaMailSender.send(message);
                log.info("[{}]:发送邮箱成功！",username);
            }
            return true;
        } catch (Exception e) {
            log.error("简单邮件发送异常", e);
            e.printStackTrace();
        }
        return false;
    }
    /**
     * 获取发送邮箱实例
     * @return
     */
    private synchronized JavaMailSenderImpl getJavaMailSender() {
        // 获取邮箱发送实例
        String host = SpringContext.getContext().getEnvironment().getProperty(EmailSmtpValuesEnum.SPRING_MAIL_HOST.getValue());
        String username = SpringContext.getContext().getEnvironment().getProperty(EmailSmtpValuesEnum.SPRING_MAIL_USERNAME.getValue());
        String password = SpringContext.getContext().getEnvironment().getProperty(EmailSmtpValuesEnum.SPRING_MAIL_PASSWORD.getValue());
        String sslPort = SpringContext.getContext().getEnvironment().getProperty(EmailSmtpValuesEnum.SPRING_MAIL_HOST.getValue());
        JavaMailSenderImpl javaMailSenderImpl = new JavaMailSenderImpl();
        javaMailSenderImpl.setHost(host);
        javaMailSenderImpl.setUsername(username);
        javaMailSenderImpl.setPassword(password);
        javaMailSenderImpl.setDefaultEncoding(SpringContext.getContext().getEnvironment().getProperty(EmailSmtpValuesEnum.SPRING_MAIL_PORT_DEFAULT_ENCODING.getValue()));
        Properties properties = new Properties();
        properties.setProperty(EmailSmtpValuesEnum.MAIL_SMTP_AUTH.getValue(), BooleanEnum.TRUE.getCode());
        properties.setProperty(EmailSmtpValuesEnum.MAIL_SMTP_SOCKETFACTORY_PORT.getValue(), sslPort);
        properties.setProperty(EmailSmtpValuesEnum.MAIL_SMTP_SOCKETFACTORY_CLASS.getValue(), EmailSmtpValuesEnum.JAVAX_NET_SSL_SSLSOCKETFACTORY.getValue());
        javaMailSenderImpl.setJavaMailProperties(properties);
        return javaMailSenderImpl;
    }
}
