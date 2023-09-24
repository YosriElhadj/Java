public class Animal {
    String family,nameAnimal;
    int age;
    boolean isMammal;

    public Animal(){}

    public Animal(String family,String nameAnimal,int age,boolean isMammal)
    {
        this.family=family;
        this.nameAnimal=nameAnimal;
        this.age=age;
        this.isMammal=isMammal;
    }

    public void displayAnimal()
    {
        System.out.println("Family :" +family);
        System.out.println("name : "+nameAnimal);
        System.out.println("age :" +age);
        System.out.println("Mammal : "+isMammal);
    }

    @Override
    public String toString() {
        return "Animal: " + nameAnimal + "\nFamily: " + family + "\nAge: " + age + " years\nMammal: " + isMammal;
    }


}
