package com.example.springexampledate.controller;

import com.example.springexampledate.model.ModelDate;
import com.example.springexampledate.model.MyEnum;
import com.example.springexampledate.repo.ModelDateRepository;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
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

    @GetMapping("/date/{date}")
    //@DateTimeFormat передать в строке
    //@JsonFormat отправить в формате json
    public List<ModelDate> findTime(@DateTimeFormat(pattern = "dd:MM:yyyy") @PathVariable Date date){
        return modelDateRepository.findAllBySqlDate(date);
    }

    @GetMapping("/test/{myEnum}")
    public String getMyEnum(@PathVariable MyEnum myEnum) {
        return "Hey " + myEnum;
    }


}
