package com.neusoft.redbag;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTests {
    @Autowired
    private UserRepository repository;

    @Test
    public void save() {
        User user = new User();
        user.setUsername("小子");
        user.setPassword("123");
        user.setEmail("145659995");
        repository.save(user);
    }

    @Test
    public void Update() {
        User user = new User();
        user.setId("8a04ae2f75febb0a0175febb14ae0000");
        user.setUsername("哈哈");
        user.setPassword("2009");
        repository.save(user);
    }

    @Test
    public void delete() {
        String id = "8a04083b75fef0d60175fef0e19c0000";
        repository.deleteById(id);
    }

    @Test
    public void findById() {
        String id = "8a04ae2f75febb0a0175febb14ae0000";
        Optional<User> optional = repository.findById(id);
        User user = optional.get();
        System.out.println(user);
    }
    @Test
    public void findAll() {
        List<User> list = repository.findAll();
        for (User u : list) {
            System.out.println(u);
        }
    }
}
