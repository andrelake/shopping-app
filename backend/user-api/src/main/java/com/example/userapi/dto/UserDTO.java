package com.example.userapi.dto;

import com.example.userapi.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDTO {

    private String name;
    private String cpf;
    private String address;
    private String email;
    private String phone;
    private Date registerDate;

    public static UserDTO toDTO(User user) {
        UserDTO dto = new UserDTO();

        dto.setName(user.getName());
        dto.setCpf(user.getCpf());
        dto.setAddress(user.getAddress());
        dto.setEmail(user.getEmail());
        dto.setPhone(user.getPhone());
        dto.setRegisterDate(user.getRegisterDate());

        return dto;
    }
}
