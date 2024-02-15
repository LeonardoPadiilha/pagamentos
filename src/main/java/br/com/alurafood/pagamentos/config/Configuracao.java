package br.com.alurafood.pagamentos.config;

import org.modelmapper.ModelMapper;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuracao {

    @Bean
    public ModelMapper obterModelMapper(){
        return new ModelMapper();
    }
}
