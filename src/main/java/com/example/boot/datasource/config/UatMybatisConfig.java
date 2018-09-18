package com.example.boot.datasource.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * @auther: 彭元具
 * @date: 9/18/2018 09:46
 * @description:
 */
@Configuration
@MapperScan(basePackages = {"com.example.boot.datasource.dao.uat"},sqlSessionTemplateRef = "uatSqlSessionTemplate")
public class UatMybatisConfig {

    @Bean(name = "uatDataSource")
    @ConfigurationProperties(prefix = "second.datasource")
    public DataSource uatDataSource(){
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "uatSqlSessionFactory")
    public SqlSessionFactory uatSqlSessionFactory(@Qualifier("uatDataSource")DataSource dataSource) throws Exception{
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        //添加xml目录
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        try {
            sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:mybatis/uat/*.xml"));
            return sqlSessionFactoryBean.getObject();
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Bean(name = "uatTransactionManager")
    public DataSourceTransactionManager uatDataSourceTransactionManager(@Qualifier("uatDataSource") DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "uatSqlSessionTemplate")
    public SqlSessionTemplate uatSqlSessionTemplate(@Qualifier("uatSqlSessionFactory") SqlSessionFactory sqlSessionFactory){
        SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory);
        return sqlSessionTemplate;
    }
}