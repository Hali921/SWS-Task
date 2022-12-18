package com.sws.swstask.services;

import com.sws.swstask.forms.UserForm;
import com.sws.swstask.models.User;

import java.util.List;

public interface UserService {

    void addUser(UserForm form);

    List<User> getAllUsers();
}
