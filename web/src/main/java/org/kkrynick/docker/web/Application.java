package org.kkrynick.docker.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class Application {

    @RequestMapping("/boop")
    String boop() throws UnknownHostException {
        return "Good service";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

}
