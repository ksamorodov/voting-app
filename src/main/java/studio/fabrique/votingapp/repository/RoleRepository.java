package studio.fabrique.votingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import studio.fabrique.votingapp.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
