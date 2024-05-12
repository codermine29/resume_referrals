package com.nishrefs.resumesrefs;

import java.util.List;

import org.bson.types.ObjectId;
import org.slf4j.LoggerFactory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ResumeRepository extends MongoRepository<UserDetails,ObjectId>{
    org.slf4j.Logger logger = LoggerFactory.getLogger(ResumeRepository.class);

    @Override
    List<UserDetails> findAll();

    default List<UserDetails> getAllUserDetails() {
        List<UserDetails> userDetailsList = findAll();
        logger.info("Retrieved {} user details from the database", userDetailsList.size());
        return userDetailsList;
    }
    
}
