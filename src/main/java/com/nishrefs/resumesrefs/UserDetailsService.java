package com.nishrefs.resumesrefs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserDetailsService {
    @Autowired
    private ResumeRepository resumeRepository;
    public List<UserDetails> getName(){
        return resumeRepository.findAll();
    }
    
}
