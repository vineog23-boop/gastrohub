package br.com.gastrohub.user.entity;

import br.com.gastrohub.user.entity.enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users",
        uniqueConstraints = {
                @UniqueConstraint(name = "uk_customers_email", columnNames = "email"),
                @UniqueConstraint(name = "uk_customers_login", columnNames = "login")
        })
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "nome", length = 150, nullable = false)
    private String nome;

    @Column(name = "email", length = 200, nullable = false)
    private String email;

    @Column(name = "login", length = 30, nullable = false)
    private String login;

    @Column(name = "senha", length = 255, nullable = false)
    private String senha;

    @Column(name = "data_ultima_alteracao", nullable = false)
    private LocalDateTime dataUltimaAlteracao;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Address> enderecos = new ArrayList<>();

    @Enumerated(EnumType.STRING)
    @Column(name = "role", length = 30, nullable = false)
    private Role role;

    @PrePersist
    protected void onCreate() {
        this.dataUltimaAlteracao = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        this.dataUltimaAlteracao = LocalDateTime.now();
    }
}
