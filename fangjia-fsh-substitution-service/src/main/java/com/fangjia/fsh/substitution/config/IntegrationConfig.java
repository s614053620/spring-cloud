package com.fangjia.fsh.substitution.config;


import com.fangjia.fsh.substitution.mq.HouseProcessor;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

/**
 * Stream配置
 *
 * @author yinjihuan
 * @create 2017-11-30 14:15
 **/
@Configuration
@EnableBinding(HouseProcessor.class)
public class IntegrationConfig {

}
