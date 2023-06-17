package com.spring.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.dao.impl.StudentDaoImpl;

@Configuration
@ComponentScan(basePackages = { "com.spring.dao.impl" })
public class JavaConfig {

	@Bean("ds")
	public DataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("org.postgresql.Driver");
		ds.setUrl("jdbc:postgresql://localhost:5432/springJdbc");
		ds.setUsername("postgres");
		ds.setPassword("test123");
		return ds;

	}

	@Bean(name = { "jdbcTemplate" })
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}

//	@Bean("student")
//	public StudentDaoImpl getStudentDao() {
//		StudentDaoImpl studentDaoImpl = new StudentDaoImpl();
//		studentDaoImpl.setJdbcTemplate(getJdbcTemplate());
//		return studentDaoImpl;
//	}

}
