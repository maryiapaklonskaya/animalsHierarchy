import OOP.*;

public class Main {
    public static void main(String[] args) {
        Animals animal1 = new Animals("Vertebrates", "Mammal", false, "warm", true);
        System.out.println("\nEXAMPLE OF ANIMALS CLASS");
        animal1.animalsPrint();

        Mammals mammal1 = new Mammals("Phyla example", "birds", true, "warm", true, 2, "quack", "heather");
        System.out.println("\nEXAMPLE OF ANIMALS-MAMMALS CLASS");
        mammal1.animalsPrint();

        Carnivora carnivora1 = new Carnivora("Chordata", "Mammalia", true, "warm", true, 4, "rawr", "fur", "cat-like");
        System.out.println("\nEXAMPLE OF ANIMALS-MAMMALS-CARNIVORA CLASS");
        carnivora1.animalsPrint();

        Rodent rodent1 = new Rodent("Vertebrates", "Mammal", true, "warm", true, 4, "pisk!", "fur", "aerial");
        System.out.println("\nEXAMPLE OF ANIMALS-MAMMALS-RODENT CLASS");
        rodent1.animalsPrint();

        Primate primate1 = new Primate("Vertebrates", "Mammal", true, "warm", true, 2, "aaargh", "fur", "haplorhines", "arboreal");
        System.out.println("\nEXAMPLE OF ANIMALS-MAMMALS-PRIMATE CLASS");
        primate1.animalsPrint();

        Cat yodaKit = new Cat("Vertebrates", "Mammal", true, "warm", true, 4, "MEOW!", "fur", "cat-like", true, 3, "small", "scottish fold");
        System.out.println("\nEXAMPLE OF ANIMALS-MAMMALS-CARNIVORA-CAT CLASS");
        yodaKit.animalsPrint();


    }
}