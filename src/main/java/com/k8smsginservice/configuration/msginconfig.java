/**
 * 
 */
package com.k8smsginservice.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 
 */
@Configuration
public class msginconfig {

    @Bean
    public ModelMapper modelMapperBean() {
        return new ModelMapper();
    }
	
} // End of msginconfig
