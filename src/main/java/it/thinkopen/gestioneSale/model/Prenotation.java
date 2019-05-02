package it.thinkopen.gestioneSale.model;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.*;

@Entity
public class Prenotation {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    

	    private LocalDateTime inizio;
	    private LocalDateTime fine;
	    
	    
	   @ManyToOne
	    @JoinColumn(name = "utente_id")
	    private Utente eventOwner;
	    
	    @ManyToOne
	    @JoinColumn(name = "room_id")
	    private Room eventRoom;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

	public  LocalDateTime getInizio() {
		return inizio;
	}

	public void setInizio( LocalDateTime inizio) {
		this.inizio = inizio;
	}

	public  LocalDateTime getFine() {
		return fine;
	}

	public void setFine( LocalDateTime fine) {
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