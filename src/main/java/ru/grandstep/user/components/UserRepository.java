package ru.grandstep.user.components;

import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

@Configuration
public class UserRepository {
    private final HashMap<String, User> users = new HashMap<>();
    {
        for(int i = 0; i < 100; i++){
            User user = new User();
            users.put(user.getId(), user);
        }
    }
    public void addUser(String firstName, String lastName){
        User user = new User(firstName, lastName);
        users.put(user.getId(), user);
    }
    public void changeUser(String id, String firstName, String lastName){
        users.remove(id);
        addUser(firstName, lastName);
    }
    public void deleteUser(String id){
        users.remove(id);
    }
    public void printUsers(){
        users.forEach((k, v) -> System.out.println(v));
    }
    public void printUser(String id){
        System.out.println(users.get(id));
    }
}
