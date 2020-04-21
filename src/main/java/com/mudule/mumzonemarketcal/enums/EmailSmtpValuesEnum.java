package com.mudule.mumzonemarketcal.enums;

/**
 * @Description 邮件枚举值
 * @ClassName EmailSmtpValuesEnum
 * @Autor DZT
 * @Date 2019/8/28 10:53
 * @Version 1.0
 */
public enum EmailSmtpValuesEnum {
    MAIL_SMTP_AUTH("mail.smtp.auth","smtp服务权限"),
    MAIL_SMTP_SOCKETFACTORY_PORT("mail.smtp.socketFactory.port","smtp服务socket连接端口"),
    MAIL_SMTP_SOCKETFACTORY_CLASS("mail.smtp.socketFactory.class","加载SSL证书的指定类"),
    JAVAX_NET_SSL_SSLSOCKETFACTORY("javax.net.ssl.SSLSocketFactory","加载SSL证书的类"),
    SPRING_MAIL_PORT_DEFAULT_ENCODING("spring.mail.port.default-encoding","smtp服务器默认编码格式"),
    SPRING_MAIL_HOST("spring.mail.host","mail地址"),
    SPRING_MAIL_USERNAME("spring.mail.username","mail用户名"),
    SPRING_MAIL_PASSWORD("spring.mail.password","mail密码"),
    SPRING_MAIL_PORT("spring.mail.port","mail端口");
    /**
     * 枚举值
     */
    private String value;
    /**
     * 描述信息
     */
    private String msg;

    EmailSmtpValuesEnum(String value, String msg) {
        this.value = value;
        this.msg = msg;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }}
