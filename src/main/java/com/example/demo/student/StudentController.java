package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController //This makes the DemoApplication class serve as rest endpoints
@RequestMapping(path = "api/v1/student")
public class StudentController {

    @GetMapping //makes hello() the GET endpoint
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Abhinav",
                        "agarwalabhinav9@gmail.com",
                        LocalDate.of(2000, Month.JULY,4),
                        20

                )
        );
    }
}
