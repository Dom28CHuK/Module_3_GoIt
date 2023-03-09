import java.util.*;

public class HarekCity {
    public String[] createEmptyNameArray() {
        String[] result = new String[0];
        return result;
    }

    public int[] createAgeArray(int age1, int age2, int age3, int age4) {
        int[] result = {age1, age2, age3, age4};
        return result;
    }

    public void fixNames(String[] names, String[] toReplace) {
        names[1] = toReplace[0];
        names[3] = toReplace[1];
    }

    public String firstAndLastTogether(String[] names) {
        return names[0] + " AND " + names[names.length - 1] + " TOGETHER";
    }

    public void changeElectResult(String[] results) {
        String copyResults[] = Arrays.copyOf(results, results.length);

        results[0] = copyResults[copyResults.length - 1];
        results[results.length - 1] = copyResults[0];
    }

    //    public String[] changeElectResultAgain(String[] results) {
//        String[] copyResults = Arrays.copyOf(results, results.length);
//        String[] newArray = new String[3];
//        newArray[0] = copyResults[2];
//        newArray[1] = copyResults[3];
//        newArray[2] = copyResults[4];
//        return newArray;
//    }
    public String[] changeElectResultAgain(String[] results) {
        return new String[]{
                results[2],
                results[3],
                results[4]
        };
    }

    public char[][] createKeyboard() {
        char[][] numbers = {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
                {'*', '0', '#'}
        };
        return numbers;
    }

    public void printKeyboard() {
        char[][] copyCreate = createKeyboard();
        System.out.println(Arrays.toString(copyCreate[0]));
        System.out.println(Arrays.toString(copyCreate[1]));
        System.out.println(Arrays.toString(copyCreate[2]));
        System.out.println(Arrays.toString(copyCreate[3]));
    }

    public String[] makeCopy(String[] names) {
        System.out.println("Copied!");
         return Arrays.copyOf(names, names.length);
    }

    public static void main(String[] args) {
//        String[] arr = new HarekCity().createEmptyNameArray();
//        System.out.println(Arrays.toString(arr));
//
//        int[] ageArray = new HarekCity().createAgeArray(10, 20, 30, 40);
//        System.out.println(Arrays.toString(ageArray));

//        String[] names = new String[]{"mixa", "ukio", "barek", "krou", "fiha"};
//        String[] toReplace = new String[]{"lopr", "boki"};
//        new HarekCity().fixNames(names, toReplace);
//        System.out.println(Arrays.toString(names));

//        String[] names = new String[]{"io", "pu", "re", "max", "kok", "mis", "hit", "kio", "pax", "rew"};
//        System.out.println(new HarekCity().firstAndLastTogether(names));

//        String[] results = new String[]{"miho", "hut"};
//        new HarekCity().changeElectResult(results);
//        System.out.println(Arrays.toString(results));

//        String[] results = new String[]{"mix", "max", "pex", "fux", "rox"};
//        String[] changedResults = new HarekCity().changeElectResultAgain(results);
//        System.out.println(Arrays.toString(changedResults));
//
//        char[][] keyboard = new HarekCity().createKeyboard();
//        for (int i = 0; i < keyboard.length; i++) {
//            System.out.println(Arrays.toString(keyboard[i]));
//        }

        new HarekCity().printKeyboard();

        String[] source = new String[] {"Hero", "Mihu"};
        String[] copy = new HarekCity().makeCopy(source);

        source[0] = "CHANGED!";

        System.out.println(Arrays.toString(copy));
    }
}
