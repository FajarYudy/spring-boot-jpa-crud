package com.project.repository;

import com.project.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author fajaryudi
 * @created 2023/02/17 - 11.45
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
