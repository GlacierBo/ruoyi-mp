package com.ruoyi;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 启动程序
 *
 * @author ruoyi
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan({"com.ruoyi.*.mapper", "com.ruoyi.*.dao"})
@Slf4j
public class RuoYiApplication {

    public static void main(String[] args) {
        Environment env = new SpringApplication(RuoYiApplication.class).run(args).getEnvironment();
        String applicationName = env.getProperty("ruoyi.name");
        String serverPort = env.getProperty("server.port");
        String hostAddress = "localhost";
        try {
            hostAddress = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            log.warn("The host name could not be determined, using `localhost` as fallback");
        }
        log.info("\n----------------------------------------------------------\n\t" +
                        "Application '{}' is running! Access URLs:\n\t" +
                        "Local: \t\thttp://localhost:{}\n\t" +
                        "External: \thttp://{}:{}\n\t" +
                        "Swagger: \thttp://localhost:{}/swagger-ui.html",
                applicationName,
                serverPort,
                hostAddress,
                serverPort,
                serverPort
        );
    }
}