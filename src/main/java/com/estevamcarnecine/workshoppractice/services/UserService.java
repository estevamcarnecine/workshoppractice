package com.estevamcarnecine.workshoppractice.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.estevamcarnecine.workshoppractice.domain.User;
import com.estevamcarnecine.workshoppractice.repository.UserRepository;
import com.estevamcarnecine.workshoppractice.services.exception.ObjectNotFoundException;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;
    
    public List<User> findAll() {
        return repo.findAll();
    }
    
    public User findById(String Id) {
    	User user = repo.findOne(id);
    	If (user == null) {
    		throw new ObjectNotFoundException("Objeto não encontrado!);
    	}
    	return user;
    }
}