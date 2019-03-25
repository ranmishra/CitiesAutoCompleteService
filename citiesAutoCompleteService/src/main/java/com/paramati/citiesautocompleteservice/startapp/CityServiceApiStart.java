
package com.paramati.citiesautocompleteservice.startapp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages={"com.paramati.*"})// same as @Configuration @EnableAutoConfiguration @ComponentScan
@EnableJpaRepositories("com.paramati.citiesautocompleteservice.*")
@EntityScan(basePackages="com.paramati.citiesautocompleteservice.*")
public class CityServiceApiStart {
	public static void main(String[] args) {
			SpringApplication.run(CityServiceApiStart.class, args);
	}
}
