package it.thinkopen.gestioneSale.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Prenotation {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    

	    private Date inizio;
	    private Date fine;
	    
	    
	 /*   @ManyToOne
	    @JoinColumn(name = "owner_id")
	    private Utente eventOwner;
	    
	    @ManyToOne
	    @JoinColumn(name = "room_id")
	    private Room eventRoom;*/

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

	public Date getInizio() {
		return inizio;
	}

	public void setInizio(Date inizio) {
		this.inizio = inizio;
	}

	public Date getFine() {
		return fine;
	}

	public void setFine(Date fine) {
		this.fine = fine;
	}




	/*	public Utente getEventOwner() {
			return eventOwner;
		}

		public void setEventOwner(Utente eventOwner) {
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