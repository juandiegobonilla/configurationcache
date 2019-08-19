package co.sophos.cache.entities;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("configuration")
public class Configuration implements Serializable{

	public Configuration(Long id, String name, String type, Date registryDate, String state, String autorization) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.registryDate = registryDate;
		this.state = state;
		this.autorization = autorization;
	}
	
	public Configuration() {}
	
	private static final long serialVersionUID = 1L;
	private @Id Long id;
	private String name;
	private String type;
	private Date registryDate;
	private String state;
	private String autorization;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getRegistryDate() {
		return registryDate;
	}
	public void setRegistryDate(Date registryDate) {
		this.registryDate = registryDate;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getAutorization() {
		return autorization;
	}
	public void setAutorization(String autorization) {
		this.autorization = autorization;
	}
	

}
