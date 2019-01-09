package ci.atos.projet.trainning.commission.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)
public class Commission implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int IdCommission ;
	
	@Column(nullable = false)
	private String libelle;
	
	@Column(nullable = true)
	private String description;
	
	@OneToMany(mappedBy="commission" , cascade = CascadeType.ALL)
    private Set<Service> services;

	public int getIdTypecommission() {
		return IdCommission;
	}

	public void setIdTypecommission(int idTypecommission) {
		IdCommission = idTypecommission;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/*public Set<Service> getServices() {
		return services;
	}

	public void setServices(Set<Service> services) {
		this.services = services;
	}*/

	
}
