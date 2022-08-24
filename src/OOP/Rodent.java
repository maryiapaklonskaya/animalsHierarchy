package OOP;

public class Rodent extends Mammals{
    private String communicationType;

    public Rodent(String animalPhyla,
                  String animalClass,
                  boolean hasJointLegs,
                  String bloodType,
                  boolean backbonePresence,
                  int legsNum,
                  String sound,
                  String hairOrFur,
                  String communicationType) {
        super(animalPhyla, animalClass, hasJointLegs, bloodType, backbonePresence, legsNum, sound, hairOrFur);
        this.communicationType = communicationType;
    }

    @Override //annotation of overwrite of the parent inside a child
    public void animalsPrint() {
        super.animalsPrint();
        System.out.println("communicationType: " + communicationType);
    }
}
