package tn.esprit.gestionzoo.entities;

public class Zoo {

    static final int NUMBER_OF_CAGES = 25;
    private Animal[] animals;
    private String name, city;
    private int nbrAnimals;
    private Aquatic[] aquaticAnimals = new Aquatic[10];
    public int NbrAquaticAnimals;

    private Terrestrial[] terrestrialAnimals = new Terrestrial[];

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

    public Aquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }

    public void setAquaticAnimals(Aquatic[] aquaticAnimals) {
        this.aquaticAnimals = aquaticAnimals;
    }

    public void addAquaticAnimal(Aquatic aquatic) {
        if (NbrAquaticAnimals < aquaticAnimals.length) {
            aquaticAnimals[NbrAquaticAnimals] = aquatic;
            NbrAquaticAnimals=NbrAquaticAnimals + 1;
        } else {
            System.out.println("Table aquatique animal is full");
        }
    }

    public void showAquaticAnimals() {
        System.out.println("les animaux aquatiques " + getName() + ":");
        for (int i = 0; i < NbrAquaticAnimals; i++) {
            System.out.println(aquaticAnimals[i]);
        }
    }

    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0.0f; // Initialize to a low value

        for (Terrestrial teranimal : terrestrialAnimals) {
            if (teranimal instanceof Penguin) {
                Penguin penguin = (Penguin) teranimal; // Cast to Penguin
                float penguinDepth = penguin.getSwimmingDepth();
                if (penguinDepth > maxDepth) {
                    maxDepth = penguinDepth;
                }
            }
        }

        return maxDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int numberOfDolphins = 0;
        int numberOfPenguins = 0;

        for (Aquatic aquaticAnimal : aquaticAnimals) {
            if (aquaticAnimal instanceof Dolphin) {
                numberOfDolphins++;
            } else  {
                numberOfPenguins++;
            }
        }

        System.out.println("Number of Dolphins: " + numberOfDolphins);
        System.out.println("Number of Penguins: " + numberOfPenguins);
    }



}
