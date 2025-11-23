package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain configure(HttpSecurity http) {
        http.cors(Customizer.withDefaults())
                .authorizeHttpRequests(t ->
                        t.requestMatchers("/", "*")
                                .hasAuthority("SCOPE_read")
                                .anyRequest().authenticated())
                .authorizeHttpRequests(t ->
                        t.requestMatchers("/", "*")
                                .hasAuthority("SCOPE_write")
                                .anyRequest().authenticated())
                .oauth2ResourceServer(t -> t.jwt(Customizer.withDefaults()));

        //httpBasic(Customizer.withDefaults());
        return http.build();
    }

    //@Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http.cors()
//                .and()
//                .authorizeRequests()
//                .antMatchers(HttpMethod.GET, "/user/info", "/api/foos/**")
//                .hasAuthority("SCOPE_read")
//                .antMatchers(HttpMethod.POST, "/api/foos")
//                .hasAuthority("SCOPE_write")
//                .anyRequest()
//                .authenticated()
//                .and()
//                .oauth2ResourceServer()
//                .jwt();
//        return http.build();
//    }
}
