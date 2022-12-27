package uclm.esi.ineg.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface TaskService {

	@WebMethod(operationName = "copyRate")
	int copyRate();

}
