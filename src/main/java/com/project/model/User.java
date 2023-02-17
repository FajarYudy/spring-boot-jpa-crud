package com.project.model;

import jakarta.persistence.*;
import lombok.Data;

/**
 * @author fajaryudi
 * @created 2023/02/17 - 11.43
 */
@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "username", nullable = false)
    private String username;
    private String fullName;
    private String email;
    private String password;
}
