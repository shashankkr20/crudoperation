package com.example.springcrud.service.impl;

import com.example.springcrud.entity.User;
import com.example.springcrud.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class UserServiceimpl{

    private userRepository userrep;
    //constructor injection
//    UserServiceimpl(userRepository u){
//        this.userrep=u;
//    }
    //setter injection
    @Autowired
    public void setUserrep(userRepository u)
    {
        this.userrep=u ;
    }
    public List<User> getalluser(){
        return userrep.findAll();
    }
    public User get(int id){
       User u= userrep.findById(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));
       return u;
    }
    public void adduser(User u){
        userrep.save(u);
    }

    public void updateuser(Integer id, User user) {
        User use=userrep.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"not found"+id));
        use.copy(user);
        userrep.save(use);
    }




}
