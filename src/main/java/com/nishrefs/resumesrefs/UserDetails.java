package com.nishrefs.resumesrefs;

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
    @Id
    private ObjectId id;
    private String name;
    private String lastName;
    private String dob;
    private String phoneNo;
    private String file;
    // private MultipartFile resume;

    
}
