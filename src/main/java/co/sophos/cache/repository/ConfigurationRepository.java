package co.sophos.cache.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.sophos.cache.entities.Configuration;

@Repository
public interface ConfigurationRepository extends CrudRepository<Configuration, Long>{

	
}
