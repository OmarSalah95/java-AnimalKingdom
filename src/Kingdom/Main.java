package Kingdom;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Mamal Panda = new Mamal("Panda", 1869);
        Mamal Zebra = new Mamal("Zebra", 1778);
        Mamal Koala = new Mamal("Koala", 1816);
        Mamal Sloth = new Mamal("Sloth", 1804);
        Mamal Armadillo = new Mamal("Armadillo", 1758);
        Mamal Raccoon = new Mamal("Raccoon", 1758);
        Mamal Bigfoot = new Mamal("Bigfoot", 2021);

        Bird Pigeon = new Bird("Pigeon", 1837);
        Bird Peacock = new Bird("Peacock", 1821);
        Bird Toucan = new Bird("Toucan", 1758);
        Bird Parrot = new Bird("Parrot", 1824);
        Bird Swan = new Bird("Swan", 1758);

        Fish Salmon = new Fish("Salmon", 1758);
        Fish Catfish = new Fish("Catfish", 1817);
        Fish Perch = new Fish("Perch", 1758);

        ArrayList<AbstractAnimal> animals = new ArrayList<AbstractAnimal>();
        animals.add(Panda);
        animals.add(Zebra);
        animals.add(Koala);
        animals.add(Sloth);
        animals.add(Armadillo);
        animals.add(Raccoon);
        animals.add(Bigfoot);

        animals.add(Pigeon);
        animals.add(Peacock);
        animals.add(Toucan);
        animals.add(Parrot);
        animals.add(Swan);

        animals.add(Salmon);
        animals.add(Catfish);
        animals.add(Perch);

        System.out.println("*** SORTED ANIMALS BY DESCENDING YEAR ***");
        animals.sort((a1, a2) -> a2.getDiscoveryYear() - a1.getDiscoveryYear());
        System.out.println(animals.toString() + "\n");

        System.out.println("*** ALPHABETICALLY SORT ANIMALS ***");
        animals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        System.out.println(animals.toString() + "\n");

        System.out.println("*** ANIMAL MOVEMENT ***");
        animals.forEach(a -> System.out.println(a.getMovement() + "\n"));

        System.out.println("*** ANIMALS WITH LUNGS ***");
        animals.forEach(a -> {
            if (a.getBreath().equals("LUNGS")) {
                System.out.println(a.toString() + "\n");
            }
        });

        System.out.println("*** ANIMALS WITH LUNGS AND DISCOVERED IN 1758 ***");
        animals.forEach(a -> {
            if ((a.getBreath().equals("Lungs")) && (a.getDiscoveryYear() == 1758)) {
                System.out.println(a.toString() + "\n");
            }
        });

        System.out.println("*** ALPHABETICALLY SORT ANIMALS THAT WERE NAMED IN 1758");
        animals.forEach(a -> {
            if (a.getDiscoveryYear() == 1758)
                System.out.println(a.toString() + "\n");

        });
    }
}