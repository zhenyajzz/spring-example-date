package com.example.springexampledate.controller;

import com.example.springexampledate.model.House;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Max;

@RestController
@RequestMapping("/house")
@Validated
public class HouseController {

    @PostMapping("/{id}")
    public House houseValidate(@Valid @RequestBody House house,
                               @PathVariable @Max(value = 10) Long id){
        return house;
    }
}
