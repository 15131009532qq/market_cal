package com.mudule.mumzonemarketcal.service;

import com.mudule.mumzonemarketcal.configurer.EmailProperties;

/**
 * @Description 邮件发送服务类
 * @ClassName IEmailSendService
 * @Autor DZT
 * @Date 2019/8/12 15:35
 * @Version 1.0
 */
public interface IEmailSendService {
    /**
     * 发送文本邮件
     * */
    boolean sendSimpleMail(String subject, String content);
}
