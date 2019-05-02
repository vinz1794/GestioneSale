package it.thinkopen.gestioneSale.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Collection;

@Entity
	public class Utente {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;


	    private String username;
	    private String email;
	    private String password;



	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}




	  /*  @OneToMany(mappedBy = "PrenotationsOwner")
	    private Collection<Prenotation> ownedPrenotations;*/

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		/*public Collection<Prenotation> getOwnedPrenotations() {
			return ownedPrenotations;
		}

		public void setOwnedPrenotations(Collection<Prenotation> ownedPrenotations) {
			this.ownedPrenotations = ownedPrenotations;
		}
*/

}
