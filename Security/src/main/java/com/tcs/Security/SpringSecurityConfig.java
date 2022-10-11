package com.tcs.Security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@SuppressWarnings("deprecation")
@Configuration
@ComponentScan("com.tcs")
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
	@Bean
	public static NoOpPasswordEncoder passwordEncoder() {
	  return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception {
//		http.httpBasic();
//		http.authorizeRequests()
//		.anyRequest().authenticated();
		http.authorizeRequests().antMatchers("/info/**").hasAnyRole("ADMIN","USER").
		and().formLogin();
	}
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("ram").password("ram123").roles("ADMIN");
		auth.inMemoryAuthentication().withUser("ravan").password("ravan123").roles("USER");
		auth.inMemoryAuthentication().withUser("kans").password("kans123").roles("USER");
		auth.inMemoryAuthentication().withUser("pashu").password("123").roles("USER");
	}
}

