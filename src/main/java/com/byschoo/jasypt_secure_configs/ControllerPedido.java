package com.byschoo.jasypt_secure_configs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerPedido {

    private final CustomProperties customProperties;

    public ControllerPedido(CustomProperties customProperties) {
        this.customProperties = customProperties;
    }

    @GetMapping("/configprops")
    private CustomProperties getCustomProperties() {
        return customProperties;
    }

}
