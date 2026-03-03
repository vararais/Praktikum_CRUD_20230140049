package com.example.praktikum1.controller;

import com.example.praktikum1.model.dto.UserAddRequest;
import com.example.praktikum1.model.dto.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@GetMapping(
        path = "/api/users/{id}",
        produces = MediaType.APPLICATION_JSON_VALUE
)
public ResponseEntity<Map<String, Object>> getUserById(@PathVariable("id") String id){
    UserDto result = userService.getUserById(id);
    return ResponseEntity.status(HttpStatus.OK).body(Map.of(
            "status", "success",
            "data", result
    ));
}

@PutMapping(
        path = "/api/users/{id}",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE
)
public ResponseEntity<Map<String, Object>> UpdateUser(
        @PathVariable("id") String id,
        @RequestBody UserAddRequest request
) {
    UserDto result = userService.updateUser(id, request);
    return ResponseEntity.status(HttpStatus.OK).body(Map.of(
            "status", "success",
            "data", result
    ));
}

@DeleteMapping(
        path = "/api/users/{id}",
        produces = MediaType.APPLICATION_JSON_VALUE
)
public ResponseEntity<Map<String, Object>> DeleteUser(@PathVariable("id") String id) {
    userService.deleteUser(id);
    return ResponseEntity.status(HttpStatus.OK).body(Map.of(
            "status", "success delete user with id " + id
    ));
}