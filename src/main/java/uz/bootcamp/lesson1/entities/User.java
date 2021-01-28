package uz.bootcamp.lesson1.entities;

import javax.persistence.*;

@Entity
@Table(name="sys_user")
public class User {

    @Transient
    static final String sequence = "sys_user_id_seq";

    @Id
    @SequenceGenerator(name= sequence, sequenceName = sequence, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = sequence)
    private Long id;

    private String username;

    private String firstName;
    private String lastName;
    private String email;
    private Integer age;


    public User() {
    }

    public User(Long id, String username, String firstName, String lastName, String email, Integer age) {
        this.id = id;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
