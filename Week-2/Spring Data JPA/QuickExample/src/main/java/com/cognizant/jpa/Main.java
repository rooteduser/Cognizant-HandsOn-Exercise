package com.cognizant.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@Entity
class Country {
    @Id
    private String code;
    private String name;

    public Country() {}
    public Country(String code, String name) {
        this.code = code;
        this.name = name;
    }
    public String getCode() { return code; }
    public String getName() { return name; }
    public void setCode(String code) { this.code = code; }
    public void setName(String name) { this.name = name; }
}

@Repository
interface CountryRepository extends JpaRepository<Country, String> {
}

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    public CommandLineRunner demo(CountryRepository repository) {
        return (args) -> {
            repository.save(new Country("IN", "India"));
            repository.save(new Country("US", "United States"));
            
            System.out.println("Countries found with findAll():");
            repository.findAll().forEach(c -> System.out.println(c.getCode() + " - " + c.getName()));
        };
    }
}
