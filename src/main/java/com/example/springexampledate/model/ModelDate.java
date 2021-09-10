package com.example.springexampledate.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModelDate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonFormat(pattern = "HH:mm:ss")
    private java.sql.Time sqlTime;

    @JsonFormat(pattern = "dd:MM:yyyy")
    @Temporal(TemporalType.DATE)
    private java.util.Date sqlDate;

    @JsonFormat(pattern = "dd:MM:yyyy HH:mm:ss")
    private java.sql.Timestamp sqlTimestamp;

    @Enumerated(EnumType.STRING)
    private MyEnum myEnum;

    @Enumerated(EnumType.ORDINAL)
    private MyEnum myEnum1;

}
