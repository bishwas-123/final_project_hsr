//package com.hsr.demo.application.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//
//import javax.sql.DataSource;
//
///**
// * @author okalu
// */
//@Configuration
//@EnableGlobalMethodSecurity(securedEnabled = true, proxyTargetClass = true)
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    private UserDetailsService hotelUserDetailsService;
//
//    @Autowired
//    private DataSource dataSource;
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth
//                .userDetailsService(hotelUserDetailsService)
//                .passwordEncoder(passwordEncoder());
//    }
//    @Override
//    public void configure(WebSecurity web) throws Exception {
//        web.ignoring().antMatchers("/resources/**","/css/**","/js/**","images/**");
//         }
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .headers()
//                .frameOptions().sameOrigin()
//                .and()
//                .authorizeRequests()
//                .antMatchers("/rsesources/**","/webjars/**", "/assets/**").permitAll()                .antMatchers("/user", "/customer").permitAll()
////            .antMatchers("/resources/static/images/**").permitAll()
////             .antMatchers("resources/static/js/**").permitAll()
////                .antMatchers("resources/static/css/**").permitAll()
////                .antMatchers("/admin/**").hasRole("Admin")
//                .anyRequest().authenticated()
//                .and()
//                .formLogin()
//                .loginPage("/user/login")
//                .defaultSuccessUrl("/user/reservation",true)
//                .failureUrl("/login?error")
//                .permitAll()
//                .and()
//                .logout()
//                .logoutRequestMatcher(new AntPathRequestMatcher("/user/logout"))
//
//                .logoutSuccessUrl("/logout")
//                .permitAll()
//                .and()
//                .exceptionHandling().accessDeniedPage("/user/accessdenied");
//    }
//}
