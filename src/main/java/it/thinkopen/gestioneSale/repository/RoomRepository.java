package it.thinkopen.gestioneSale.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import it.thinkopen.gestioneSale.model.Room;


@RepositoryRestResource
public interface RoomRepository extends CrudRepository<Room, Long>{
    long countById(Integer id);

    Collection<Room> findAllRoomsByNumber(Integer number);

    Room findRoomByNumber(Integer number);

    @Query("SELECT r FROM Room r WHERE r.name = :name")
    Collection<Room> finder(@Param("name") String name);

    @Query("SELECT r FROM Room r WHERE r.number = :number")
    Collection<Room> finderRoom1(@Param("number") Integer number);

    @Query(value = "SELECT * FROM Room as r WHERE r.number = ?1", nativeQuery = true)
    Collection<Room> finderRoom2(Integer number);
}
