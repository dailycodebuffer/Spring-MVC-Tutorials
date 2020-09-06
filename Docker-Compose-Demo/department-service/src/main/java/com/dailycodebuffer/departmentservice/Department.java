package com.dailycodebuffer.departmentservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    private User user;
    private String departmentName;
    private String departmentCode;
}
