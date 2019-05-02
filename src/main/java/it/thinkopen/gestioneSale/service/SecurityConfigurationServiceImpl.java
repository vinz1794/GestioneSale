package it.thinkopen.gestioneSale.service;

import it.thinkopen.gestioneSale.model.Utente;
import it.thinkopen.gestioneSale.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class SecurityConfigurationServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Utente user = userRepository.findByUsername(username);

        if (user == null) {
            throw new UsernameNotFoundException("Username not found");
        }

        return new org.springframework.security.core.userdetails.User(
                user.getUsername()
                , user.getPassword()
                , Collections.singleton(new SimpleGrantedAuthority("user")));
    }
}

