package com.iamdeok.jpa.configuration;

import org.h2.tools.Server;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;


/**
 * @author deoki
 * H2 Database configuration.
 */
@Configuration
public class H2ServerConfiguration {

    @Bean
    @ConfigurationProperties("spring.datasource")
    public DataSource dataSource() throws SQLException {
        Server.createTcpServer("-tcp", "-tcpAllowOthers", "-tcpPort", "9092").start();
        return new com.zaxxer.hikari.HikariDataSource();
    }
}
