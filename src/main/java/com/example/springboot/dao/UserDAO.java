package com.example.springboot.dao;

import com.example.springboot.domain.UserDTO;

import java.util.List;

public interface UserDAO {
    List<UserDTO> selectUsers(UserDTO param) throws Exception;
}
