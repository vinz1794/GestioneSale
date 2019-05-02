package it.thinkopen.gestioneSale.repository;


import it.thinkopen.gestioneSale.model.Utente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface UserRepository extends CrudRepository<Utente, Long>{




    Utente findByUsername(String username);
}
