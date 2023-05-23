package com.larramendi.larraCRUD.repositories;

import com.larramendi.larraCRUD.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
