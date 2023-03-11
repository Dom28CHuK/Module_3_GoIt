import java.util.*;

public class SaveStarShip {
    public int calculateDistance(int distance) {
        if (distance >= 0) {
            return distance;
        } else {
            return distance - distance * 2;
        }
    }

    public String choosePlanet(long distanceToEarth) {
        if (distanceToEarth < 45677) {
            return "Earth";
        } else return "Pern";
    }

    public String[] getPlanets(String galaxy) {
        String[] planets = {};
        if (galaxy.equals("DangerBanger")) {
            planets = new String[] {"Fobius", "Demius"};
        } else if (galaxy.equals("Miaru")) {
            planets = new String[] {"Maux", "Reux", "Piax"};
        } else if (galaxy.equals("Milkyway")) {
            planets = new String[] {"Earth", "Mars", "Jupiter"};
        }
        return planets;
    }

    public int calculateFuelPrice(String fuel, int count) {
        if (fuel.equals("STAR100")) {
            return count * 70;
        } else if (fuel.equals("STAR500")) {
            return count * 120;
        } else if (fuel.equals("STAR1000")) {
            return count * 200;
        } else return count * 50;
    }

//    public int roundSpeed(int speed) {
//        return (int) (Math.round(speed / 10.0) * 10);
//    }
    public int roundSpeed(int speed) {
        int firstDigit = speed / 10;
        int lastDigit = speed % 10;

        if (lastDigit >= 5) {
            firstDigit++;
        }
        return firstDigit * 10;
    }

    public int calculateNeededFuel(int distance) {
        int fuel = 1000;
        int years = distance / 1;
        int extraFuel = 0;

        if (years > 20) {
            extraFuel = (years - 20) * 5;
        }
        fuel += extraFuel;
        return fuel;
    }

    public void calculateMaxPower() {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        int maxNumber = number1;

        if (number2 > maxNumber) {
            maxNumber = number2;
        }
        if (number3 > maxNumber) {
            maxNumber = number3;
        }

        float cof;

        if (maxNumber < 10) {
            cof = 0.7f;
        } else if (maxNumber <= 100) {
            cof = 1.2f;
        } else {
            cof = 2.1f;
        }

        float result = maxNumber * cof;

        System.out.println(result);
        scanner.close();
    }

    public String getMyPrizes(int ticket) {
        String result = "";

        if (ticket % 10 == 0) {
            result += "crystall ";
        }
        if (ticket % 10 == 7) {
            result += "chip ";
        }
        if (ticket > 200) {
            result += "coin ";
        }
        return result.trim();
    }

    public boolean isHangarOk(int side1, int side2, int price) {
        int area = side1 * side2;
        int longerSide = Math.max(side1, side2);
        int shortedSide = Math.min(side1, side2);
        int priceArea = price / area;

        return area >= 1500 && longerSide <= shortedSide * 2 && priceArea <= 1000;
    }

    public static void main(String[] args) {
        SaveStarShip ship = new SaveStarShip();

        //Should be 10
        System.out.println(ship.calculateDistance(-10));

        //Should be [Fobius, Demius]
        System.out.println(Arrays.toString(ship.getPlanets("DangerBanger")));

        System.out.println(ship.choosePlanet(1000000));

        System.out.println(ship.calculateFuelPrice("STAR100", 10));
        System.out.println(ship.calculateFuelPrice("STAR7", 5));

        System.out.println(ship.roundSpeed(10)); //10
        System.out.println(ship.roundSpeed(15)); //20
        System.out.println(ship.roundSpeed(89)); //90

        System.out.println(ship.calculateNeededFuel(1)); //1000
        System.out.println(ship.calculateNeededFuel(20));//1000
        System.out.println(ship.calculateNeededFuel(25));//1025

        //ship.calculateMaxPower();

        System.out.println(ship.getMyPrizes(777));

        System.out.println(ship.isHangarOk(100, 75, 1000000));
    }
}
