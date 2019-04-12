package cn.netkiller.oauth2.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
@EnableAuthorizationServer
public class Application {

	public class WebSecurityConfigurer extends WebSecurityConfigurerAdapter {

		@Bean
		public AuthenticationManager authenticationManagerBean() throws Exception {
			return super.authenticationManagerBean();
		}

		@Override
		public void configure(HttpSecurity httpSecurity) throws Exception {
			httpSecurity.formLogin().and().csrf().disable();
		}

	}

	public static void main(String[] args) {
		System.out.println("Hello World!");
		SpringApplication.run(Application.class, args);
	}
}
