package com.example.springcrud.controller;

import com.example.springcrud.entity.User;
import com.example.springcrud.service.impl.UserServiceimpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/user")
@Tag(name = "User Management", description = "Operations related to user management") // Swagger Tag
public class UserController {

    @Autowired
    UserServiceimpl usr;

    @GetMapping("/getuser")
    @Operation(summary = "Get all users", description = "Fetch all users from the system")
    public List<User> getall(){
        return usr.getalluser();
    }

    @GetMapping("/getone/{id}")
    @Operation(summary = "Get a user by ID", description = "Fetch a user by their unique ID")
    public User getone(@PathVariable("id") int id){
        return usr.get(id);
    }

    @PostMapping("/adduser")
    @Operation(summary = "Add a new user", description = "Create a new user in the system")
    public String addone(@RequestBody User u){
        usr.adduser(u);
        return "User added successfully";
    }

    @PutMapping("/update/{id}")
    @Operation(summary = "Update a user", description = "Update an existing user's details by ID")
    public String update(@PathVariable("id") int id ,@RequestBody User u){
        usr.updateuser(id,u);
        return "User updated successfully";
    }
}
