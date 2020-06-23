import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reverse {


    public static String findBlock(String input) {
            System.out.println("\t" + input);
        if (input.indexOf("/") == -1) {
            return null;
        }
        while (input.charAt(0) == '\n') {
            input = input.substring(1);
        }
        String s = "";
        while (input.charAt(0) != '\n') {
            s += input.substring(0, input.indexOf('\n') + 1);
            input = input.substring(input.indexOf('\n') + 1);
        }
        s += '\n';
        return s;
    }

    public static String readAll() {
        System.out.println("go\n");
        Scanner scan = new Scanner(System.in);
        String read = "";
        while (!read.contains("$")) {
            read += scan.nextLine() + "\n";
        }
        scan.close();
        return read + "\n";
    }

    public static void main(String[] args) {
        String read = readAll();
        List<String> list = new ArrayList<>();
        String left = read.toString();
        String found = "";
        do {
            found = findBlock(left);
            System.out.println(found);
            if (found != null) {
                left = left.substring(found.length());
            }
            list.add(found);
        } while (found != null && left.contains("/") && !left.substring(0, 2).equals("\n\n"));

        String out = "";
        for (int i = list.size() - 1; i >= 0; i--) {
            out += list.get(i);
        }
        System.out.println("\t" + out);
    }


}