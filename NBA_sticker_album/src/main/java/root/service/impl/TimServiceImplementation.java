package root.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import root.dao.TimDao;
import root.domain.Tim;
import root.service.TimService;

@Service
public class TimServiceImplementation implements TimService {

	@Autowired
	private TimDao timDao;

	@Override
	public Tim save(Tim tim) {
		try {
			return timDao.save(tim);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public Iterable<Tim> returnAll() {
		return timDao.findAll();
	}

	@Override
	public Optional<Tim> returnById(Long id) {
		return timDao.findById(id);
	}

	@Override
	public Boolean delete(Long id) {
		if (timDao.existsById(id)) {
			timDao.deleteById(id);
			return true;
		} else {
			return false;
		}
	}

}
