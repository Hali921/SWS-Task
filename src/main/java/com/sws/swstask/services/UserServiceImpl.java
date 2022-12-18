package com.sws.swstask.services;

import com.sws.swstask.forms.UserForm;
import com.sws.swstask.models.User;
import com.sws.swstask.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Override
    public void addUser(UserForm form) {
        User user = new User(form.getLastName(), form.getFirstName(), form.getPatronymic(), form.getEmail(), form.getPhoneNumber());
        userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
