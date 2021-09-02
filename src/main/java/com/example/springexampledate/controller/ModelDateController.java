package com.example.springexampledate.controller;

import com.example.springexampledate.model.ModelDate;
import com.example.springexampledate.repo.ModelDateRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ModelDateController {

    final
    ModelDateRepository modelDateRepository;

    public ModelDateController(ModelDateRepository modelDateRepository) {
        this.modelDateRepository = modelDateRepository;
    }

    @GetMapping("/date")
    public List<ModelDate> findDates(){
        return modelDateRepository.findAll();
    }

    @PostMapping("/date")
    public ModelDate createDate(@RequestBody ModelDate modelDate){
        return modelDateRepository.save(modelDate);
    }
}
