package root.api;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import root.domain.Igrac;
import root.domain.dto.IgracDto;
import root.service.IgracService;

@RestController
@RequestMapping("/igrac")
public class IgracApi {

	@Autowired
	private IgracService igracService;

	@RequestMapping(value = "/save", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Igrac save(@RequestBody IgracDto inputIgrac) {
		return igracService.save(inputIgrac);
	}

	@RequestMapping(value = "/returnAll", method = RequestMethod.GET)
	public @ResponseBody Iterable<Igrac> returnAll() {
		return igracService.returnAll();
	}

	@RequestMapping(value = "/returnById/{id}", method = RequestMethod.GET)
	public @ResponseBody Optional<Igrac> returnById(@PathVariable Long id) {
		return igracService.returnById(id);
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public @ResponseBody Boolean delete(@PathVariable Long id) {
		if (id == null) {
			return false;
		}
		return igracService.delete(id);
	}
}
