package tn.esprit.gestionzoo.entities;

public class Zoo {

    static final int NUMBER_OF_CAGES = 25;
    private Animal[] animals;
    private String name, city;
    private int nbrAnimals;

    public Zoo() {
    }

    public Zoo(String name, String city) {
        setAnimals(new Animal[NUMBER_OF_CAGES]);
        setName(name);
        setCity(city);
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.getNbrAnimals() > z2.getNbrAnimals())
            return z1;
        return z2;
    }

    public void displayZoo() {
        System.out.println("Name: " + getName() + ", City: " + getCity() + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + getNbrAnimals());
    }

    public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1)
            return false;
        if (isZooFull())
            return false;
        animals[getNbrAnimals()] = animal;
        nbrAnimals++;
        return true;
    }

    public boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < getNbrAnimals(); i++) {
            animals[i] = animals[i + 1];
        }
        animals[getNbrAnimals()] = null;
        this.nbrAnimals--;
        return true;
    }

    public void displayAnimals() {
        System.out.println("List of animals of " + getName() + ":");
        for (int i = 0; i < getNbrAnimals(); i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < getNbrAnimals(); i++) {
            if (animal.getName().equals(animals[i].getName()) )
                return i;
        }
        return index;
    }

    public boolean isZooFull() {
        return getNbrAnimals() == NUMBER_OF_CAGES;
    }

    @Override
     public String toString() {
        return "Name: " + getName() + ", City: " + getCity() + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + getNbrAnimals();
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city=city;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public int getNbrAnimals()
    {
        return nbrAnimals;
    }

    public void setNbrAnimals(int nbrAnimals)
    {
        this.nbrAnimals=nbrAnimals;
    }

    public Animal[] getAnimals()
    {
        return animals;
    }

    public void setAnimals(Animal[] animals)
    {
        this.animals=animals;
    }
}
