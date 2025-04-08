package org.wqz;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(ThreadPoolProperties.class)
public class ThreadPoolAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public ThreadPoolService threadPoolService(ThreadPoolProperties properties) {
        return new ThreadPoolService(properties);
    }
}