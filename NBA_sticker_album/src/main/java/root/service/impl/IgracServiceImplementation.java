package root.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import root.dao.IgracDao;
import root.dao.TimDao;
import root.domain.Igrac;
import root.domain.Tim;
import root.domain.dto.IgracDto;
import root.service.IgracService;

@Service
public class IgracServiceImplementation implements IgracService {

	@Autowired
	private IgracDao igracDao;

	@Autowired
	private TimDao timDao;

	@Override
	public Igrac save(IgracDto inputIgrac) {
		Optional<Tim> timO = timDao.findById(inputIgrac.getTimId());
		Tim tim = timO.get();

		try {
			return igracDao.save(new Igrac(inputIgrac.getId(), inputIgrac.getIme(), inputIgrac.getPozicija(),
					inputIgrac.getSlikaUrl(), tim));

		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public Iterable<Igrac> returnAll() {
		return igracDao.findAll();
	}

	@Override
	public Optional<Igrac> returnById(Long id) {
		return igracDao.findById(id);
	}

	@Override
	public Boolean delete(Long id) {
		if (igracDao.existsById(id)) {
			igracDao.deleteById(id);
			return true;
		}
		return false;
	}

}
