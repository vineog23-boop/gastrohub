package br.com.gastrohub.user.repository;

import br.com.gastrohub.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

    List<User> findByNomeContainingIgnoreCase(String nome);

    Optional<User> findByLogin(String login);

    boolean existsByEmail(String email);
}
