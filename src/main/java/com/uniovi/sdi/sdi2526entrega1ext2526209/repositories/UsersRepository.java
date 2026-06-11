package com.uniovi.sdi.sdi2526entrega1ext2526209.repositories;

import com.uniovi.sdi.sdi2526entrega1ext2526209.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<User, Long> {

    User findByDni(String dni);
    Page<User> findAll(Pageable pageable);
}
