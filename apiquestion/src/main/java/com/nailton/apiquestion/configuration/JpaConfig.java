package com.nailton.apiquestion.configuration;

import com.nailton.apiquestion.service.QuestionService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.nailton.apiquestion.repository")
public class JpaConfig {

    @Bean("questionService")
    public QuestionService questionService() {
        return new QuestionService();
    }
}
