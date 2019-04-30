package it.thinkopen.gestioneSale.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import it.thinkopen.gestioneSale.model.Prenotation;

@RepositoryRestResource
public interface PrenotationRepository extends CrudRepository<Prenotation, Long>  {
	
	long countById(Integer id);
	Collection<Prenotation> findAllPrenotationsById(Integer Id);
	Prenotation findPrenotationByName(Integer id);
	

    @Query("SELECT p FROM Prenotation p WHERE p.name = :name")
    Collection<Prenotation> finder(@Param("name") String name);

    @Query("SELECT p FROM Prenotation p WHERE p.start = :start")
    Collection<Prenotation> finderPS1(@Param("start") String start);
    
    @Query("SELECT p FROM Prenotation p WHERE p.end = :end")
    Collection<Prenotation> finderPS(@Param("end") String end);

    

    /*@Query(value = "SELECT * FROM Utent as u WHERE u.password = ?1", nativeQuery = true)
    Collection<Utent> finderPS2(String password);*/

}
