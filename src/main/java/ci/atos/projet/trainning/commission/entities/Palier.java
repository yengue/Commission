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
public class Palier implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int IdPalier ;
	
	@Column(nullable = false)
    private String nom;
	
	@Column(nullable = true)
    private String description;
	
	@Column(nullable = true)
    private String spere1;
	
	@Column(nullable = true)
    private String spere5;
	
	@OneToMany(mappedBy="palier" , cascade = CascadeType.ALL)
    private Set<Plage> plages;
	
	@OneToMany(mappedBy="palier" , cascade = CascadeType.ALL)
    private Set<Service> services;



	public Set<Service> getServices() {
		return services;
	}

	public void setServices(Set<Service> services) {
		this.services = services;
	}

	public int getIdPalier() {
		return IdPalier;
	}

	public void setIdPalier(int idPalier) {
		IdPalier = idPalier;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSpere1() {
		return spere1;
	}

	public void setSpere1(String spere1) {
		this.spere1 = spere1;
	}

	public String getSpere5() {
		return spere5;
	}

	public void setSpere5(String spere5) {
		this.spere5 = spere5;
	}

	public Set<Plage> getPlages() {
		return plages;
	}

	public void setPlages(Set<Plage> plages) {
		this.plages = plages;
	}
	
	
}
