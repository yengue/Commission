package ci.atos.projet.trainning.commission.rest;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ci.atos.projet.trainning.commission.message.CreateServicesMontantCommissionFixeMessage;
import ci.atos.projet.trainning.commission.message.ResponseServicesMontantCommissionFixeMessage;
import ci.atos.projet.trainning.commission.repository.IServiceRepository;
import ci.atos.projet.trainning.commission.entities.Service;



@CrossOrigin({"*"})
@RestController
@RequestMapping({"/comission"})
public class ServicesController {
	@Autowired
	private IServiceRepository serviceRepository;
	@PostMapping("Service/createService")
	public ResponseServicesMontantCommissionFixeMessage CreateServicesMontantCommissionFixe(@Valid @RequestBody CreateServicesMontantCommissionFixeMessage service) {
		ResponseServicesMontantCommissionFixeMessage _response = new ResponseServicesMontantCommissionFixeMessage();
		_response.setHasError(true);
		 try {
		 Service _service = new Service();
		_service.setDescription(service.getDescription());
		_service.setMontantFixe(service.getMontantFixe());
		_service.setNomService(service.getNomService());
		//_service.setAdresseWebservice("http://localhost:8080/comission/{serviceId}/{montant}");
		 Service _createdSrvice = serviceRepository.save(_service);
		 String adresseWebservice ="http://localhost:8080/comission/getComission/"+ _createdSrvice.getIdService() +"/0";
		 _createdSrvice.setAdresseWebservice(adresseWebservice);
		_response.setHasError(false);
		_response.setErrorMessage("");
		_response.setServiceCreated(_createdSrvice);
		 }catch(Exception ex) {
			 _response.setErrorMessage(ex.getMessage()); 
			 _response.setServiceCreated(null);
		 }
		 return _response;
		
	}
}
