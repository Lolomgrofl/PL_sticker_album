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


import root.domain.Tim;
import root.service.TimService;

@RestController
@RequestMapping("/tim")
public class TimApi {

	@Autowired
	private TimService timService;

	@RequestMapping(value = "/save", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Tim save(@RequestBody Tim inputTim) {
		return timService.save(inputTim);
	}

	@RequestMapping(value = "/returnAll", method = RequestMethod.GET)
	public @ResponseBody Iterable<Tim> returnAll() {
		return timService.returnAll();
	}
	
	@RequestMapping(value = "/returnById/{id}", method = RequestMethod.GET)
	public Optional<Tim> returnById(@PathVariable Long id)  {
		return timService.returnById(id);
	}
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public @ResponseBody Boolean delete(@PathVariable Long id) {
		if (id==null) {
			return false;
		}
		return timService.delete(id);
	}
	
	@RequestMapping(value = "/returnByTimId/{id}", method = RequestMethod.GET)
	public @ResponseBody Tim getTim(@PathVariable Long id) {
		if (id==null) {
			return null;
		}
		return timService.getTim(id);
	}
}
