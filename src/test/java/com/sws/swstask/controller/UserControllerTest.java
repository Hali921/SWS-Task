package com.sws.swstask.controller;

import com.sws.swstask.forms.UserForm;
import com.sws.swstask.models.User;
import com.sws.swstask.services.UserServiceImpl;
import jakarta.servlet.ServletContext;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.request.RequestPostProcessor;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


import java.util.Arrays;



@WebMvcTest
class UserControllerTest {

    @MockBean
    private UserServiceImpl userService;
    @Autowired
    private MockMvc mockMvc;

    @Test
    void getUsersPageTest() throws Exception {
        User user1 = new User("Ivanov", "Ivan", "Ivanovich", "email", "phone");
        User user2 = new User("Petrov", "Petr", "Petrovnch", "email", "phone");
        user1.setId(1);
        user2.setId(2);
        Mockito.when(userService.getAllUsers()).thenReturn(Arrays.asList(user1, user2));

        mockMvc.perform(MockMvcRequestBuilders.get("/users"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().attribute("users", userService.getAllUsers()))
                .andDo(MockMvcResultHandlers.print());
    }

    @Test
    void addUser() throws Exception {
        UserForm userForm = new UserForm("Ivanov", "Ivan", "Ivanovich", "email", "phone");

        Mockito.doNothing().when(userService).addUser(userForm);

        mockMvc.perform(MockMvcRequestBuilders.post("/adduser")
                .content(userForm.toString()))
                .andExpect(MockMvcResultMatchers.status().isCreated())
                .andExpect(MockMvcResultMatchers.content().contentType(userForm.toString()))
                .andExpect(MockMvcResultMatchers.redirectedUrl("/users"));
        Mockito.verify(userService,Mockito.times(1)).addUser(userForm);


    }
}