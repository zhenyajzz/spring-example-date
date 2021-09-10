package com.example.springexampledate.repo;

import com.example.springexampledate.model.ModelTemporal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelTemporalRepository extends JpaRepository<ModelTemporal,Long> {
}
