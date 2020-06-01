package root.service;

import java.util.Optional;

import root.domain.Igrac;
import root.domain.dto.IgracDto;

public interface IgracService {

	public Igrac save(IgracDto inputIgrac);

	public Iterable<Igrac> returnAll();
	
	public Optional<Igrac> returnById(Long Id);

	public Boolean delete(Long Id);
}
