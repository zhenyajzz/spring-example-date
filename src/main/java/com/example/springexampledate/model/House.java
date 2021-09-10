package com.example.springexampledate.model;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class House {

    private Long id;

    @NotNull
    @NotBlank
    @Size(min = 4, max = 10)
    @House1(message = "My message:")
    private String name;

    @Max(value = 10)
    private Long number;
}
