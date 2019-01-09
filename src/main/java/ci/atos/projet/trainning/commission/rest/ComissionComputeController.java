package ci.atos.projet.trainning.commission.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ci.atos.projet.trainning.commission.entities.Service;
import ci.atos.projet.trainning.commission.message.ResponseComissionCompute;
import ci.atos.projet.trainning.commission.repository.IServiceRepository;

@CrossOrigin({"*"})
@RestController
@RequestMapping({"/comission"})
public class ComissionComputeController {
	@Autowired
	private IServiceRepository serviceRepository;
	@RequestMapping(path="getComission/{serviceId}/{montant}")
 public ResponseComissionCompute ComputeComission(@PathVariable("serviceId") Integer serviceId ,@PathVariable("montant") String montant ) {
	ResponseComissionCompute _response = new ResponseComissionCompute();
	_response.setComission(0);
	_response.setHasError(true);
	try {
    Optional<Service> _searchService =	serviceRepository.findById(serviceId);
    if(_searchService.isPresent()) {
    	Service _service = _searchService.get();
    	if(_service.getMontantFixe() !=null && _service.getMontantFixe() >0) {
    		_response.setComission(_service.getMontantFixe());
    		_response.setHasError(false);
    		_response.setErrorMessage("");
    	}
    }
    else {
    	_response.setHasError(false);
		_response.setErrorMessage("service non trouve");
    }
	}catch(Exception ex) {
		_response.setErrorMessage(ex.getMessage());
	}
	return _response; 
 }
}
