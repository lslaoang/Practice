import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GetString {

    public static List<String> readInput() {

        String text = "Jhon [B] - 14, 15, 16";
        String numbersOnly = text.substring(text.indexOf("-") + 1).trim();
        return Arrays.stream(numbersOnly.split(",")).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        final List<String> stats = readInput();
        System.out.println(Arrays.toString(stats.toArray()));

    }
}
