package com.lzj.mail;

import com.lzj.serve.pojo.MailConstants;
import org.springframework.amqp.core.Queue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * @date:2021/9/13 20:42
 * @author:yang
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Applicatoin {
    public static void main(String[] args) {
        SpringApplication.run(Applicatoin.class, args);
    }

    @Bean
    public Queue queue() {
        return new Queue(MailConstants.MAIL_QUEUE_NAME);
    }
}
