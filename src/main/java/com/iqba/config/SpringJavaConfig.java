/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iqba.config;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author iqbal
 */
@Configuration
@ComponentScan
public class SpringJavaConfig {
   @Bean
   public DataSource dataSource(){
       DriverManagerDataSource dataSource = new DriverManagerDataSource();
       dataSource.setDriverClassName("org.postgresql.Driver");
       dataSource.setUrl("jdbc:postgresql://localhost:5432/latihan1");
       dataSource.setUsername("hr");
       dataSource.setPassword("salman");
       return dataSource;
   }
    
   @Bean
   public  JdbcTemplate jdbcTemplate(){
       
       return new JdbcTemplate(dataSource());
   }
}
