package uz.bootcamp.lesson1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.bootcamp.lesson1.entities.User;
import uz.bootcamp.lesson1.repositories.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public List<User> getAllUser(){
        return userRepository.findAll();
    }

    public String getOneUser(String username){
        Optional<User> optionalUser = userRepository.findByUsername(username);

        if(optionalUser.isPresent()){
            return optionalUser.get().toString();
        }else{
            return "User Not Found";
        }
    }

    public void newUser(User user) {

        Optional<User> optionalUser = userRepository.findByUsername(user.getUsername());

        if(optionalUser.isPresent()){
            optionalUser.get().setAge(user.getAge());
            optionalUser.get().setEmail(user.getEmail());
            optionalUser.get().setFirstName(user.getFirstName());
            optionalUser.get().setLastName(user.getLastName());
            userRepository.save(optionalUser.get());
        }else{
            userRepository.save(user);
        }

    }

    public String deleteUser(Long id) {

        Optional<User> optionalUser = userRepository.findById(id);

        if(optionalUser.isPresent()){
            String username = optionalUser.get().getUsername();
            userRepository.delete(optionalUser.get());
            return username + " deleted !" ;
        }else{
            return "User not found";
        }

    }

    public List<User> getUserByAge(Integer age) {

        List userList = userRepository.findAllByAge(age);

        return userList;
    }
}
