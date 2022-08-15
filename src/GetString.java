import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class GetString {

    public static List<String> readInput() {

        String text = "Jhon [B] - 14, 15, 16";
        String numbersOnly = text.substring(text.indexOf("-") + 1).trim();
        return Arrays.stream(numbersOnly.split(",")).collect(Collectors.toList());
    }

    public static HashMap<String, Integer> getVersion(String version) {
        List<String> versionArray = Arrays.stream(version.split("\\.")).toList();
        HashMap<String, Integer> validVersion = new HashMap<>();
        validVersion.put("MAJOR", Integer.parseInt(versionArray.get(0)));
        validVersion.put("MINOR", Integer.parseInt(versionArray.get(1)));
        return validVersion;
    }

    public static void main(String[] args) {
        final List<String> stats = readInput();
//        System.out.println(Arrays.toString(stats.toArray()));
        System.out.println(getVersion("111.222.33"));

    }
}
