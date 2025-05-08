
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductService productService;

    @Test
    void testGetProduct() {
        when(productRepository.findById(1L)).thenReturn(Optional.of(new Product(1L, "Laptop")));
        Product product = productService.getProduct(1L);
        assertEquals("Laptop", product.getName());
    }
}
    