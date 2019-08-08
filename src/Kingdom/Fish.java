package Kingdom;

public class Fish extends AbstractAnimal {
    public Fish(String name, int discoveryYear) {
        super(name, discoveryYear);
    }

    @Override
    public String getMovement() {
        return "Swim";
    }

    @Override
    public String getBreath() {
        return "Gills";
    }

    @Override
    public String getReproduction() {
        return "Eggs";
    }

}