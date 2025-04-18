package com.app.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {
 
	@ExceptionHandler(UserNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ResponseBody
	public String handleUserNotFoundException(UserNotFoundException userNotFoundException) {
		return userNotFoundException.getMessage();
	}
	@ExceptionHandler(BreakdownRequesetNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ResponseBody
	public String handleBreakNotFoundException(BreakdownRequesetNotFoundException breakdownNotFoundException) {
		return breakdownNotFoundException.getMessage();
	}
	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ResponseBody
	public String handleGeneralException(Exception exception) {
		return "An error occured "+exception.getMessage();
	}
}
