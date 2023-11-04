package com.taba.security.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="roles")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private Integer id;
    @NonNull
    @Size(max = 20)
    private String name;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "role_scopes", joinColumns = @JoinColumn(name = "role_id"), inverseJoinColumns = @JoinColumn(name = "scope_id"))
    private Set<Scope> scopes = new HashSet<>();

}
