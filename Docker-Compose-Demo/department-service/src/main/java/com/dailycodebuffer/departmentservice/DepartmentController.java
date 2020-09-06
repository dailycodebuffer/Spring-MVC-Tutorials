package com.dailycodebuffer.departmentservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class DepartmentController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/departments")
    public List<Department> departments() {

        List<Department> departments= new ArrayList<>();
        final String uri = "http://user:8081/api/users";
        List result = restTemplate.getForObject(uri,List.class);  //restTemplate.getForObject(uri, Collection.class);

        for (Object user:result) {
            LinkedHashMap userMap = (LinkedHashMap) user;

            User u = new User(Long.valueOf(userMap.get("id").toString()),
                    String.valueOf(userMap.get("name")),
                    String.valueOf(userMap.get("email")));

            departments.add(new Department(u,"IT","IT-006"));
        }


        return  departments;
    }

}
