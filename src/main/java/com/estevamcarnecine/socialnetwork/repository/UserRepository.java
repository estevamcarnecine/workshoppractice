package com.estevamcarnecine.socialnetwork.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.estevamcarnecine.socialnetwork.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
