package com.mudule.mumzonemarketcal.configurer;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Description 加载邮箱
 * @ClassName EmailProperties
 * @Autor DZT
 * @Date 2019/8/12 15:29
 * @Version 1.0
 */
@Component
@ConfigurationProperties(prefix = "sender-email")
public class EmailProperties {
    private Map<String, Map<String,String>> mail;

    public Map<String, Map<String, String>> getMail() {
        return mail;
    }

    public void setMail(Map<String, Map<String, String>> mail) {
        this.mail = mail;
    }
}
