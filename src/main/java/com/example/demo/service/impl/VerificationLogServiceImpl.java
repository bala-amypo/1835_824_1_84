package com.example.demo.service.impl;
import com.example.demo.repository.VerificationLogRepository;
import com.example.demo.entity.VerificationLog;
import com.example.demo.service.VerificationLogService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class UserServiceImpl implements UserService{

@Autowired
UserRepository ur;
public User createUser(User u){

    return ur.save(u);
}


}