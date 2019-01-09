package ci.atos.projet.trainning.commission.message;

import ci.atos.projet.trainning.commission.entities.Service;

public class ResponseServicesMontantCommissionFixeMessage {
private String ErrorMessage ;
private Boolean HasError ;
public Boolean getHasError() {
	return HasError;
}
public void setHasError(Boolean hasError) {
	HasError = hasError;
}
private  Service serviceCreated;
public String getErrorMessage() {
	return ErrorMessage;
}
public void setErrorMessage(String errorMessage) {
	ErrorMessage = errorMessage;
}

public Service getServiceCreated() {
	return serviceCreated;
}
public void setServiceCreated(Service serviceCreated) {
	this.serviceCreated = serviceCreated;
}
}
