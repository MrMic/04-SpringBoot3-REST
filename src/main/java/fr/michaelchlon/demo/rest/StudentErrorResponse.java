package fr.michaelchlon.demo.rest;

public class StudentErrorResponse {

  private int status;
  private String message;
  private long timestamp;

  // * INFO: ══ CONSTRUCTORS ═══════════════════════════════════════════════════
  public StudentErrorResponse() {}

  public StudentErrorResponse(int status, String message, long timestamp) {
    this.status = status;
    this.message = message;
    this.timestamp = timestamp;
  }

  // * INFO: ═══ GETTERS & SETTERS ═══════════════════════════════════════════════
  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
  }

  // ______________________________________________________________________
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  // ______________________________________________________________________
  public long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(long timestamp) {
    this.timestamp = timestamp;
  }
}
