package com.uniovi.sdi.sdi2526entrega1ext2526209.services;

import org.springframework.stereotype.Service;

@Service
public class RolesService {
    String[] roles = {"ROLE_EMPLOYEE", "ROLE_ADMIN"};
    public String[] getRoles() {
        return roles;
    }
}
