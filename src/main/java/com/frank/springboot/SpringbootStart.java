package com.frank.springboot;

import com.frank.springboot.duridConfig.DruidConfig;
import com.frank.springboot.duridConfig.DruidDataSourceProperty;
import lombok.experimental.FieldNameConstants;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Package: com.frank.springboot
 * @ClassName: SpringbootStart
 * @Author Frank
 * @Data 2022-03-15-10:12
 * @Description:
 */
@EnableAspectJAutoProxy(proxyTargetClass = true)
@SpringBootApplication(scanBasePackages = {"com.frank.springboot"},exclude =  {DataSourceAutoConfiguration.class})
@ServletComponentScan(basePackages = {"com.frank.springboot"})
@MapperScan("com.frank.springboot.dao")
@EnableConfigurationProperties(DruidDataSourceProperty.class)
public class SpringbootStart {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootStart.class,args);
    }
}
