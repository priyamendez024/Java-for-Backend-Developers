
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryService {

    @GetMapping("/inventory")
    public String checkInventory() {
        return "Inventory service: All items are in stock";
    }
}
    