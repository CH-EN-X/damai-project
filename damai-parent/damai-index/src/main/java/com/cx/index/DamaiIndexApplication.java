package com.cx.index;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcRegistrations;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.ManagedBean;

@SpringBootApplication
public class DamaiIndexApplication implements WebMvcConfigurer {

    public static void main(String[] args) {
        SpringApplication.run(DamaiIndexApplication.class, args);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")
                .addResourceLocations("file::D:\\JAVA\\IdeaProjects\\damai\\damai-parent" +
                        "\\damai-index\\src\\main\\resources\\static/");
    }
}
