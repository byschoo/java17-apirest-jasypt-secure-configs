package com.byschoo.jasypt_secure_configs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@SpringBootApplication
@EnableConfigurationProperties(CustomProperties.class)
@EnableEncryptableProperties
public class JasyptSecureConfigsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JasyptSecureConfigsApplication.class, args);
	}

}
