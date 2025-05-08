
import java.util.List;
import java.util.stream.Collectors;

public class PerformanceOptimizationExample {

    public List<Integer> optimizeStream(List<Integer> numbers) {
        return numbers.stream()
                      .filter(num -> num % 2 == 0)
                      .map(num -> num * 2)
                      .collect(Collectors.toList());
    }
}
    