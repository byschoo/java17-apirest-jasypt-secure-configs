package com.byschoo.jasypt_secure_configs;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@ConfigurationProperties("pedido")
@Validated
@Data
public class CustomProperties {

    @NotBlank(message = "emailFROM no puede estar vacío")
    private String emailFrom;
    
    @Min(100)
    private String minOrderAmount;
    
    @NotBlank(message = "PayPal User no puede estar vacío")
    private String paypalUser;
    
    @NotBlank(message = "PayPal User no puede estar vacío")
    private String DBpassword;

}
