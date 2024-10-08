//package org.perscholas.capstone.Config;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.ProviderManager;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
//@Configuration
//public class SpringSecConfig {
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//
//        http.csrf(csrf -> csrf.disable());
////        http.csrf(csrf -> Customizer.withDefaults());
//
//        //         this section says allow all pages EXCEPT the ones that are in the AntPathRequestMatcher
////         anything in AntPathRequestMatcher will require the user to be authenticated
//        http.authorizeRequests().requestMatchers(new AntPathRequestMatcher("/admin/**"))
//                .authenticated().anyRequest().permitAll();
//
////         the loginPage parameter is the actual URL of the login page
////         the loginProcessingUrl is the URL that the form will submit to
//        http.formLogin(formLogin ->
//                formLogin.loginPage("/auth/login")
//                        .loginProcessingUrl("/auth/login/loginSubmit")
//        );
//// this is the URL that will log a user out
//        http.logout(formLogout -> formLogout
//                .invalidateHttpSession(true)
//                .logoutUrl("/auth/logout")
//                .logoutSuccessUrl("/"));
//        return http.build();
//    }
//
//    @Bean
//    AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
//        return authenticationConfiguration.getAuthenticationManager();
//    }
//
//    @Bean(name = "passwordEncoder")
//    PasswordEncoder getPasswordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//}
//
package  org.perscholas.capstone.Config;

import org.springframework.context.annotation.*;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.*;
import org.springframework.security.config.annotation.web.builders.*;
import org.springframework.security.config.annotation.web.configuration.*;
import org.springframework.security.crypto.bcrypt.*;
import org.springframework.security.crypto.password.*;
import org.springframework.security.web.*;
import org.springframework.security.web.util.matcher.*;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SpringSecConfig {


    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        // boiler plate code to protect a common hack
        http.csrf(csrf -> csrf.disable());

        // this section says allow all pages EXCEPT the ones that are in the AntPathRequestMatcher
        // anything in AntPathRequestMatcher will require the user to be authenticated
        // 1) users that are not logged in and can see any public resource
        // 2) users that are logged in but do not have any user roles to grant access to a resource
        // 3) users that are logged in AND have a user role that grants access to a resource
        http.authorizeRequests()
                .requestMatchers(
                        new AntPathRequestMatcher("/admin/**"),
                        new AntPathRequestMatcher("/order/**"),
                        new AntPathRequestMatcher("/employee/**")).authenticated()
                .anyRequest().permitAll();


        // the loginPage parameter is the actual URL of the login page
        // the loginProcessingUrl is the URL that the form will submit to
        http.formLogin(formLogin -> formLogin
                // this a controller method URL for displaying the login page
                // we built this controller method, however this is just the URL in the browser for the login page
                .loginPage("/auth/login")


                // this URL is part of spring security and we do not need to implement it in our controller
                // we just need to make the form action submit to this URL
                // this does not exist in any of our controller methods
                // 3 things need to be done on the login.jsp
                // 1) action needs to be set to /account/loginProcessingURL
                // 2) input field for username needs to be named "username"
                // 3) input field for password needs to be named "password"
                .loginProcessingUrl("/auth/login"));


        http.logout(formLogout -> formLogout
                .invalidateHttpSession(true)
                // this is the URL that will log a user out
                // this is another URL that is included with spring security - we do not have a controller method for this
                .logoutUrl("/auth/logout")
                // after spring loggs the user out then it will goto this URL
                .logoutSuccessUrl("/"));

        return http.build();
    }

    @Bean(name = "passwordEncoder")
    public PasswordEncoder getPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authConfig) throws Exception {
        return authConfig.getAuthenticationManager();
    }

}