package com.test.service;

import com.test.domain.Permission;
import com.test.repository.PermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by D_Air on 2016/10/24.
 */

@Service
public class PermissionServiceImpl implements PermissionService {
    @Autowired
    private PermissionRepository permissionRepository;

    @Override
    public List<Permission> getPermissions(Integer userId) {

            return permissionRepository.findPermissions(userId);

    }
}
