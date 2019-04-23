package cn.sk.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:dubbo/spring-dubbo.xml"})
public class SkDubboConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SkDubboConsumerApplication.class, args);
    }

}
