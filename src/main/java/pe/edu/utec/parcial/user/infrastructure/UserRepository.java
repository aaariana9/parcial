package pe.edu.utec.parcial.user.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.utec.parcial.user.domain.User;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    boolean existsByEmail(String email);
}
