package it.thinkopen.gestioneSale.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import it.thinkopen.gestioneSale.model.User;
import lombok.Data;

@Entity
public class Prenotation {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
	 
	    private String name;
	    private String start;
	    private String end;
	    
	    
	 /*   @ManyToOne
	    @JoinColumn(name = "owner_id")
	    private User eventOwner;
	    
	    @ManyToOne
	    @JoinColumn(name = "room_id")
	    private Room eventRoom;*/

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getStart() {
			return start;
		}

		public void setStart(String start) {
			this.start = start;
		}

		public String getEnd() {
			return end;
		}

		public void setEnd(String end) {
			this.end = end;
		}

	/*	public User getEventOwner() {
			return eventOwner;
		}

		public void setEventOwner(User eventOwner) {
			this.eventOwner = eventOwner;
		}

		public Room getEventRoom() {
			return eventRoom;
		}

		public void setEventRoom(Room eventRoom) {
			this.eventRoom = eventRoom;
		}
	    */


} 