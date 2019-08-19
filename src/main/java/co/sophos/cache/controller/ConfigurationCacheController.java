package co.sophos.cache.controller;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.sophos.cache.entities.Configuration;
import co.sophos.cache.entities.ConfigurationResponse;
import co.sophos.cache.entities.Status;
import co.sophos.cache.repository.ConfigurationRepository;


@RestController
@RequestMapping("/api/cache")
public class ConfigurationCacheController {
	
	@Autowired
	private ConfigurationRepository configurationRepository;
	
	@GetMapping("/get")
	public ResponseEntity<ConfigurationResponse> get(Long id, String channel, String UUID){
		ConfigurationResponse response = new ConfigurationResponse();
		response.setChannel(channel);
		response.setServerDate(new Date());
		response.setUUID(UUID);
		
		Optional<Configuration> configuration = configurationRepository.findById(id);
		
		Status status = new Status();
		status.setDescCode("OK");
		status.setSeverity("INFO");
		status.setStatusCode(0);
		response.setStatus(status);
		
		if(configuration.isPresent())
			response.setConfiguration(configuration.get());
		return ResponseEntity.ok(response);
	}
	
	@PostMapping("/add")
	public ResponseEntity<ConfigurationResponse> add(Long id, String autorization, String name, String state, String type, String channel, String UUID){
		ConfigurationResponse response = new ConfigurationResponse();
		response.setChannel(channel);
		response.setServerDate(new Date());
		response.setUUID(UUID);
		
		Configuration configuration = new Configuration();
		configuration.setAutorization(autorization);
		configuration.setId(id);
		configuration.setName(name);
		configuration.setRegistryDate(new Date());
		configuration.setState(state);
		configuration.setType(type);
		
		configurationRepository.save(configuration);
		
		Status status = new Status();
		status.setDescCode("OK");
		status.setSeverity("INFO");
		status.setStatusCode(0);
		response.setStatus(status);
		
		return ResponseEntity.ok(response);
	}
	

	
}
