import java.util.*;

public class SaveStarShip {
    public int calculateDistance(int distance) {
        if (distance >= 0) {
            return distance;
        } else {
            return distance - distance * 2;
        }
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
    public static void main(String[] args) {
        SaveStarShip ship = new SaveStarShip();

        //Should be 10
        System.out.println(ship.calculateDistance(-10));

        //Should be [Fobius, Demius]
        System.out.println(Arrays.toString(ship.getPlanets("DangerBanger")));
    }
}
