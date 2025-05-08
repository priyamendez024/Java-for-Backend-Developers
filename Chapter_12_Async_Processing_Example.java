
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Async
    public void processAsyncTask() {
        System.out.println("Processing task in the background");
    }
}
    