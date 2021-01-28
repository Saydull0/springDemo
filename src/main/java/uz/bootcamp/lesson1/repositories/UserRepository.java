package uz.bootcamp.lesson1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.bootcamp.lesson1.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


}
