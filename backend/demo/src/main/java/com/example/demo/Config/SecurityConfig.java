
package com.example.demo.Config;


import com.example.demo.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;



    @Configuration
    @EnableWebSecurity
    @ComponentScan(basePackages = "com.example.demo.Services")
        public class SecurityConfig extends WebSecurityConfigurerAdapter{

        @Autowired
        private UserService userService;

        @Override
        protected void configure(AuthenticationManagerBuilder auth) throws Exception {
      auth.userDetailsService(userService).passwordEncoder(passwordEncoder());

        }

        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http.csrf().disable()
                    .authorizeRequests()
                    .antMatchers(HttpMethod.POST, "/api/users/register").permitAll()
                    .antMatchers(HttpMethod.POST, "/api/users/register/admin").hasRole("ADMIN")
                    .antMatchers(HttpMethod.POST, "/api/users/login").permitAll()
                    .anyRequest().authenticated()
                    .and().httpBasic();

        }

        @Override
        @Bean
        public AuthenticationManager authenticationManagerBean() throws Exception {
            return super.authenticationManagerBean();
        }

        @Bean
        public PasswordEncoder passwordEncoder(){
      return new BCryptPasswordEncoder();

        }
    }








