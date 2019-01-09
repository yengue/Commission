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
public class Service implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int IdService ;
	
	@Column(nullable = false)
	private String nomService;
	
	@Column(nullable = true)
	private String description;
	
	@Column(nullable = true)
	private Integer montantFixe;
	
	@Column(nullable = true)
	private Integer taux;
	
	@Column(nullable = true)
	private String adresseWebservice;
	
	@Column(nullable = true)
	private String nomParamettre;
	
	
	private Commission commission;
	
	private Palier palier ;

	public int getIdService() {
		return IdService;
	}

	public void setIdService(int idService) {
		IdService = idService;
	}

	public String getNomService() {
		return nomService;
	}

	public void setNomService(String nomService) {
		this.nomService = nomService;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getMontantFixe() {
		return montantFixe;
	}

	public void setMontantFixe(Integer montantFixe) {
		this.montantFixe = montantFixe;
	}

	public Integer getTaux() {
		return taux;
	}

	public void setTaux(Integer taux) {
		this.taux = taux;
	}

	public String getAdresseWebservice() {
		return adresseWebservice;
	}

	public void setAdresseWebservice(String adresseWebservice) {
		this.adresseWebservice = adresseWebservice;
	}

	public String getNomParamettre() {
		return nomParamettre;
	}

	public void setNomParamettre(String nomParamettre) {
		this.nomParamettre = nomParamettre;
	}

	@ManyToOne
    @JoinColumn(name = "service_commission_id")
	public Commission getTypecommission() {
		return commission;
	}

	public void setTypecommission(Commission commission) {
		this.commission = commission;
	}

	@ManyToOne
    @JoinColumn(name = "service_palier_id")
	public Palier getPalier() {
		return palier;
	}

	public void setPalier(Palier palier) {
		this.palier = palier;
	}
	
}
