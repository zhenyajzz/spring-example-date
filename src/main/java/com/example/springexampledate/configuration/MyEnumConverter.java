package com.example.springexampledate.configuration;

import com.example.springexampledate.model.MyEnum;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class MyEnumConverter implements Converter<String, MyEnum> {

    @Override
    public MyEnum convert(String value) {
        return MyEnum.valueOf(value.toUpperCase());
    }
}