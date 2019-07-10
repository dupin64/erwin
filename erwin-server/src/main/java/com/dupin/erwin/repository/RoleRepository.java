package com.dupin.erwin.repository;

import com.dupin.erwin.model.Role;
import com.dupin.erwin.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(RoleName roleNmae);
}
