package co.develhope.DClinic.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DClinicController {

    @GetMapping
    public String returnClinicName(){
        return "D-Clinic";
    }
}
