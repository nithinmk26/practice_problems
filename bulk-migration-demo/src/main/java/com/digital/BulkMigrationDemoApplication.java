package com.digital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.digital.migrator.BulkMigrator;

@SpringBootApplication
public class BulkMigrationDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BulkMigrationDemoApplication.class, args);
		new BulkMigrator().migrateLargeFromCSVtoDB();
	}

}
