package it.thinkopen.gestioneSale.service;

import it.thinkopen.gestioneSale.model.Utente;
import it.thinkopen.gestioneSale.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

@Autowired
    UserRepository userRepository;

    @Override
    public Utente create(Utente utente) {
        ///verifichi qualcosa
        ///cript password
        ///


        return userRepository.save(utente);
    }

    @Override
    public Iterable getAll(Utente utente) {
        return null;
    }

    @Override
    public void delete(Utente utente) {

    }

    @Override
    public Utente save(Utente utente) {
        return null;
    }

    @Override
    public Utente update(Utente utente) {
        return null;
    }
}
