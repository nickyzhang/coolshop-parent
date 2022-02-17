package com.coolshop.base.generator.config;

import com.robert.vesta.service.impl.IdServiceImpl;
import com.robert.vesta.service.impl.provider.PropertyMachineIdProvider;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:vesta-service.properties")
public class IdGeneratorConfig {

    @Autowired
    Environment environment;

    @Bean
    public IdServiceImpl idService(){
        IdServiceImpl idService = new IdServiceImpl();
        idService.setMachineIdProvider(propertyMachineIdProvider());
        idService.init();
        return idService;
    }

    @Bean
    public PropertyMachineIdProvider propertyMachineIdProvider() {
        PropertyMachineIdProvider machineIdProvider = new PropertyMachineIdProvider();
        String machineCount = environment.getProperty("vesta.machine");
        if (StringUtils.isBlank(machineCount)) {
            machineIdProvider.setMachineId(1L);
            return machineIdProvider;
        }
        machineIdProvider.setMachineId(Long.valueOf(machineCount));
        return machineIdProvider;
    }

}
