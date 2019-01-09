package ci.atos.projet.trainning.commission.message;

import ci.atos.projet.trainning.commission.entities.Commission;

public class ResponseCreateTypeCommission {
	private String ErrorMessage ;
	private Boolean HasError ;
	
	private Commission typecommission;

	public String getErrorMessage() {
		return ErrorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		ErrorMessage = errorMessage;
	}

	public Boolean getHasError() {
		return HasError;
	}

	public void setHasError(Boolean hasError) {
		HasError = hasError;
	}

	public Commission getTypecommission() {
		return typecommission;
	}

	public void setTypecommission(Commission typecommission) {
		this.typecommission = typecommission;
	}
	
	
}
