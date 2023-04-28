package com.kyhslam.userservice.service;

import com.kyhslam.userservice.dto.UserDto;
import com.kyhslam.userservice.jpa.UserEntity;

public interface UserService {
    UserDto createUser(UserDto userDto);

    UserDto getUserByUserId(String userId);

    Iterable<UserEntity> getUserByAll();
}
