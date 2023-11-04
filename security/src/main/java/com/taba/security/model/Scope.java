package com.taba.security.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@Table(name="scopes")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class Scope {
    @Id
    private Integer id;
    @NonNull
    @Size(max = 50)
    private String name;
}
