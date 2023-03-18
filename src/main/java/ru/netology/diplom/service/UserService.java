package ru.netology.diplom.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import ru.netology.diplom.entity.UserEntity;
import ru.netology.diplom.repo.UsersRepository;

import java.util.ArrayList;

@Service
@Slf4j
public class UserService {

    private final UsersRepository usersRepository;

    public UserService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public UserDetails getUserByLogin(String login) {
        UserEntity userEntity = usersRepository.findByLogin(login);
        if (userEntity == null){
            return null;
        }
        return new User(userEntity.getLogin(), userEntity.getPassword(), new ArrayList<>());
    }

    public void addTokenToUser(String login, String token) {
        usersRepository.addTokenToUser(login, token);
    }
}