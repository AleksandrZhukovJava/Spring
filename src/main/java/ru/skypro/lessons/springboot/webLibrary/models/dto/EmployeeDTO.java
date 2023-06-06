package ru.skypro.lessons.springboot.webLibrary.models.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO implements Serializable {
    private Integer id;
    private String name;
    private double salary;
    private PositionDTO position;
}
