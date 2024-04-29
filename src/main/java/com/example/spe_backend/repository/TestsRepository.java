package com.example.spe_backend.repository;

import com.example.spe_backend.entities.Tests;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface TestsRepository extends JpaRepository<Tests,Integer> {
}
