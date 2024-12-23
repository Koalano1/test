//package com.demo.transaction.config;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.datatype.hibernate6.Hibernate6Module;
//import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//
//@Configuration
////@EnableJpaRepositories(
////        basePackageClasses = {com.demo.transaction.repository.TransactionRepository.class, com.demo.transaction.repository.AccountRepository.class}
////)
//public class JacksonConfig {
//
//    @Bean
//    public ObjectMapper objectMapper() {
//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.registerModule(new Hibernate6Module());
//        objectMapper.registerModule(new JavaTimeModule());
//        return objectMapper;
//    }
//
//}
