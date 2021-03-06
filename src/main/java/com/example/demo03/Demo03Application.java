package com.example.demo03;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

/**
 * 134151351
 */
@SpringBootApplication
public class Demo03Application {

    private static final Logger LOG = LoggerFactory.getLogger(Demo03Application.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Demo03Application.class);
        Environment env = app.run(args).getEnvironment();
        LOG.info("启动成功了~~~~~~~~~~~");
        LOG.info("地址: \thttp://127.0.0.1:{}", env.getProperty("server.port"));

    }

}
