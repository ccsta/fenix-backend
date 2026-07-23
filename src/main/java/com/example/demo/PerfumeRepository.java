package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PerfumeRepository extends JpaRepository<Perfume, Long> {
    // É só isso mesmo! O Spring Boot faz toda a mágica nos bastidores.
}