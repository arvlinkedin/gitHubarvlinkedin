package com.prep.spring.config;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.HttpBasicConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
    private final AccessDeniedHandler accessDeniedHandler;

    public WebSecurityConfig(AccessDeniedHandler accessDeniedHandler) {
        this.accessDeniedHandler = accessDeniedHandler;
    }


    public SecurityFilterChain securityFilter(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(t ->
                        t.requestMatchers("/student/**").hasAnyRole("OFFICER")
                         .requestMatchers("/course/**").permitAll()
                         .anyRequest().authenticated()
                ).exceptionHandling((ex) -> {
                    ex.accessDeniedHandler(accessDeniedHandler);
                })
                .httpBasic((Customizer.withDefaults()));
        return http.build();
    }



    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authorize -> authorize
                                .requestMatchers("/student/**").hasAnyRole("OFFICE_ADMIN", "STUDENT_USER") // Only ADMIN can access /admin
                                .requestMatchers("/course/**").permitAll()
                        //hasAnyRole("USER", "OFFICE_ADMIN") // USER or ADMIN can access /user
                        //.anyRequest().authenticated() // All other requests require authentication

                )
                .exceptionHandling(exceptionHandling ->
                        exceptionHandling.accessDeniedHandler(accessDeniedHandler)
                )
                .httpBasic(Customizer.withDefaults());
        //.formLogin(withDefaults()); // Enable form-based login with default settings
        return http.build();
    }







    @Bean

    public UserDetailsService userDetailsService() {
        UserDetails peter = User.builder().username("john_student").password("{noop}student_password").roles("STUDENT_USER")
                .build();
        UserDetails admin = User.builder().username("john_admin").password("{noop}admin_password").roles("OFFICE_ADMIN")
                .build();

        return new InMemoryUserDetailsManager(peter,admin);
    }



}
