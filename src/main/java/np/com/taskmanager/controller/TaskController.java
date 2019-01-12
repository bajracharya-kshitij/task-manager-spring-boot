package np.com.taskmanager.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/task")
public class TaskController {

	@GetMapping("/admin")
	public Map<String, String> helloAdmin() {
		Map<String, String> map = new HashMap<>();
		map.put("message", "hello admin");
		return map;
	}

	@GetMapping("/user")
	public Map<String, String> helloUser() {
		Map<String, String> map = new HashMap<>();
		map.put("message", "hello user");
		return map;
	}
}
