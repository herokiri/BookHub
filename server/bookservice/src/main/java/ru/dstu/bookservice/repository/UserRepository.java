package ru.dstu.bookservice.repository;

import org.springframework.data.repository.CrudRepository;
import ru.dstu.bookservice.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
