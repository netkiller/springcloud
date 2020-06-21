package cn.netkiller.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("cn.netkiller.persistence.repo")
@EntityScan("cn.netkiller.persistence.model")
@SpringBootApplication(scanBasePackages = {"cn.netkiller.controller"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
