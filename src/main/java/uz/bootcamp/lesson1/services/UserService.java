package uz.bootcamp.lesson1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.bootcamp.lesson1.entities.User;
import uz.bootcamp.lesson1.repositories.UserRepository;

import java.util.List;

@Service
public class UserService {

    final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public List<User> getAllUser(){
        return userRepository.findAll();
    }
}
