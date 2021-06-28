package com.alkemy.alkemyjavachallenge.auth.userdb.models;


import com.alkemy.alkemyjavachallenge.auth.security.Roles;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
public class UserModel {

    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue (
            strategy = SEQUENCE,
            generator = "user_sequence"
    )
    private Long idUser;

    @Column(nullable = false, length = 50)
    private String username;

    @Column(nullable = false, length = 30)
    private String password;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private Roles role;

    public UserModel(String username, String password, String email, Roles role) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
    }

    public UserModel() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }
}
