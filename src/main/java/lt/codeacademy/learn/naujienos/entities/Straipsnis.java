package lt.codeacademy.learn.naujienos.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "straipsnis")
public class Straipsnis {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name = "id")
	private long id;
	
	@Column(name = "pavadinimas")
	private String pavadinimas;
	
	@Column(name = "tekstas")
	private String tekstas;
	/*@ManyToOne
	@JoinColumn(name="straipsnis_id")
	@Cascade(CascadeType.SAVE_UPDATE)
	@JsonManagedReference
	*/
	public Straipsnis() {
	}

	public Straipsnis(String pavadinimas, String tekstas) {
		this.pavadinimas = pavadinimas;
		this.tekstas = tekstas;
	}

	public Straipsnis(long id, String pavadinimas, String tekstas) {
		this.id = id;
		this.pavadinimas = pavadinimas;
		this.tekstas = tekstas;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPavadinimas() {
		return pavadinimas;
	}

	public void setPavadinimas(String pavadinimas) {
		this.pavadinimas = pavadinimas;
	}

	public String getTekstas() {
		return tekstas;
	}

	public void setTekstas(String tekstas) {
		this.tekstas = tekstas;
	}

	@Override
	public String toString() {
		return "Straipsnis [id=" + id + ", pavadinimas=" + pavadinimas + ", tekstas=" + tekstas + "]";
	}

}
