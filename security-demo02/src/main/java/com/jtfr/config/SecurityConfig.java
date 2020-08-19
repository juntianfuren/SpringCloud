package com.jtfr.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	/**
	 * 添加角色的作用
	 */
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.
		// <X> 使用内存中的 InMemoryUserDetailsManager
				inMemoryAuthentication()
				// <Y> 不使用 PasswordEncoder 密码编码器
				.passwordEncoder(NoOpPasswordEncoder.getInstance())
				// <Z> 配置 admin 用户
				.withUser("admin").password("admin").roles("ADMIN")
				// <Z> 配置 normal 用户
				.and().withUser("normal").password("normal").roles("NORMAL");
	}
}
