package ry.ryazan.SpringBootTest.service;

import ry.ryazan.SpringBootTest.models.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    void save(User user);
    User findOne(Long id);
    void update(User user);
    void delete(Long id);
}
