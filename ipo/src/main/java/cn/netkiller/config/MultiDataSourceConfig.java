package cn.netkiller.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class MultiDataSourceConfig {

	@Bean
	@Primary
	@ConfigurationProperties("spring.datasource.master")
	public DataSourceProperties firstDataSourceProperties() {
		return new DataSourceProperties();
	}

	@Bean("Master")
	@Primary
	@ConfigurationProperties("spring.datasource.master")
	public DataSource firstDataSource() {
		return firstDataSourceProperties().initializeDataSourceBuilder().build();
	}

	@Bean
	@ConfigurationProperties("spring.datasource.slave")
	public DataSourceProperties secondDataSourceProperties() {
		return new DataSourceProperties();
	}

	@Bean(name = "Slave")
	@ConfigurationProperties("spring.datasource.slave")
	public DataSource secondDataSource() {
		return secondDataSourceProperties().initializeDataSourceBuilder().build();
	}

	@Bean("masterJdbcTemplate")
	@Primary
	public JdbcTemplate primaryJdbcTemplate(@Qualifier("Master") DataSource Master) {
		return new JdbcTemplate(Master);
	}

	@Bean("slaveJdbcTemplate")
	public JdbcTemplate secondJdbcTemplate(@Qualifier("Slave") DataSource Master) {
		return new JdbcTemplate(Master);
	}

}