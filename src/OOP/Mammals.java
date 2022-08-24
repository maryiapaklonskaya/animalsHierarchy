package OOP;

public class Mammals extends Animals{
    private int legsNum;
    private String sound;
    private String hairOrFur;

    public Mammals(String animalPhyla,
                   String animalClass,
                   boolean hasJointLegs,
                   String bloodType,
                   boolean backbonePresence,
                   int legsNum,
                   String sound,
                   String hairOrFur) {
        super(animalPhyla, animalClass, hasJointLegs, bloodType, backbonePresence);
        this.legsNum = legsNum;
        this.sound = sound;
        this.hairOrFur = hairOrFur;
    }

    @Override //annotation of overwrite of the parent inside a child
    public void animalsPrint() {
        super.animalsPrint();
        System.out.println("legsNum: " + legsNum + "\nsound: " + sound + "\nhairOrFur: " + hairOrFur);
    }


}
