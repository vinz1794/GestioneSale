package it.thinkopen.gestioneSale.service;

import it.thinkopen.gestioneSale.model.Prenotation;

import java.time.LocalDateTime;
import java.util.Collection;

public interface PrenotationService {
    Prenotation create(Prenotation room);
    Iterable<Prenotation> getAll(Prenotation prenotation);
    void delete(Prenotation prenotation);
    Prenotation save(Prenotation prenotation);
    Prenotation update(Prenotation prenotation);

    Collection<Prenotation> findByStartBetweenEnd(LocalDateTime inizio, LocalDateTime fine);
}
