package OOP;

public class Primate extends Mammals{
    private String strepsirrhinesOrHaplorhines;
    private String terrestrialOrArboreal;

    public Primate(String animalPhyla,
                   String animalClass,
                   boolean hasJointLegs,
                   String bloodType,
                   boolean backbonePresence,
                   int legsNum,
                   String sound,
                   String hairOrFur,
                   String strepsirrhinesOrHaplorhines,
                   String terrestrialOrArboreal) {
        super(animalPhyla, animalClass, hasJointLegs, bloodType, backbonePresence, legsNum, sound, hairOrFur);
        this.strepsirrhinesOrHaplorhines = strepsirrhinesOrHaplorhines;
        this.terrestrialOrArboreal = terrestrialOrArboreal;
    }

    @Override
    public void animalsPrint() {
        super.animalsPrint();
        System.out.println("strepsirrhinesOrHaplorhines: " + strepsirrhinesOrHaplorhines + "\nterrestrialOrArboreal: " + terrestrialOrArboreal);
    }
}
