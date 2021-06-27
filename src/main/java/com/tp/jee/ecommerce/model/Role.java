package com.tp.jee.ecommerce.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
@Data
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false, unique = true)
    @NotEmpty
    private String role;

    @ManyToMany( mappedBy = "roles")
    private List<User> users;



}
