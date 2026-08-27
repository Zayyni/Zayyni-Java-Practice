package com.zayyni.securityapplication.config;

import com.zayyni.securityapplication.entities.enums.Permission;
import com.zayyni.securityapplication.filters.JwtAuthFilter;
import com.zayyni.securityapplication.handlers.OAuth2SuccessHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import static com.zayyni.securityapplication.entities.enums.Permission.*;
import static com.zayyni.securityapplication.entities.enums.Role.ADMIN;
import static com.zayyni.securityapplication.entities.enums.Role.CREATOR;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class WebSecurityConfig {

    private final JwtAuthFilter jwtAuthFilter;
    private final OAuth2SuccessHandler oAuth2SuccessHandler;
    private static final String[] publicRoutes =
            {
              "/auth/**","/error","/home.html"
            };

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .authorizeHttpRequests(authorizeRequests ->
                        authorizeRequests
                                .requestMatchers(publicRoutes).permitAll()
                                .requestMatchers(HttpMethod.GET,"/posts/**").permitAll()
                                .requestMatchers(HttpMethod.POST,"/posts/**")
                                .hasAnyRole(ADMIN.name(),CREATOR.name())
                                .requestMatchers(HttpMethod.POST,"/posts/**")
                                    .hasAnyAuthority(POST_CREATE.name())
                                .requestMatchers(HttpMethod.GET,"/posts/**")
                                    .hasAuthority(POST_VIEW.name())
                                .requestMatchers(HttpMethod.PUT,"/posts/**")
                                .hasAuthority(POST_UPDATE.name())
                                .requestMatchers(HttpMethod.DELETE,"/posts/**")
                                .hasAuthority(POST_DELETE.name())
                                .anyRequest()
                                .authenticated())
                .csrf(httpSecurityCsrfConfigurer -> httpSecurityCsrfConfigurer.disable())
                .sessionManagement(sessionManagement ->sessionManagement.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .addFilterAfter(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class)
                .oauth2Login(httpSecurityOAuth2LoginConfigurer -> httpSecurityOAuth2LoginConfigurer
                        .failureUrl("/login?error=true")
                                .successHandler(oAuth2SuccessHandler));
//                .formLogin(Customizer.withDefaults());


        return httpSecurity.build();
    }

    @Bean
    AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) {
        return authenticationConfiguration.getAuthenticationManager();
    }

//    @Bean
//    UserDetailsService myInMemoryUserDetailsService() {
//        UserDetails normalUser = User
//                .withUsername("zayyni")
//                .password(passwordEncoder().encode("pass123"))
//                .roles("USER")
//                 .build();
//
//        UserDetails adminUser = User
//                .withUsername("admin")
//                .password(passwordEncoder().encode("admin123"))
//                .roles("ADMIN")
//                .build();
//
//        return new InMemoryUserDetailsManager(normalUser, adminUser);
//
//    }


}
