package com.virtusa.creditcard.app.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@PropertySource("classpath:db.properties")
@EnableTransactionManagement
public class DBConfiguration {
	
	@Value("${db.username}")
	private String username;
	
	@Value("${db.password}")
	private String password;
	
	@Value("${hibernate.dialect}")
	private String hDialect;
	
	@Value("${hibernate.show_sql}")
	private String hShowSQL;
	
	@Value("${hibernate.hbm2ddl.auto}")
	private String hAutoUpdate;
	
	@Value("${entitymanager.packagesToScan}")
	private String hPackageScan;

	@Value("${db.url}")
	private String dbUrl;
	
	@Value("${db.driver}")
	private String dbDriver;
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(dbDriver);
		dataSource.setUrl(dbUrl);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		return dataSource;
	}
	
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setPackagesToScan(hPackageScan);
		Properties hibernateProperties = new Properties();
		hibernateProperties.put("hibernate.dialect", hDialect);
		hibernateProperties.put("hibernate.show_sql", hShowSQL);
		hibernateProperties.put("hibernate.enable_lazy_load_no_trans",true);
		hibernateProperties.put("hibernate.hbm2ddl.auto", hAutoUpdate);
		sessionFactory.setHibernateProperties(hibernateProperties);
		return sessionFactory;
	}
	
	@Bean
	public HibernateTransactionManager transactionManager() {
		HibernateTransactionManager txManager = new HibernateTransactionManager();
		txManager.setSessionFactory(sessionFactory().getObject());
		return txManager;
	}

	
}
