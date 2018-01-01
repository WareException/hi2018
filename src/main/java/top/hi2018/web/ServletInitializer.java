package top.hi2018.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@SpringBootApplication
@Configuration
@ComponentScan(basePackages="top.hi2018")   //默认扫描是当前包下的路径
@EnableAutoConfiguration
public class ServletInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ServletInitializer.class);
    }
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ServletInitializer.class, args);
    }

}