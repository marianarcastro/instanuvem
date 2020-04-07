package instanuvem.endpoint;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import instanuvem.model.User;

@RestController
@RequestMapping("users")
public class UserEndpoint {
	
	@RequestMapping(method = RequestMethod.GET)
	public List<User> listAll() {
		List<User> list = new ArrayList<User>();
		return list;
	}
}
