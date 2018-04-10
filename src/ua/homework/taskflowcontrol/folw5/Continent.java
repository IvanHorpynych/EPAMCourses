package ua.homework.taskflowcontrol.folw5;

public class Continent {
    private final String continentName;

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public String getContinentName() {
        return continentName;
    }


    @Override
    public boolean equals(Object obj) {
        if (continentName.equalsIgnoreCase(obj.toString())) return true;
        return false;
    }

    @Override
    public String toString() {
        return continentName;
    }
}
