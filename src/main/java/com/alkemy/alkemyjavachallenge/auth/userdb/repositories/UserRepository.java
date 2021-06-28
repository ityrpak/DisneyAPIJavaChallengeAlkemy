package com.alkemy.alkemyjavachallenge.auth.userdb.repositories;

//import javax.persistence.EntityManagerFactory;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends UserDetails {

}
