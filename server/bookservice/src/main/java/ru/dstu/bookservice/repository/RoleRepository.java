package ru.dstu.bookservice.repository;

import org.springframework.data.repository.CrudRepository;
import ru.dstu.bookservice.model.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
}
