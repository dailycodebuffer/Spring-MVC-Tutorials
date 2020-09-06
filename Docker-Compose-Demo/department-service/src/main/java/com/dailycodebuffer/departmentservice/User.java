package com.dailycodebuffer.departmentservice;

import lombok.*;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class User {

    private  Long id;

    @NonNull
    private String name;

    private String email;
}