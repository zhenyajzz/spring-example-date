package com.example.springexampledate.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Time;
import java.sql.Timestamp;

@Entity
public class ModelDate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonFormat(pattern = "HH:mm:ss")

    private java.sql.Time sqlTime;

    @JsonFormat(pattern = "DD:MM:yyyy")
    private java.sql.Date sqlDate;

    @JsonFormat(pattern = "DD:MM:yyyy HH:mm:ss")
    private java.sql.Timestamp sqlTimestamp;


    public ModelDate() {
    }

    public ModelDate(Long id, Time sqlTime, java.sql.Date sqlDate, Timestamp sqlTimestamp) {
        this.id = id;
        this.sqlTime = sqlTime;
        this.sqlDate = sqlDate;
        this.sqlTimestamp = sqlTimestamp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Time getSqlTime() {
        return sqlTime;
    }

    public void setSqlTime(Time sqlTime) {
        this.sqlTime = sqlTime;
    }

    public java.sql.Date getSqlDate() {
        return sqlDate;
    }

    public void setSqlDate(java.sql.Date sqlDate) {
        this.sqlDate = sqlDate;
    }

    public Timestamp getSqlTimestamp() {
        return sqlTimestamp;
    }

    public void setSqlTimestamp(Timestamp sqlTimestamp) {
        this.sqlTimestamp = sqlTimestamp;
    }
}
