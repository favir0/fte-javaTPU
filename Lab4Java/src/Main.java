import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("math_eq.txt"));
        String line = reader.readLine();
        while (line != null) {
            regExp(line);
            line = reader.readLine();

        }
    }
    public static void regExp(String eqv) {
        String regExp = "^(.+)+([\\+\\-\\*\\/])+(.+)$";
        Pattern pat = Pattern.compile(regExp, Pattern.MULTILINE);
        Matcher mat = pat.matcher(eqv);
        mat.find();
        double first = Double.parseDouble(mat.group(1));
        double second = Double.parseDouble(mat.group(3));
        double res = 0.0;
        System.out.print("\nOperation: " + first + " " + mat.group(2) + " " + second + "; Result: ");
        switch (mat.group(2)){
            case "-" -> {
                res = first - second;
                System.out.print(res);
            }
            case "*" -> {
                res = first * second;
                System.out.print(res);
                }
            case "/" -> {
                if (second != 0) {
                    res = first / second;
                    System.out.print(res);
                } else {
                    System.out.print("You can't divide by 0");
                }
            }
            default -> {
                res = first + second;
                System.out.print(res);
            }
        };
    }
}


