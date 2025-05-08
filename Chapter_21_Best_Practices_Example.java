
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class BestPracticesService {

    @Value("${app.name}")
    private String appName;

    public String getAppName() {
        return appName;
    }
}
    