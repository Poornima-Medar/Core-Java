package springmvcsearchcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class CentralaisedExceptionHandler {

	@ResponseStatus(value  =HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler({NullPointerException.class})
	public String exceptionHandler() {
		return "error";
	}
	
	
	@ExceptionHandler(value = Exception.class)
	public String genericException() {
		return "error";
	}

}
