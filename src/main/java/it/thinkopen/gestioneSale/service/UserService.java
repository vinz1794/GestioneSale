package it.thinkopen.gestioneSale.service;

import it.thinkopen.gestioneSale.model.Utente;

public interface UserService {

     Utente create(Utente utente);
     Iterable<Utente> getAll(Utente utente);
     void delete(Utente utente);
     Utente save(Utente utente);
     Utente update(Utente utente);
}
