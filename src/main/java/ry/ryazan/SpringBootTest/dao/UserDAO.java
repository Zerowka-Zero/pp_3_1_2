package ry.ryazan.SpringBootTest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ry.ryazan.SpringBootTest.models.User;

@Repository
public interface UserDAO extends JpaRepository<User, Long> {}
