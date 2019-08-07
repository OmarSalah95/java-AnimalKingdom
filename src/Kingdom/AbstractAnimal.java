package Kingdom;

public abstract class AbstractAnimal {
    private static int maxId;

    private int id = 0;
    private String name;
    private int discoveryYear;

    public AbstractAnimal(String name, int year) {
        id = maxId++;
        this.name = name;
        this.discoveryYear = year;
    }

    // move
    public abstract String getMovement();

    // breath
    public abstract String getBreath();

    // reproduce
    public abstract String getReproduction();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiscoveryYear() {
        return discoveryYear;
    }

    public void setDiscoveryYear(int discoveryYear) {
        this.discoveryYear = discoveryYear;
    }

    @Override
    public String toString() {
        return "Animal " + name +  " Discoverd in " + discoveryYear;
    }
}
