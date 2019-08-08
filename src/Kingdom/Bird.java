package Kingdom;

public class Bird extends AbstractAnimal {
    public Bird(String name, int discoveryYear) {
        super(name, discoveryYear);
    }

    @Override
    public String getMovement() {
        return "Fly";
    }

    @Override
    public String getBreath() {
        return "Lungs";
    }

    @Override
    public String getReproduction() {
        return "Egg";
    }

}