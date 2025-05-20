package fr.michaelchlon.demo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

// *INFO: ══ GLOBAL EXCEPTION HANDLING ═══════════════════════════════════════
@ControllerAdvice
public class StudentRestExceptionHandler {

  // Add an exception handler using @ExceptionHandler
  @ExceptionHandler
  public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exc) {
    // Create a StudentErrorResponse
    StudentErrorResponse error = new StudentErrorResponse();
    error.setStatus(HttpStatus.NOT_FOUND.value());
    error.setMessage(exc.getMessage());
    error.setTimestamp(System.currentTimeMillis());

    // return ResponseEntity
    return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
  }

  // Add an exception ahndler ... to catch any exceptions (catch-all)
  @ExceptionHandler
  public ResponseEntity<StudentErrorResponse> handleException(Exception exc) {
    // Create a StudentErrorResponse
    StudentErrorResponse error = new StudentErrorResponse();
    error.setStatus(HttpStatus.BAD_REQUEST.value());
    // error.setMessage(exc.getMessage());
    error.setMessage("Impossible to convert to integer");
    error.setTimestamp(System.currentTimeMillis());

    // return ResponseEntity
    return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
  }
}
