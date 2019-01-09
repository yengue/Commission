package ci.atos.projet.trainning.commission.help;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ci.atos.projet.trainning.commission.entities.Commission;
import ci.atos.projet.trainning.commission.repository.ITypeCommission;

@Component
public class Utilities {
	@Autowired
	private ITypeCommission commissionRepository;
	public Commission myGetCommission(String libelleCommission) {
		try {
			Optional<Commission> commission = commissionRepository
					.findAll()
					.stream()
					.filter(c -> c.getLibelle().equals(libelleCommission)).findFirst();
			if(commission.isPresent())
				return commission.get();
			else
				return null;
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		return null;
		
	}
}
