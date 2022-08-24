package OOP;

public class Animals {
    private String animalPhyla;
    private String animalClass;
    private boolean hasJointLegs;
    private String bloodType;
    private boolean backbonePresence;

    //initialisation of the variables between the ones we created in class AND the ones we assign
    public Animals(String animalPhyla,
                   String animalClass,
                   boolean hasJointLegs,
                   String bloodType,
                   boolean backbonePresence) {
        this.animalPhyla = animalPhyla;
        this.animalClass = animalClass;
        this.hasJointLegs = hasJointLegs;
        this.bloodType = bloodType;
        this.backbonePresence = backbonePresence;
    }

    public void animalsPrint() {
        System.out.println("Phyla: " + this.animalPhyla + "\nClass: " + this.animalClass + "\nHas JointLegs: " + this.hasJointLegs + "\nbloodType: " +  this.bloodType + "\nHas backbone: " + this.backbonePresence);
    }



}


