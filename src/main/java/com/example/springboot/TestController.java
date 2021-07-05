package com.example.springboot;

import com.example.springboot.dao.UserDAO;
import com.example.springboot.domain.UserDTO;
import lombok.AllArgsConstructor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@MapperScan(basePackages = "com.example.springboot.domain")
public class TestController {
    private final UserDAO userDAO;

    @RequestMapping("/")
    public List<UserDTO> users(@RequestParam(value = "id", defaultValue = "name")String passwd) throws Exception{
        final UserDTO param = new UserDTO(null, null, passwd);
        final List<UserDTO> userList = userDAO.selectUsers(param);

        return userList;
    }
}
