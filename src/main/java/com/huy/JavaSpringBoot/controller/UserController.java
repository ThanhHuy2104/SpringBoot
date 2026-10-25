package com.huy.JavaSpringBoot.controller;

import com.huy.JavaSpringBoot.dto.request.UserRequestDTO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @PostMapping("/")
    public String addUser(@Valid @RequestBody UserRequestDTO userDTO) {
        return "User added";
    }

    @PutMapping("/{userId}")
    public String updateUser(@PathVariable int userId, @RequestBody UserRequestDTO userDTO) {
        System.out.println("Request update userId: " + userId);
        return "User updated";
    }

    @PatchMapping("/{userId}")
    public String changeStatus(@PathVariable int userId, @RequestParam boolean status) {
        System.out.println("Request change user stauts, userID: " + userId);
        return "User Changed";
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@Min(1) @PathVariable int userId) {
        System.out.println("Request delete user, userId: " + userId);
        return "User Deleted";
    }

    @GetMapping("/{userId}")
    public UserRequestDTO getUser(@PathVariable int userId) {
        System.out.println("Request get user detail by userId: " + userId);
        return new UserRequestDTO("Huy", "Huynh", "123131", "huy");
    }

    @GetMapping("/list")
    public List<UserRequestDTO> getAllUsers(
            @RequestParam(required = false) String email,
            @RequestParam(defaultValue = "0") int pageNo,
            @RequestParam(defaultValue = "10") int pageSize
    ) {
        System.out.println("Request get user list");
        return List.of(new UserRequestDTO("Huy", "Huynh", "123131", "huy"),
                new UserRequestDTO("Huy", "Huynh", "123131", "huy"));
    }
}
