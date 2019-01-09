package ci.atos.projet.trainning.commission.message;

public class ResponseComissionCompute {
 private Integer comission ;
 private Boolean HasError ;
 private String ErrorMessage ;
public Integer getComission() {
	return comission;
}
public void setComission(Integer comission) {
	this.comission = comission;
}
public Boolean getHasError() {
	return HasError;
}
public void setHasError(Boolean hasError) {
	HasError = hasError;
}
public String getErrorMessage() {
	return ErrorMessage;
}
public void setErrorMessage(String errorMessage) {
	ErrorMessage = errorMessage;
}

 
}
