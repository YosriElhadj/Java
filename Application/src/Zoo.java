
public class Zoo extends Animal {
    Animal [] animals;
    String name,city;
    int nbrCages;
    int animalCount = 0;

    public Zoo(){}

    public Zoo(String name,String city,int nbrCages)
    {
        this.animals=new Animal[nbrCages];
        this.name=name;
        this.city=city;
        this.nbrCages=nbrCages;
    }

    public void displayZoo()
    {
        System.out.println("zoo name : "+name);
        System.out.println("City : "+city);
        System.out.println("Number of cages : "+nbrCages);
    }


    public boolean addAnimal(Animal animal) {
        if (animalCount < animals.length) {
                animals[animalCount] = animal;
                animalCount++;
                return true;
        } else {
            return false; // Zoo is full, cannot add
        }
    }

    public void displayAnimals() {
        for (int i = 0; i < animalCount; i++) {
            System.out.println("Animal " + (i + 1) + ":");
            animals[i].displayAnimal();
            System.out.println();
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].nameAnimal.equals(animal.nameAnimal)) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].equals(animal)) {
                for (int j = i; j < animalCount - 1; j++) {
                    animals[j] = animals[j + 1];
                }
                animals[animalCount - 1] = null;
                animalCount--;
                return true;
            }
        }
        return false; // Animal not found in the zoo
    }
}
