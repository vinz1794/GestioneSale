package it.thinkopen.gestioneSale.service;

import it.thinkopen.gestioneSale.model.Room;
import it.thinkopen.gestioneSale.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomServiceImpl implements RoomService{
    @Autowired
    RoomRepository roomRepository;
    @Override
    public Room create(Room room) { return roomRepository.save(room); }

    @Override
    public  Iterable<Room> getAll(Room room) {
        return null;
    }

    @Override
    public  void delete(Room room) {

    }

    @Override
    public  Room save(Room room) {
        return null;
    }

    @Override
    public Room update(Room room) {
        return null;
    }
}
