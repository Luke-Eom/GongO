package gongo.gongo.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

    // Page Config
    // @Bean
    // public PageableArgumentResolverCustomizer customize() {
        
    //     return p -> p.setOneIndexedParameter(true);
    // }
}