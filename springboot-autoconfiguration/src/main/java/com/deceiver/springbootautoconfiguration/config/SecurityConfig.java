package com.deceiver.springbootautoconfiguration.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;


/**
 * Created with IntelliJ IDEA.
 * Description:
 * Author: deceiver
 * Date: 2019-06-20
 * Time: 11:20
 */
@SuppressWarnings("deprecation")
@Configuration
@EnableWebSecurity
@ComponentScan("com.deceiver.springbootautoconfiguration")
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserDetailsService userDetailsService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(encoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                    .antMatchers("/design", "/orders")
                        .access("hasRole('ROLE_USER')")
                    .antMatchers("/", "/**")
                        .access("permitAll")

                .and()
                    .formLogin()
                        .loginPage("/login")

                .and()
                    .logout()
                        .logoutSuccessUrl("/")

                .and()
                    .csrf()
                        .ignoringAntMatchers("/h2-console/**")

                .and()
                    .headers()
                        .frameOptions()
                        .sameOrigin()
        ;
    }

    @Bean
    public PasswordEncoder encoder() {
        return new StandardPasswordEncoder("53cr3t");
    }

    //@Autowired
    //DataSource dataSource;
    //
    //@Override
    //protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    //    auth.jdbcAuthentication().dataSource(dataSource);

    //}

    //@Override
    //protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    //    auth.ldapAuthentication()
    //            .userSearchFilter("(uid={0})")
    //            .groupSearchFilter("member={0}");
    //}


    //@Override
    //protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    //    auth
    //            .inMemoryAuthentication()
    //                .withUser("buzz")
    //                    .password("infinity")
    //                    .authorities("RROLE_USER")
    //
    //                .and()
    //                .withUser("foo")
    //                    .password("bullseye")
    //                    .authorities("RROLE_USER");
    //}
}
