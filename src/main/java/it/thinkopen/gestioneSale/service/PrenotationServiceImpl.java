package it.thinkopen.gestioneSale.service;

import it.thinkopen.gestioneSale.model.Prenotation;
import it.thinkopen.gestioneSale.repository.PrenotationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collection;

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
        return prenotationRepository.findAll();
    }

    @Override
    public void delete(Prenotation prenotation) {
        prenotationRepository.delete(prenotation);

    }

    @Override
    public Prenotation save(Prenotation prenotation) {
        return prenotationRepository.save(prenotation);
    }

    @Override
    public Prenotation update(Prenotation prenotation) {
        return prenotationRepository.save(prenotation);
    }

    @Override
    public Collection<Prenotation> findByStartBetweenEnd(LocalDateTime inizio, LocalDateTime fine) {
        return prenotationRepository.findByStartBetweenEnd(inizio,fine);
    }
}
