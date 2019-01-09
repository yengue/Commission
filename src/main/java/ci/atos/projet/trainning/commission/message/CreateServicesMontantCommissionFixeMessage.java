package ci.atos.projet.trainning.commission.message;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import ci.atos.projet.trainning.commission.entities.Commission;
import ci.atos.projet.trainning.commission.entities.Palier;

public class CreateServicesMontantCommissionFixeMessage {
	
	private String nomService;
	private String description;
	private Integer montantFixe;
	private String adresseWebservice;
	private String nomParamettre;
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

}
