package co.sophos.cache.entities;

import java.io.Serializable;

public class Status implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int statusCode;
	private String severity;
	private String descCode;
	
	public Status() {}
	
	public String getDescCode() {
		return descCode;
	}
	public void setDescCode(String descCode) {
		this.descCode = descCode;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
}
