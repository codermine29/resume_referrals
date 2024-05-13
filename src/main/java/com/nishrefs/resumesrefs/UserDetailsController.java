package com.nishrefs.resumesrefs;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/resume")
public class UserDetailsController {
    @Autowired
    private UserDetailsService userDetailsService;

    @GetMapping
    public ResponseEntity<List<UserDetails>> allDetails(){
        List<UserDetails> userDetailsList = userDetailsService.getName();
        System.out.println("User details list size: " + userDetailsList.size());
        return new ResponseEntity<>(userDetailsList, HttpStatus.OK);
    }
    @PostMapping()
    public ResponseEntity<List<UserDetails>> createResponse(@RequestBody Map<String, String> payload) {
        // List<UserDetails> userDetailsList = userDetailsService.getName();

        return new ResponseEntity<List<UserDetails>>(userDetailsService.createResponse(payload.get("reviewBody"), payload.get("imdbId")), HttpStatus.OK);
    }
    
}
