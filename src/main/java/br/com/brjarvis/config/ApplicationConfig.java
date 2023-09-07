package br.com.brjarvis.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@Data
@ConfigurationProperties(prefix = "user")
public class ApplicationConfig {
	private String userName;
	private String password;
}
