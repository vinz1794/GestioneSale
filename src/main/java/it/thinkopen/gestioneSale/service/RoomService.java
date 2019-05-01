package it.thinkopen.gestioneSale.service;


import it.thinkopen.gestioneSale.model.Room;

public interface RoomService {
    Room create(Room room);
    Iterable<Room> getAll(Room room);
    void delete(Room room);
    Room save(Room room);
    Room update(Room room);
}
