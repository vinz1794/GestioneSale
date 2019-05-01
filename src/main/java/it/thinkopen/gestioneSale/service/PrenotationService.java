package it.thinkopen.gestioneSale.service;

import it.thinkopen.gestioneSale.model.Prenotation;

public interface PrenotationService {
    Prenotation create(Prenotation room);
    Iterable<Prenotation> getAll(Prenotation prenotation);
    void delete(Prenotation prenotation);
    Prenotation save(Prenotation prenotation);
    Prenotation update(Prenotation prenotation);
}
