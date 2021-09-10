package com.example.springexampledate.controller;

import com.example.springexampledate.model.ModelTemporal;
import com.example.springexampledate.repo.ModelTemporalRepository;
import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@RestController
public class ModelTemporalController {

    final
    ModelTemporalRepository modelTemporalRepository;

    public ModelTemporalController(ModelTemporalRepository modelTemporalRepository) {
        this.modelTemporalRepository = modelTemporalRepository;
    }

    @GetMapping("/temporal")
    public List<ModelTemporal> findTemporal(){
        return modelTemporalRepository.findAll();
    }

    @PostMapping("/temporal")
    public Time createTemporal(@DateTimeFormat(pattern = "HH:mm:ss")@RequestBody Time modelTemporal){
        return modelTemporal;
    }

}