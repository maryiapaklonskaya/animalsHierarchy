package OOP;

public class Cat extends Carnivora{
    private boolean isPet;
    private int age;
    private String largeOrSmall;
    private String family;

    public Cat(String animalPhyla,
               String animalClass,
               boolean hasJointLegs,
               String bloodType,
               boolean backbonePresence,
               int legsNum,
               String sound,
               String hairOrFur,
               String catLikeOrDogLike,
               boolean isPet,
               int age,
               String largeOrSmall,
               String family) {
        super(animalPhyla, animalClass, hasJointLegs, bloodType, backbonePresence, legsNum, sound, hairOrFur, catLikeOrDogLike);
        this.isPet = isPet;
        this.age = age;
        this.largeOrSmall = largeOrSmall;
        this.family = family;
    }

    @Override
    public void animalsPrint(){
        super.animalsPrint();
        System.out.println("\nisPet: " + isPet + "\nage: " + age + "\nlargeOrSmall: " + largeOrSmall + "\nfamily: " + family);
    }
}
