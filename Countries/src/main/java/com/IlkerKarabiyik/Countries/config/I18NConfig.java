package com.IlkerKarabiyik.Countries.config;

import jakarta.el.StandardELContext;
import org.apache.tomcat.util.descriptor.LocalResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

@Configuration
public class I18NConfig {

    public AcceptHeaderLocaleResolver localResolver(){
        var localResolver = new AcceptHeaderLocaleResolver();
        var defaultLocale = new Locale("tr","TR");
        localResolver.setDefaultLocale(defaultLocale);
        return localResolver;
    }

    @Bean
    public ResourceBundleMessageSource messageSource(){
        var messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("messages/messages");
        messageSource.setDefaultEncoding(StandardCharsets.UTF_8.toString());
        return messageSource;
    }
    @Bean
    public LocalValidatorFactoryBean getValidator(){
        var bean = new LocalValidatorFactoryBean();
        bean.setValidationMessageSource(messageSource());
        return bean;
    }
}
