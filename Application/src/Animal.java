public class Animal {
    String family,name;
    int age;
    boolean isMammal;

    public Animal(){}

    public Animal(String family,String name,int age,boolean isMammal)
    {
        this.family=family;
        this.name=name;
        this.age=age;
        this.isMammal=isMammal;
    }

    public void displayAnimal()
    {
        System.out.println("Family :" +family);
        System.out.println("name : "+name);
        System.out.println("age :" +age);
        System.out.println("Mammal : "+isMammal);
    }


}
