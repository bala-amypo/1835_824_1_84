package com.example.demo.service.impl;
import com.example.demo.repository.UserRepository;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class UserServiceImpl implements UserService{

@Autowired
UserRepository ur;
public User createUser(User spa){

    return spr.save(spa);
}


}