package it.thinkopen.gestioneSale;

import it.thinkopen.gestioneSale.model.User;
import it.thinkopen.gestioneSale.model.Prenotation;
import it.thinkopen.gestioneSale.model.Room;
import it.thinkopen.gestioneSale.repository.RoomRepository;
import it.thinkopen.gestioneSale.repository.UserRepository;
import it.thinkopen.gestioneSale.repository.PrenotationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import javax.validation.Valid;

@RestController
public class Controller {

    
    private final UserRepository UserRepository;
	private final RoomRepository RoomRepository;
    private final PrenotationRepository PrenotationRepository;


    @Autowired
    public Controller(UserRepository UserRepository,RoomRepository RoomRepository,PrenotationRepository PrenotationRepository){
        this.UserRepository = UserRepository;
        this.RoomRepository = RoomRepository;
    	this.PrenotationRepository = PrenotationRepository;
    }

   /* @RequestMapping("/login")
    Collection<Utent> verifyLogin() {
    	return UtentCustomRepository.getUtentsByEmail("email", "password ");
    }*/

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    User saveUser(@Valid User ut) {
   
     return UserRepository.save(ut);
    }
    
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    Iterable<User> getUser() {
   
     return UserRepository.findAll();
    }
    
    @RequestMapping(value = "/users", method = RequestMethod.PUT)
    User updateUser(@Valid User ut) {
   
     return UserRepository.save(ut);
    }
    
    @RequestMapping(value = "/users", method = RequestMethod.DELETE)
    void deleteUser(User ut) {
  
      UserRepository.delete(ut);
    }
    
  
    

    @RequestMapping(value = "/room", method = RequestMethod.POST)
     Room saveRoom(@Valid Room rm) {
		
    		   
    	     return RoomRepository.save(rm);
    	    }
    	    
    	    @RequestMapping(value = "/room", method = RequestMethod.GET)
    	    Iterable<Room> getRoom() {
    	   
    	     return RoomRepository.findAll();
    	    }
    	    
    	    @RequestMapping(value = "/room", method = RequestMethod.PUT)
    	    Room updateRoom(@Valid Room rm) {
    	   
    	     return RoomRepository.save(rm);
    	    }
    	    
    	    @RequestMapping(value = "/room", method = RequestMethod.DELETE)
    	    void deleteRoom(Room rm) {
    	  
    	      RoomRepository.delete(rm);
    	    }
    	    
    	  
    	
    	    @RequestMapping(value = "/prenotations", method = RequestMethod.POST)
    	    Prenotation savePrenotation(@Valid Prenotation pr) {
    	   
    	     return PrenotationRepository.save(pr);
    	    }
    	    
    	    @RequestMapping(value = "/prenotations", method = RequestMethod.GET)
    	    Iterable<Prenotation> getPrenotation() {
    	   
    	     return PrenotationRepository.findAll();
    	    }
    	    
    	    @RequestMapping(value = "/prenotations", method = RequestMethod.PUT)
    	    Prenotation updatePrenotation(@Valid Prenotation pr) {
    	   
    	     return PrenotationRepository.save(pr);
    	    }
    	    
    	    @RequestMapping(value = "/prenotations", method = RequestMethod.DELETE)
    	    void deletePrenotation(Prenotation pr) {
    	  
    	     PrenotationRepository.delete(pr);
    	    }
    	    
    	  
}

