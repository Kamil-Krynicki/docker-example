package org.kkrynick.docker.breaks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class Application {

    @Autowired
    private ApplicationContext context;

    @RequestMapping("/break")
    String breakMe() {
        ((ConfigurableApplicationContext) context).close();
        return "broken";
    }

    @RequestMapping("/boop")
    String boop() {
        return "Bad service";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

}
