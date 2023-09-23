
public class Zoo extends Animal {
    Animal [] animals;
    String name,city;
    int nbrCages;

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


    public boolean addAnimal(Animal animal)
    {
        int i=0;
        while (i<nbrCages) {
            animals[i]=animal;
            i++;
        }
    return true;}
}
