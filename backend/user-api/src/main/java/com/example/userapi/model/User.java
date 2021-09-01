package com.example.userapi.model;

import com.example.userapi.dto.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String cpf;
    private String address;
    private String email;
    private String phone;
    @Column(name = "register_date")
    private Date registerDate;

    public static User toUser(UserDTO dto) {
        User user = new User();

        user.setName(dto.getName());
        user.setCpf(dto.getCpf());
        user.setAddress(dto.getAddress());
        user.setEmail(dto.getEmail());
        user.setPhone(dto.getPhone());
        user.setRegisterDate(dto.getRegisterDate());

        return user;
    }
}
