
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CloudNativeService {

    @GetMapping("/status")
    public String getStatus() {
        return "Cloud-native service is running!";
    }
}
    