package ua.homework.taskflowcontrol.folw5;

public class Main {
    public static void main(String[] args) {
        Planet earth = new Planet("Earth");

        for (String continent : new String[]{"Asia", "Africa", "North America", "South America", "Antarctica", "Europe", "Australia"})
            earth.addContinent(new Continent(continent));

        System.out.println("Planet: " + earth);
        System.out.println("Count of continents: " + earth.getContinentCount());
        System.out.println("Continent: " + earth.getContinent("Asia"));
        System.out.println("All continents: " + earth.getAllContinentsName());
    }
}
