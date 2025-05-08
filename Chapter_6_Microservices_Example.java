
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductService {
    @GetMapping("/product")
    public String getProduct() {
        return "Product details from Product Service";
    }
}
    