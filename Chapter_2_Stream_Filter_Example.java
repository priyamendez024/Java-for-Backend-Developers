
import java.util.*;
import java.util.stream.*;

public class StreamFilterExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
        List<String> filteredWords = words.stream()
                                          .filter(word -> word.contains("a"))
                                          .map(String::toUpperCase)
                                          .collect(Collectors.toList());
        System.out.println(filteredWords);
    }
}
    