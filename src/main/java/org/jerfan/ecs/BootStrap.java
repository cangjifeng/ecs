package org.jerfan.ecs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author jerfan cang
 * @since 2021/5/19 22:48
 */
@SpringBootApplication
public class BootStrap {


    /**
     * local env ,start this server and access http://localhost:8088/start
     * @param args start param
     */
    public static void main(String[] args) {
        SpringApplication.run(BootStrap.class, args);
    }
}
