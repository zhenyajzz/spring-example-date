package com.example.springexampledate.repo;

import com.example.springexampledate.model.ModelDate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelDateRepository extends JpaRepository<ModelDate,Long> {
}
