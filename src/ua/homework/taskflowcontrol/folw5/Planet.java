package ua.homework.taskflowcontrol.folw5;

import java.util.ArrayList;

public class Planet {
    private final String planetName;
    private ArrayList<Continent> continents;

    public Planet(String planetName) {
        this.planetName = planetName;
        this.continents = new ArrayList<>();
    }

    public void addContinent(Continent continent) {
        continents.add(continent);
    }


    public int getContinentCount() {
        return continents.size();
    }

    public Continent getContinent(String continentName){
        for (Continent continent : continents)
            if (continent.getContinentName().equalsIgnoreCase(continentName))
                return continent;
        return null;
    }

    public String getAllContinentsName() {
        StringBuilder temp = new StringBuilder();
        for (Continent continent : continents)
            temp.append(continent.toString() + " ");
        return temp.toString();
    }

    @Override
    public String toString() {
        return planetName;
    }
}
