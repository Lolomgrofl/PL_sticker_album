package root.service;

import java.util.Optional;

import root.domain.Tim;

public interface TimService {

	public Tim save(Tim tim);

	public Iterable<Tim> returnAll();
	
	public Optional<Tim> returnById(Long Id);

	public Boolean delete(Long Id);

}