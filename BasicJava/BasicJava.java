import java.util.ArrayList;

public class BasicJava {
    public void print1To255() {
        for (int i = 1; i < 256; i++) {
            System.out.println(i);
        }
    }

    public void printOdd1To255() {
        for (int i = 1; i < 256; i++) {
            if (i % 2 == 1) System.out.println(i);
        }
    }

    public void printSum() {
        int i = 0;
        int sum = 0;
        while (i < 256) {
            sum += i;
            System.out.println("New number: " + i + ", Sum: " + sum);
            i++;
        }
    }

    public void printFromArray(Object[] x) {
        for (Object thing : x) {
            System.out.println(thing);
        }
    }

    public void printMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println(max);
    }

    public void printAvg(ArrayList<Integer> array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        if ( sum % array.size() == 0 ) {
            int avg = sum / array.size();
            System.out.println(avg);
        }
        else {
            double avg = sum / array.size();
            System.out.println(avg);
        }
    }

    public ArrayList<Integer> arrayWithOddNumbers() {
        ArrayList<Integer> y = new ArrayList<Integer>();
        for (int i = 1; i < 256; i++) {
            if (i % 2 == 1) y.add(i);
        }
        return y;
    }

    public int greaterThanY(ArrayList<Integer> array, Integer y) {
        int solution = 0;
        for (Integer num : array) {
            if (num > y) solution++;
        }
        return solution;
    }

    public ArrayList<Integer> squareTheValues(ArrayList<Integer> x) {
        for (int i = 0; i < x.size(); i++) {
            x.set(i, x.get(i)*x.get(i));
        }
        return x;
    }

    public ArrayList<Integer> eliminateNegativeNumbers(ArrayList<Integer> x) {
        for (int i = 0; i < x.size(); i++) {
            if (x.get(i) < 0) x.set(i, 0);
        }
        return x;
    }

    public ArrayList<Number> maxMinAvg(ArrayList<Integer> x) {
        Integer max = x.get(0);
        Integer min = x.get(0);
        Integer sum = 0;
        for (int i = 0; i < x.size(); i++) {
            if (x.get(i) > max) max = x.get(i);
            if (x.get(i) < min) min = x.get(i);
            sum += x.get(i);
        }
        Number avg = sum / x.size();
        ArrayList<Number> solution = new ArrayList<Number>();
        solution.add(max);
        solution.add(min);
        solution.add(avg);
        return solution;
    }

    public ArrayList<Integer> shiftValues(ArrayList<Integer> x) {
        for (int i = 0; i < x.size(); i++) {
            if (i == x.size()-1) x.set(i, 0);
            else x.set(i, x.get(i+1));
        }
        return x;
    }
}