package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {

    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.setName("Simba");
        lion.setAge(0);
        lion.setFamily("Cats");
        lion.setIsMammal(true);

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        Zoo notMyZoo = new Zoo("WaterPark", "Siliana");


        Animal dog = new Animal("Canine", "Snoopy", 2, true);


        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "lll", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

        //   System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();


        System.out.println(myZoo);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(dog2);
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(lion));
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(dog2));
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(dog));
        myZoo.displayAnimals();

//        System.out.println(Zoo.comparerZoo(myZoo, notMyZoo));
//        System.out.println(myZoo.isZooFull());

        Terrestrial animalTeresstial=new Terrestrial();
        Aquatic animalAquatique=new Aquatic();
        Dolphin dolphin=new Dolphin();
        Penguin penguin=new Penguin();

        animalAquatique.setHabitat("Polar");
        animalTeresstial.setNbrLegs(2);
        dolphin.setSwimmingSpeed(2.5f);
        penguin.setSwimmingDepth(6.8f);

        System.out.println(animalAquatique);
        System.out.println(animalTeresstial);
        System.out.println(dolphin);
        System.out.println(penguin);

        animalAquatique.swim();
        //penguin.swim();  public void swim won't work on penguin because it does not extend from aquatic
        dolphin.swim();

    }

}
