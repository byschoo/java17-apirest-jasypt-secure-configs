package com.byschoo.jasypt_secure_configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerPedido {

    @Autowired
    CustomProperties customProperties;

    @GetMapping("/configprops")
    private CustomProperties getCustomProperties() {
        return customProperties;
    }

}
