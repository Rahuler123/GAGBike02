	/*
package com.configuration;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import antlr.collections.List;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
	


	@Bean
	@Override
	public UserDetailsService userDetailsService() {
		
		ArrayList<UserDetails> users = new ArrayList();
		users.add( User.withDefaultPasswordEncoder()
				.username("user")
				.password("1234")
				.roles("USER")
				.build());

		return new InMemoryUserDetailsManager(users);
	} */
	
	/*
	 * @Override protected void configure(HttpSecurity http) throws Exception {
	 * http.cors(); http.csrf().disable() .authorizeRequests() .antMatchers("/**")
	 * .permitAll();
	 * 
	 * http.authorizeRequests().antMatchers("/").permitAll().and()
	 * .authorizeRequests().antMatchers("/console/**").permitAll();
	 * 
	 * http.headers().frameOptions().disable();
	 * 
	 * http .httpBasic().and() .authorizeRequests() .antMatchers("/saveBlog" ,
	 * "/saveBlog/**") .permitAll().anyRequest().authenticated()
	 * .and().csrf().disable();
	 * 
	 * }
	 */


	 
		
	/*
	 @Override protected void configure(HttpSecurity http) throws Exception {
	 http.cors().and().csrf(). disable() .authorizeRequests()
	 .antMatchers(HttpMethod.OPTIONS, "/**") .permitAll() .anyRequest()
	 .authenticated() .and() .httpBasic();
	 http.headers().frameOptions().disable(); }
	
	
	@Bean CorsConfigurationSource corsConfigurationSource() { CorsConfiguration
	configuration = new CorsConfiguration();
	configuration.setAllowedOrigins(Arrays.asList("http://150.1.18.138:4200"));
	configuration.setAllowedMethods(Arrays.asList("GET","POST"));
	UrlBasedCorsConfigurationSource source = new
	UrlBasedCorsConfigurationSource(); source.registerCorsConfiguration("/**",
	configuration); return source; }
	
	

} */