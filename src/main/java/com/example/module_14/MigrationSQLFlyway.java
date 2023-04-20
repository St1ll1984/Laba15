package com.example.module_14;

import org.flywaydb.core.Flyway;
import org.springframework.context.annotation.Bean;

public class MigrationSQLFlyway {
    @Bean
    public Flyway flyway() {
        Flyway flyway = Flyway.configure()
                .dataSource("jdbc:h2:./myBaseLaba15", null, null)
                .load();
        flyway.migrate();
        return flyway;
    }
}
