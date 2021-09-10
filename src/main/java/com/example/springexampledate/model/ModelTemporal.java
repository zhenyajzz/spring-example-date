package com.example.springexampledate.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModelTemporal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.DATE)
    Date publicationDate;

    @Temporal(TemporalType.TIME)
    Date publicationTime;

    @Temporal(TemporalType.TIMESTAMP)
    Date creationDateTime;
}
