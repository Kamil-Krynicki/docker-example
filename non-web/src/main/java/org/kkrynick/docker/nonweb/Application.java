package org.kkrynick.docker.nonweb;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Application {

    public static void main(String[] args) throws Exception {
        while (true) {
            System.out.println("I'm working");
            Thread.sleep(1000);
        }
    }

}
