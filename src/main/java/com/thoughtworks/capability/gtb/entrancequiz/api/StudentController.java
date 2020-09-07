package com.thoughtworks.capability.gtb.entrancequiz.api;

import com.thoughtworks.capability.gtb.entrancequiz.data.RawData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @CrossOrigin
    @GetMapping("/list")
    public ResponseEntity getStudentList() {
        return ResponseEntity.ok(RawData.getStudentList());
    }
}
