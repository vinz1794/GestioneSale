package it.thinkopen.gestioneSale.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import it.thinkopen.gestioneSale.model.Prenotation;
import lombok.Data;

@Entity
	public class User {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	  

	    private String email;
	    private String password;
	    
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
