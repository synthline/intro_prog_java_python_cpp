import java.util.ArrayList;
import java.util.Iterator;

/**
 * Monitor counts of different types of animal. Sightings are recorded by
 * spotters.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29 (imperative)
 */
public class AnimalMonitor {
    // Records of all the sightings of animals.
    private ArrayList<Sighting> sightings;

    /**
     * Create an AnimalMonitor.
     */
    public AnimalMonitor() {
        this.sightings = new ArrayList<>();
    }

    /**
     * Add the sightings recorded in the given filename to the current list.
     * 
     * @param filename A CSV file of Sighting records.
     */
    public void addSightings(String filename) {
        SightingReader reader = new SightingReader();
        sightings.addAll(reader.getSightings(filename));
    }

    /**
     * Print details of all the sightings.
     */
    public void printList() {
        sightings.forEach(record -> System.out.println(record.getDetails()));

        // for(Sighting record : sightings) {
        // System.out.println(record.getDetails());
    }

    /**
     * Print the details of all the sightings of the given animal.
     * 
     * @param animal The type of animal.
     */
    public void printSightingsOf(String animal) {
        for (Sighting record : sightings) {
            if (animal.equals(record.getAnimal())) {
                System.out.println(record.getDetails());
            }
        }
    }

    /**
     * Print all the sightings by the given spotter.
     * 
     * @param spotter The ID of the spotter.
     */
    public void printSightingsBy(int spotter) {
        for (Sighting record : sightings) {
            if (record.getSpotter() == spotter) {
                System.out.println(record.getDetails());
            }
        }
    }

    /**
     * Print a list of the types of animal considered to be endangered.
     * 
     * @param animalNames     A list of animals names.
     * @param dangerThreshold Counts less-than or equal-to to this level are
     *                        considered to be dangerous.
     */
    public void printEndangered(ArrayList<Sighting> animalNames, int dangerThreshold) {
        animalNames.stream().filter(a -> a.getCount() <= dangerThreshold).map(animal -> animal.getAnimal())
                .forEach(animal -> System.out.println(animal + " is endangered."));
    }

    // Rewrite the printEndangered method in your project to use streams. Test. (To
    // test
    // this method, it may be easiest to write a test method that creates an
    // ArrayList of
    // animal names and calls the printEndangered method with it.)

    // for (String animal : animalNames) {
    // if (getCount(animal) <= dangerThreshold) {
    // System.out.println(animal + " is endangered.");
    // }
    }

    /**
     * Return a count of the number of sightings of the given animal.
     * 
     * @param animal The type of animal.
     * @return The count of sightings of the given animal.
     */
    public int getCount(String animal) {
        int total = 0;
        for (Sighting sighting : sightings) {
            if (animal.equals(sighting.getAnimal())) {
                total = total + sighting.getCount();
            }
        }
        return total;
    }

    /**
     * Remove from the sightings list all of those records with a count of zero.
     */
    public void removeZeroCounts() {
        Iterator<Sighting> it = sightings.iterator();
        while (it.hasNext()) {
            Sighting record = it.next();
            if (record.getCount() == 0) {
                it.remove();
            }
        }
    }

    /**
     * Return a list of all sightings of the given type of animal in a particular
     * area.
     * 
     * @param animal The type of animal.
     * @param area   The ID of the area.
     * @return A list of sightings.
     */
    public ArrayList<Sighting> getSightingsInArea(String animal, int area) {
        ArrayList<Sighting> records = new ArrayList<>();
        for (Sighting record : sightings) {
            if (animal.equals(record.getAnimal())) {
                if (record.getArea() == area) {
                    records.add(record);
                }
            }
        }
        return records;
    }

    /**
     * Return a list of all the sightings of the given animal.
     * 
     * @param animal The type of animal.
     * @return A list of all sightings of the given animal.
     */
    public void getSightingsOf(String animal) {
        sightings.stream().filter(s -> animal.equals(s.getAnimal())).forEach(s -> System.out.println(s.getDetails()));
    }

    public void printSightDetails(int period) {
        sightings.stream().filter(p -> period == (p.getPeriod())).forEach(p -> System.out.println(p.getDetails()));
    }

    public void printSightDetailsOfAnimals(String animal) {
        sightings.stream().filter(a -> animal.equals(a.getAnimal())).map(sighting -> sighting.getDetails())
                .forEach(details -> System.out.println(details));
    }

    // public int animalMonitor(String animal, int spotterID, int dayID)
    // {
    // sightings.stream()
    // .filter(animal -> animal.equals(sightings.getAnimal()))
    // .filter(spotterID -> spotterID == sightings.getSpotter())
    // .map(animal -> animal.getCount())
    // .map(sightings.getSpotter() -> animal.getCount())
    // .reduce(0, (total, sighting)) -> return total + sighting);
    // }

    // Add a method to AnimalMonitor that takes three parameters: animal, spotterID,
    // and dayID, and returns a count of how many sightings of the given animal were
    // made by the spotter on a particular day.

    // public void removeSpotter(int spotter)
    // {
    // sightings.removeIf(spotterID -> spotter == sightings.getSpotter());

    // }

    // Write method removeSpotter that removes all records reported by a given
    // spotter.

}
