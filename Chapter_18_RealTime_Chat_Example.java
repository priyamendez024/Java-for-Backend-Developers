
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatService {

    @GetMapping("/chat")
    public String getChat() {
        return "Welcome to the real-time chat!";
    }
}
    