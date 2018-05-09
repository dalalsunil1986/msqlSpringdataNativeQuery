package org.sambsoft.repositories;

import org.sambsoft.entities.UserRole;
import org.sambsoft.entities.UserRoleId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

public interface UserRoleRepository extends JpaRepository<UserRole, UserRoleId> {

    @Query(value = "SELECT COUNT(*) FROM  UserRole  ur , UserSettings    us   WHERE   ur.user_id=us.id  and ur.role='Editor'", nativeQuery = true)
   BigInteger  countRoles();
}
