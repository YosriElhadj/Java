public class ZooManagement {

    public static void main(String[] args) {
        //PROSIT 2
        Animal lion = new Animal();
        lion.name = "Simba";
        lion.age = 8;
        lion.family = "Cats";
        lion.isMammal = true;

        Zoo myZoo = new Zoo();
        myZoo.name = "Wildlife Park";
        myZoo.city = "Ariana";

        myZoo.animals = new Animal[25];


        Animal dog = new Animal("Canine", "Snoopy", 2, true);

        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "Snoopy", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

        System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();

        if (myZoo.isZooFull()) {
            System.out.println("The zoo is full.");
        } else {
            System.out.println("There is still space in the zoo.");
        }

        Zoo zoo1 = new Zoo("Zoo A", "City A",25);
        Zoo zoo2 = new Zoo("Zoo B", "City B",25);

// Ajouter des animaux à zoo1 et zoo2

        Animal elephant = new Animal("hiwhiw", "tawtaw", 10, true);
        Animal giraffe = new Animal("kiwkiw", "halabala", 7, false);
        zoo2.addAnimal(elephant);
        zoo2.addAnimal(giraffe);


        Zoo moreFilledZoo = Zoo.comparerZoo(zoo1, zoo2);

        System.out.println(moreFilledZoo);

    }
}