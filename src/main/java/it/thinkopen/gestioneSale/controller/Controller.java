package it.thinkopen.gestioneSale.controller;

import it.thinkopen.gestioneSale.model.Utente;
import it.thinkopen.gestioneSale.model.Prenotation;
import it.thinkopen.gestioneSale.model.Room;
import it.thinkopen.gestioneSale.service.PrenotationServiceImpl;
import it.thinkopen.gestioneSale.service.RoomServiceImpl;
import it.thinkopen.gestioneSale.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.Collection;

@RestController
public class Controller {

    @Autowired
	UserServiceImpl userServiceImpl;

  /* @RequestMapping(value = "/login",method = RequestMethod.POST)
   Collection<Utente> verifyLogin() {
    	return Utente.getUtentsByEmail("email", "password ","username");
    }*/

    @RequestMapping(value = "/users", method = RequestMethod.POST)
	Utente saveUser(@Valid Utente us) {
     return userServiceImpl.create(us);
    }
    
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    Iterable<Utente> getUsers(Utente us) {

		return userServiceImpl.getAll(us);
    }
    
    @RequestMapping(value = "/users", method = RequestMethod.PUT)
	Utente updateUser(@Valid Utente us) {
   
     return userServiceImpl.update(us);
    }
    
    @RequestMapping(value = "/users", method = RequestMethod.DELETE)
    void deleteUser(Utente us) {
  
      userServiceImpl.delete(us);
    }


    @Autowired
	RoomServiceImpl roomServiceImpl;

    @RequestMapping(value = "/room", method = RequestMethod.POST)
     Room saveRoom(@Valid Room rm) {
    	return roomServiceImpl.create(rm);
    	    }
    	    
    	    @RequestMapping(value = "/room", method = RequestMethod.GET)
    	    Iterable<Room> getRooms(Room rm) {
    	   
    	     return roomServiceImpl.getAll(rm);
    	    }
    	    
    	    @RequestMapping(value = "/room", method = RequestMethod.PUT)
    	    Room updateRoom(@Valid Room rm) {
    	   
    	     return roomServiceImpl.save(rm);
    	    }
    	    
    	    @RequestMapping(value = "/room", method = RequestMethod.DELETE)
    	    void deleteRoom(Room rm) {
    	  
    	      roomServiceImpl.delete(rm);
    	    }
    	    
    	  
    	@Autowired
	PrenotationServiceImpl prenotationServiceImpl;



	@RequestMapping(value  = "/prenotations/{inizio}/{fine}",method = RequestMethod.GET)
	public Collection<Prenotation> findByInizioFine(@PathVariable("inizio") String inizio, @PathVariable("fine")String fine){


		LocalDateTime _inizio = LocalDateTime.parse(inizio);
		LocalDateTime _fine = LocalDateTime.parse(fine);

		return prenotationServiceImpl.findByStartBetweenEnd(_inizio,_fine);
	}
    	    @RequestMapping(value = "/prenotations", method = RequestMethod.POST)
    	    Prenotation savePrenotation(@Valid Prenotation pr) {
    	   
    	     return prenotationServiceImpl.save(pr);
    	    }
    	    
    	    @RequestMapping(value = "/prenotations", method = RequestMethod.GET)
    	    Iterable<Prenotation> getPrenotation(Prenotation pr) {
    	   
    	     return prenotationServiceImpl.getAll(pr);
    	    }
    	    
    	    @RequestMapping(value = "/prenotations", method = RequestMethod.PUT)
    	    Prenotation updatePrenotation(@Valid Prenotation pr) {
    	   
    	     return prenotationServiceImpl.save(pr);
    	    }
    	    
    	    @RequestMapping(value = "/prenotations", method = RequestMethod.DELETE)
    	    void deletePrenotation(Prenotation pr) {
    	  
    	     prenotationServiceImpl.delete(pr);
    	    }
    	    
    	  
}

