package it.thinkopen.gestioneSale.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import it.thinkopen.gestioneSale.model.Prenotation;

@RepositoryRestResource
public interface PrenotationRepository extends CrudRepository<Prenotation, Long>  {

}
