package devops.k8s.scratchpad_k8s.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.util.Map;

@RestController
public class Controller {

    @GetMapping("/")
    public Map<String, String> hello() throws Exception {
        String env = System.getenv().getOrDefault("ENV_VALUE", "No ENV found");
        String hostname = InetAddress.getLocalHost().getHostName();
        return Map.of("message", "hello from spring boot app", "env", env, "container", hostname);
    }
}
