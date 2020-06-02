import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {
    public ArrayList<Integer> firstTask() {
        ArrayList<Integer> numberArray = new ArrayList<Integer>();
        numberArray.add(3);
        numberArray.add(5);
        numberArray.add(1);
        numberArray.add(2);
        numberArray.add(7);
        numberArray.add(9);
        numberArray.add(8);
        numberArray.add(13);
        numberArray.add(25);
        numberArray.add(32);
        Integer sum = 0;
        ArrayList<Integer> newNumberArray = new ArrayList<Integer>();

        for (Integer number : numberArray) {
            sum += number;
            if (number > 10) newNumberArray.add(number);
        }
        System.out.println(sum);
        return newNumberArray;
    }

    public ArrayList<String> secondTask() {
        ArrayList<String> nameArray = new ArrayList<String>();
        nameArray.add("Nancy");
        nameArray.add("Jinichi");
        nameArray.add("Fujibayashi");
        nameArray.add("Momochi");
        nameArray.add("Ishikawa");
        ArrayList<String> newNameArray = new ArrayList<String>();

        for (String name : nameArray) {
            if (name.length() > 5) newNameArray.add(name);
        }

        Collections.shuffle(nameArray);
        System.out.println(nameArray);

        return newNameArray;
    }

    public void thirdTask() {
        ArrayList<Character> alphabet = new ArrayList<Character>();
        alphabet.add('A');
        alphabet.add('B');
        alphabet.add('C');
        alphabet.add('D');
        alphabet.add('E');
        alphabet.add('F');
        alphabet.add('G');
        alphabet.add('H');
        alphabet.add('I');
        alphabet.add('J');
        alphabet.add('K');
        alphabet.add('L');
        alphabet.add('M');
        alphabet.add('N');
        alphabet.add('O');
        alphabet.add('P');
        alphabet.add('Q');
        alphabet.add('R');
        alphabet.add('S');
        alphabet.add('T');
        alphabet.add('U');
        alphabet.add('V');
        alphabet.add('W');
        alphabet.add('X');
        alphabet.add('Y');
        alphabet.add('Z');
        Collections.shuffle(alphabet);

        Character lastLetter = alphabet.get(25);
        System.out.println(lastLetter);

        Character firstLetter = alphabet.get(0);
        System.out.println(firstLetter);

        if (firstLetter == 'A' || firstLetter == 'E' || firstLetter == 'I' || firstLetter == 'O' || firstLetter == 'U') System.out.println("First letter is a vowel.");
    }

    public ArrayList<Integer> fourthTask() {
        ArrayList<Integer> randomNumbers = new ArrayList<Integer>();
        Random r = new Random();
        randomNumbers.add(r.nextInt(45)+55);
        randomNumbers.add(r.nextInt(45)+55);
        randomNumbers.add(r.nextInt(45)+55);
        randomNumbers.add(r.nextInt(45)+55);
        randomNumbers.add(r.nextInt(45)+55);
        randomNumbers.add(r.nextInt(45)+55);
        randomNumbers.add(r.nextInt(45)+55);
        randomNumbers.add(r.nextInt(45)+55);
        randomNumbers.add(r.nextInt(45)+55);
        randomNumbers.add(r.nextInt(45)+55);
        return randomNumbers;
    }

    public ArrayList<Integer> fifthTask() {
        ArrayList<Integer> randomNumbers = this.fourthTask();
        Collections.sort(randomNumbers);
        System.out.println("The minimum number is: " + randomNumbers.get(0));
        System.out.println("The maximum number is: " + randomNumbers.get(9));
        return randomNumbers;
    }

    public String sixthTask() {
        ArrayList<String> alphabet = new ArrayList<String>();
        alphabet.add("A");
        alphabet.add("B");
        alphabet.add("C");
        alphabet.add("D");
        alphabet.add("E");
        alphabet.add("F");
        alphabet.add("G");
        alphabet.add("H");
        alphabet.add("I");
        alphabet.add("J");
        alphabet.add("K");
        alphabet.add("L");
        alphabet.add("M");
        alphabet.add("N");
        alphabet.add("O");
        alphabet.add("P");
        alphabet.add("Q");
        alphabet.add("R");
        alphabet.add("S");
        alphabet.add("T");
        alphabet.add("U");
        alphabet.add("V");
        alphabet.add("W");
        alphabet.add("X");
        alphabet.add("Y");
        alphabet.add("Z");
        Random r = new Random();
        String newRandomWord = "".concat(alphabet.get(r.nextInt(26))).concat(alphabet.get(r.nextInt(26))).concat(alphabet.get(r.nextInt(26))).concat(alphabet.get(r.nextInt(26))).concat(alphabet.get(r.nextInt(26)));
        return newRandomWord;
    }

    public ArrayList<String> seventhTask() {
        ArrayList<String> randomWords = new ArrayList<String>();
        randomWords.add(this.sixthTask());
        randomWords.add(this.sixthTask());
        randomWords.add(this.sixthTask());
        randomWords.add(this.sixthTask());
        randomWords.add(this.sixthTask());
        randomWords.add(this.sixthTask());
        randomWords.add(this.sixthTask());
        randomWords.add(this.sixthTask());
        randomWords.add(this.sixthTask());
        randomWords.add(this.sixthTask());
        return randomWords;
    }
}