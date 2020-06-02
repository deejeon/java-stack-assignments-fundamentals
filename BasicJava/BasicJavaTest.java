import java.util.ArrayList;

public class BasicJavaTest {
    public static void main(String[] args) {
        BasicJava test = new BasicJava();
        ArrayList<Integer> x = test.arrayWithOddNumbers();
        test.shiftValues(x);
        System.out.println(x);
    }
}