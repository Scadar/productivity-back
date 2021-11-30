
package com.example.productivityback.auth.repository;

import com.example.productivityback.auth.model.Role;
import com.example.productivityback.auth.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    public Optional<Role> findByRole(RoleName roleName);
}
