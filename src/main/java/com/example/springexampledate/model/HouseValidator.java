package com.example.springexampledate.model;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HouseValidator implements ConstraintValidator<House1,String> {
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (s.length()>5){
            return true;
        }
        else
            return false;
    }
}
