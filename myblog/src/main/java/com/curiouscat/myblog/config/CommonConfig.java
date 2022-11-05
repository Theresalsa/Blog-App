package com.curiouscat.myblog.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Author: theresa
 * @Date: 11/4/22
 */
@Configuration
public class CommonConfig {

    /**
     * use @Bean to add a third-party library into IOC
     * @return* *
     */

    //"modelmapper" -> new ModelMapper();

    @Bean
    public ModelMapper modelMapper(){return new ModelMapper();} //after adding POM, need to reload maven changes

}
