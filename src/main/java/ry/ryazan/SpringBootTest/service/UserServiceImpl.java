package ry.ryazan.SpringBootTest.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ry.ryazan.SpringBootTest.dao.UserDAO;
import ry.ryazan.SpringBootTest.models.User;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService{
    private final UserDAO userDao;
    public UserServiceImpl(UserDAO userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
    @Override
    public User findOne(Long id) {
        return userDao.findById(id).orElse(new User());
    }
    @Transactional
    @Override
    public void save(User user) {
        userDao.save(user);
    }
    @Transactional
    @Override
    public void update(User user) {
        userDao.save(user);
    }
    @Transactional
    @Override
    public void delete(Long id) {
        userDao.deleteById(id);
    }
}
