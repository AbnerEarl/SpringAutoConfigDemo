package com.example.demo.config;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.ycj.fastframe.springconfig.*;
import com.ycj.fastframe.springconfig.annotation.AutoLoadConfiguration;
import com.ycj.fastframe.springconfig.bean.DataBase;
import com.ycj.fastframe.springconfig.bean.Httpclient;
import com.ycj.fastframe.springconfig.bean.RabbitMQ;
import com.ycj.fastframe.springconfig.bean.Redis;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author: Frank
 * @email 1320259466@qq.com
 * @date: 2020/3/5
 * @time: 11:29
 * @fuction: about the role of class.
 */

@AutoLoadConfiguration
public class MyProjectConfiguration extends ProjectConfiguration {
    @Override
    public String basePackagePathForMybatis() {
        return "com.example.demo.mapper";
    }

    @Override
    public String typeAliasesPackagePathForMybatis() {
        return "com.example.demo.entity";
    }

    @Override
    public String rootPathForLog4j() {
        return "E:/IdeaProjects/LearningProjects";
    }

    @Override
    public DataBase dataBaseConfigInfo() {
                DataBase dataBase=new DataBase(
                "jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=utf8&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
                "root",
                "wdsjnsjydjy");
        return dataBase;
    }

    @Override
    public Redis redisConfigInfo() {
        return new Redis();
    }

    @Override
    public Httpclient httpclientConfigInfo() {
        return new Httpclient();
    }

    @Override
    public RabbitMQ rabbitMQConfigInfo() {
        return new RabbitMQ();
    }

    @Override
    public ApplicationConfig applicationConfigForDubbo() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("user-provider");
        return applicationConfig;
    }

    @Override
    public RegistryConfig registryConfigForDubbo() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setProtocol("zookeeper");
        registryConfig.setAddress("127.0.0.1:2181");
        return registryConfig;
    }


    @Override
    public InternalResourceViewResolver defaultViewResolver() {
        return new InternalResourceViewResolver();
    }
}
