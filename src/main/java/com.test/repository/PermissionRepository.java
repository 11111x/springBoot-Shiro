package com.test.repository;

import com.test.domain.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by D_Air on 2016/10/24.
 */
public interface PermissionRepository extends JpaRepository<Permission, Integer> {

    @Query("SELECT p FROM Permission p \n" +
            ", RolePermission rp  ,Role r , UserRole  ur , User u  \n" +
            "WHERE    r.id=rp.role.id AND  ur.role.id =rp.role.id AND  u.id = ur.user.id AND p.id=rp.permission.id AND u.id=?1 ORDER BY  p.sort")
    List<Permission> findPermissions(Integer userId);
}

