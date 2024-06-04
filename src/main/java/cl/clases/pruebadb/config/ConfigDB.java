package cl.clases.pruebadb.config;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class ConfigDB {

	@Bean
	public DataSource dataSource() {
        DriverManagerDataSource dataSourceBuilder = new DriverManagerDataSource();
        dataSourceBuilder.setUrl("jdbc:mysql://localhost:3306/pruebadb");
        dataSourceBuilder.setUsername("root");
        dataSourceBuilder.setPassword("");
        dataSourceBuilder.setDriverClassName("com.mysql.cj.jdbc.Driver");
        return dataSourceBuilder;
		
	}
}
