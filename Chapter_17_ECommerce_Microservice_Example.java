
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartService {

    @GetMapping("/cart")
    public String getCart() {
        return "Shopping cart details";
    }
}
    