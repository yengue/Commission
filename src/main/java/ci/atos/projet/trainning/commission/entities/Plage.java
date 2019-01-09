package ci.atos.projet.trainning.commission.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)
public class Plage implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int IdPlage ;
	
	@Column(nullable = false)
	private Integer inf ;
	
	@Column(nullable = false)
	private Integer sup ;
	
	@Column(nullable = false)
	private Integer montant ;
	
	private Palier palier;

	public int getIdPlage() {
		return IdPlage;
	}

	public void setIdPlage(int idPlage) {
		IdPlage = idPlage;
	}

	public Integer getInf() {
		return inf;
	}

	public void setInf(Integer inf) {
		this.inf = inf;
	}

	public Integer getSup() {
		return sup;
	}

	public void setSup(Integer sup) {
		this.sup = sup;
	}

	public Integer getMontant() {
		return montant;
	}

	public void setMontant(Integer montant) {
		this.montant = montant;
	}
    
	@ManyToOne
    @JoinColumn(name = "plage_palier_id")
	public Palier getPalier() {
		return palier;
	}

	public void setPalier(Palier palier) {
		this.palier = palier;
	}
	
	
}
