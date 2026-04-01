package com.estevamcarnecine.socialnetwork.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.estevamcarnecine.socialnetwork.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}
