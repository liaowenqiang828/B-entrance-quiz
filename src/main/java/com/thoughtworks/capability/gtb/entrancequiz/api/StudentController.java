package com.thoughtworks.capability.gtb.entrancequiz.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.thoughtworks.capability.gtb.entrancequiz.data.RawData;
import com.thoughtworks.capability.gtb.entrancequiz.domain.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @CrossOrigin
    @GetMapping("/list")
    public ResponseEntity getStudentList() {
        return ResponseEntity.ok(RawData.getStudentList());
    }

    @CrossOrigin
    @PostMapping("/student")
    public ResponseEntity addStudentToList(@RequestBody String student) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Student stu = objectMapper.readValue(student, Student.class);
        RawData.addStudentToList(stu.getName());
        return ResponseEntity.ok().build();
    }
}
