package com.hms.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.hms.shared.UserDto;

public interface UserService extends UserDetailsService{
    UserDto createUser(UserDto user);
}
