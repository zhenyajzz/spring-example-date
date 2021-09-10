package com.example.springexampledate.repo;

import com.example.springexampledate.model.ModelDate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface ModelDateRepository extends JpaRepository<ModelDate,Long> {

    List<ModelDate> findAllBySqlDate(Date date);
}
