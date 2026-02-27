package com.estevamcarnecine.workshoppractice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.estevamcarnecine.workshoppractice.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
