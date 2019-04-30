package it.thinkopen.gestioneSale.repository;

import java.util.Collection;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import it.thinkopen.gestioneSale.model.User;


@RepositoryRestResource
public interface UserRepository extends CrudRepository<User, Long>{
	
    long countById(Integer id);

    Collection<User> findAllUsersByEmail(String email);

    User findUsersById(Integer id);

    @Query("SELECT u FROM Utent u WHERE u.email = :email")
    Collection<User> finder(@Param("email") String email);

    @Query("SELECT u FROM Utent u WHERE u.password = :password")
    Collection<User> finderPS(@Param("password") String password);

    @Query(value = "SELECT * FROM Utent as u WHERE u.password = ?1", nativeQuery = true)
    Collection<User> finderPS2(String password);



}
