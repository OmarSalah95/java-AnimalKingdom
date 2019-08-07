package Kingdom;

public class Mamal extends AbstractAnimal {
    public Mamal(String name, int discoveryYear) {
        super(name, discoveryYear);
    }

    @Override
    public String getMovement() {
        return "Walk";
    }

    @Override
    public String getBreath() {
        return "Lungs";
    }

    @Override
    public String getReproduction() {
        return "Live";
    }

}