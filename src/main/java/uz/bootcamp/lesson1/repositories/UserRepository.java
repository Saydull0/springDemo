package uz.bootcamp.lesson1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import uz.bootcamp.lesson1.entities.User;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username); // select * from user where username="string"

    List<User> findAllByAge(Integer age); // select * from user where age=3;




}
