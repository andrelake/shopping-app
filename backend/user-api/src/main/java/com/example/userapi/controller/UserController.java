package com.example.userapi.controller;

import com.example.userapi.dto.UserDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    public static List<UserDTO> userList = new ArrayList<>();

    @PostConstruct
    public void initiateList() {
        UserDTO user1 = new UserDTO("Joao", "11122233344", "Rua x", "joao@gmail.com", "14999999999", new Date());
        UserDTO user2 = new UserDTO("Pedro", "55566677788", "Rua y", "pedro@gmail.com", "14988888888", new Date());
        UserDTO user3 = new UserDTO("Maria", "12312312312", "Rua z", "maria@gmail.com", "14977777777", new Date());

        userList = Arrays.asList(user1, user2, user3);
    }

    @GetMapping
    public List<UserDTO> getUsers() {
        return userList;
    }

    @GetMapping("/{cpf}")
    public UserDTO getUser(@PathVariable String cpf) throws Exception {

        for (UserDTO user:userList) {
            if(user.getCpf().equals(cpf))
                return user;
        }
        return null;
    }
}
