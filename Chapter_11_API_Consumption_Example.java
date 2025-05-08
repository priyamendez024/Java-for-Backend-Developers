
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ExternalApiService {

    private final RestTemplate restTemplate;

    public ExternalApiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/consume-api")
    public String consumeApi() {
        String response = restTemplate.getForObject("https://api.example.com/data", String.class);
        return "Received from external API: " + response;
    }
}
    