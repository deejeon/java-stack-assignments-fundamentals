import java.util.ArrayList;

public class PuzzleJavaTest {
    public static void main(String[] args) {
        PuzzleJava test = new PuzzleJava();

        ArrayList<Integer> firstTaskTest = test.firstTask();
        System.out.println(firstTaskTest);

        ArrayList<String> secondTaskTest = test.secondTask();
        System.out.println(secondTaskTest);

        test.thirdTask();

        ArrayList<Integer> fourthTaskTest = test.fourthTask();
        System.out.println(fourthTaskTest);

        ArrayList<Integer> fifthTaskTest = test.fifthTask();
        System.out.println(fifthTaskTest);

        String sixthTaskTest = test.sixthTask();
        System.out.println(sixthTaskTest);

        ArrayList<String> seventhTaskTest = test.seventhTask();
        System.out.println(seventhTaskTest);
    }
}