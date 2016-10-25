package com.test.service;

import com.test.domain.Permission;

import java.util.List;

/**
 * Created by D_Air on 2016/10/24.
 */
public interface PermissionService {
     List<Permission> getPermissions(Integer userId);


}
