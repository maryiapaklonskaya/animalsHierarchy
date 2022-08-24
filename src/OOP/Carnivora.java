package OOP;

public class Carnivora extends Mammals {
    private String catLikeOrDogLike;

    public Carnivora(String animalPhyla,
                     String animalClass,
                     boolean hasJointLegs,
                     String bloodType,
                     boolean backbonePresence,
                     int legsNum,
                     String sound,
                     String hairOrFur,
                     String catLikeOrDogLike) {
        super(animalPhyla, animalClass, hasJointLegs, bloodType, backbonePresence, legsNum, sound, hairOrFur);
        this.catLikeOrDogLike = catLikeOrDogLike;
    }
    @Override //annotation of overwrite of the parent inside a child
    public void animalsPrint() {
        super.animalsPrint();
        System.out.println("catLikeOrDogLike: " + catLikeOrDogLike);
    }
}
