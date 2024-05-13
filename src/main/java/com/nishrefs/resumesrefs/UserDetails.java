package com.nishrefs.resumesrefs;

import java.io.File;
import java.time.LocalDateTime;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "userDetails")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDetails {
    public UserDetails(String name, String lastName, String dob, String phoneNo,File file) {
        this.name = name;
        this.lastName = lastName;
        this.dob = dob;
        this.phoneNo = phoneNo;
        this.file = file;
    }
    @Id
    private ObjectId id;
    private String name;
    private String lastName;
    private String dob;
    private String phoneNo;
    private File file;
    // private MultipartFile resume;

    
}
