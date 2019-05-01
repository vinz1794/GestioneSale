package it.thinkopen.gestioneSale.service;

import it.thinkopen.gestioneSale.model.Prenotation;
import it.thinkopen.gestioneSale.repository.PrenotationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrenotationServiceImpl implements PrenotationService {

    @Autowired
    PrenotationRepository prenotationRepository;
    @Override
    public Prenotation create(Prenotation room) {
        return prenotationRepository.save(room);
    }

    @Override
    public Iterable<Prenotation> getAll(Prenotation prenotation) {
        return null;
    }

    @Override
    public void delete(Prenotation prenotation) {

    }

    @Override
    public Prenotation save(Prenotation prenotation) {
        return null;
    }

    @Override
    public Prenotation update(Prenotation prenotation) {
        return null;
    }
}
