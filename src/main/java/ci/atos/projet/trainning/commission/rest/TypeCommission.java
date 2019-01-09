package ci.atos.projet.trainning.commission.rest;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ci.atos.projet.trainning.commission.entities.Commission;
import ci.atos.projet.trainning.commission.message.CreateTypeCommissionMessage;
import ci.atos.projet.trainning.commission.message.ResponseCreateTypeCommission;
import ci.atos.projet.trainning.commission.repository.ITypeCommission;

@CrossOrigin({"*"})
@RestController
@RequestMapping({"/comission"})
public class TypeCommission {
	@Autowired
	private ITypeCommission commissionRepository;
	@PostMapping("TypeCommission/createTypeCommission")
	public ResponseCreateTypeCommission createTypeCommission (@Valid @RequestBody CreateTypeCommissionMessage typeCommission) {
		ResponseCreateTypeCommission _response = new ResponseCreateTypeCommission();
		_response.setHasError(true);
		 try {
		 Commission _commission = new Commission();
		 _commission.setDescription(typeCommission.getDescription());
		 _commission.setLibelle(typeCommission.getLibelle());
		//_service.setAdresseWebservice("http://localhost:8080/comission/{serviceId}/{montant}");
		 Commission _createdCommission = commissionRepository.save(_commission);
		_response.setHasError(false);
		_response.setErrorMessage("");
		_response.setTypecommission(_createdCommission);
		 }catch(Exception ex) {
			 _response.setErrorMessage(ex.getMessage()); 
			 _response.setTypecommission(null);
		 }
		 return _response;
		
	}

}
