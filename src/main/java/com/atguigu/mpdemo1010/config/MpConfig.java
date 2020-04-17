package com.atguigu.mpdemo1010.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;

@Configuration
@MapperScan("com.atguigu.mpdemo1010.mapper")
public class MpConfig {
    //乐观锁插件
    @Bean
    public OptimisticLockerInterceptor optimisticLockerInterceptor() {
        return new OptimisticLockerInterceptor();
    }
}
