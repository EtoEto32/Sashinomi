package com.hackathon;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Profile("production")
@Configuration
@EnableWebSecurity
public class securityConfig {

    // @Bean
    // protected void configure(HttpSecurity security) throws Exception {
    //     security.authorizeRequests().anyRequest().authenticated().and().formLogin().and().httpBasic().disable();
    // }
}