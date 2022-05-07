package com.wipro.Epassport.Controller;

import com.wipro.Epassport.Entity.Epassport;
import com.wipro.Epassport.Service.EpassportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EpassportController {
    @Autowired
    private EpassportService service;
    @PostMapping("/Epassport_registration")
    public String epassportRegistration(@RequestBody Epassport epassport)
    {
        service.epassportRegistration(epassport);
        return "registered successfully";
    }
}
