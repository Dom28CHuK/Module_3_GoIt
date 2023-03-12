public class NumberTranslator {
    public int translate(String romanNumber) {
        int result = 0;
        String romanNumberTrim = romanNumber.trim().toUpperCase();

        switch (romanNumberTrim) {
            case "I":
                result = 1;
                break;
            case "II":
                result = 2;
                break;
            case "III":
                result = 3;
                break;
            case "IV":
                result = 4;
                break;
            case "V":
                result = 5;
                break;
            case "VI":
                result = 6;
                break;
            case "VII":
                result = 7;
                break;
            case "VIII":
                result = 8;
                break;
            case "IX":
                result = 9;
                break;
            case "X":
                result = 10;
                break;
            case "XI":
                result = 11;
                break;
            case "XII":
                result = 12;
                break;
            default:
                result = -1;
        }
        return result;
    }

    public static void main(String[] args) {
        NumberTranslator numberTranslator = new NumberTranslator();

        System.out.println(numberTranslator.translate("I"));
        System.out.println(numberTranslator.translate(" X I"));
        System.out.println(numberTranslator.translate("iX "));
        System.out.println(numberTranslator.translate("XX"));
    }
}
