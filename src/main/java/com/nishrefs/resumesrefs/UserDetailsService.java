package com.nishrefs.resumesrefs;

import java.io.File;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.VariableOperators.Map;
import org.springframework.stereotype.Service;
@Service
public class UserDetailsService {
    @Autowired
    private MongoTemplate mongoTemplate;
    @Autowired
    private ResumeRepository resumeRepository;
    public List<UserDetails> getName(){
        return resumeRepository.findAll();
    }
    public UserDetails createResponse(String name, String lastName,String dob,String phoneNo,File file) {
        UserDetails userDetails = resumeRepository.insert(new UserDetails(name,lastName,dob,phoneNo,file));

        mongoTemplate.update(UserDetails.class);
        return userDetails;
    }
    
}
