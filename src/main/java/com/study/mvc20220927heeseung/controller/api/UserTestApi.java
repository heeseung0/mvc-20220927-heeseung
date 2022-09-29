package com.study.mvc20220927heeseung.controller.api;

import com.study.mvc20220927heeseung.dto.UserReqDto;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
public class UserTestApi {

    @ResponseBody
    @PostMapping("/api/test/user/param")
    public String addUserParam(@RequestParam String username,
                               @RequestParam String password,
                               @RequestParam String name,
                               @RequestParam String email) {
        Map<String, String> postMap = new LinkedHashMap<String, String>();

        postMap.put("username", username);
        postMap.put("password", password);
        postMap.put("name", name);
        postMap.put("email", email);

        return postMap.toString();
    }

    @ResponseBody
    @PostMapping("/api/test/user/dto")
    public UserReqDto addUserDto(UserReqDto dto) {
        return dto;
        /*
        Map<String, String> postMap = new LinkedHashMap<String, String>();

        postMap.put("username", dto.getUsername());
        postMap.put("password", dto.getPassword());
        postMap.put("name", dto.getName());
        postMap.put("email", dto.getEmail());

        return postMap.toString();
         */
    }

    @ResponseBody
    @PostMapping("/api/test/user/json")
    public Object addUserJSON(@RequestBody UserReqDto dto) {
        List<Map<Integer, UserReqDto>> list = new ArrayList<Map<Integer, UserReqDto>>();
        Map<Integer, UserReqDto> map = null;

        for (int i = 0; i < 100; i++) {
            if (i == 0 || i % 10 == 0) {
                map = new TreeMap<Integer, UserReqDto>();
            }

            map.put(i + 1, dto);

            if ((i - 9) % 10 == 0) {
                list.add(map);
            }
        }

        return list;
    }
}
