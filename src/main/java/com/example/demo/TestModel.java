package com.example.demo;

import java.time.LocalDate;
import java.time.ZonedDateTime;

public class TestModel {
    private String id;
    private ZonedDateTime zonedDateTime;

    @Override
    public String toString() {
        return "TestModel{" +
                "id='" + id + '\'' +
                ", zonedDateTime=" + zonedDateTime +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ZonedDateTime getZonedDateTime() {
        return zonedDateTime;
    }

    public void setZonedDateTime(ZonedDateTime zonedDateTime) {
        this.zonedDateTime = zonedDateTime;
    }
}
