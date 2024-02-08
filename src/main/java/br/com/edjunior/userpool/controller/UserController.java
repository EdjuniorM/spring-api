package br.com.edjunior.userpool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.edjunior.userpool.dto.UserDTO;
import br.com.edjunior.userpool.services.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    
    @Autowired
    private UserService userService;
    

    @GetMapping
    public List<UserDTO> listAll(){
        return userService.listAll();
    }

    @GetMapping("/{id}")
    public UserDTO findById(@PathVariable("id") Long id){
        return userService.findById(id);
    }

    @PostMapping
    public void create(@RequestBody UserDTO user) {
        userService.create(user);
    }

    @PutMapping
    public UserDTO update(@RequestBody UserDTO user) {
        return userService.update(user);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        userService.delete(id);
        return ResponseEntity.ok().build();
    }



}
