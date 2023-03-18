package com.tteonago.member.exception;

import java.nio.charset.StandardCharsets;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionManager {
	@ExceptionHandler(AppException.class)
	
//	public ResponseEntity<?> AppExceptionHandler(AppException ae) {
//		
//		return ResponseEntity.status(ae.getErrorCode().getHttpStatus())
//				.body(ae.getErrorCode().name() + " " + ae.getMessage() + " AppException exception handlder 발생");
//	}
	
	public ResponseEntity<String> AppExceptionHandler(AppException ae) {
	    String errorMessage = ae.getMessage();
	    String html = "<script>alert('" + errorMessage + "'); history.back();</script>";
	    HttpHeaders headers = new HttpHeaders();
	    headers.setContentType(MediaType.TEXT_HTML);
	    headers.add("Content-Type", "text/html; charset=UTF-8");
	    return new ResponseEntity<String>(html, headers, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<?> runtimeExceptionHandler(RuntimeException re) {
		
		return ResponseEntity.status(HttpStatus.CONFLICT)
				.body(re.getMessage());
	}
}
