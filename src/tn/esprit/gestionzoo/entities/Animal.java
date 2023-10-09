package tn.esprit.gestionzoo.entities;

public class Animal {

    private String family, name;
    private int age;
    private boolean isMammal;

    public Animal() {

    }

    public Animal(String family, String name, int age, boolean isMammal) {
        setFamily(family);
        setName(name);
        setAge(age);
        setIsMammal(isMammal);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "family='" + getFamily() + '\'' +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", isMammal=" + getIsMammal() +
                '}';
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }
    public String getFamily(){
        return family;
    }

    public void setFamily(String family)
    {
        this.family=family;
    }
    public int getAge(){
        return age;
    }

    public void setAge(int age)
    {
        if(age>0)
        { this.age=age;}
    }

    public boolean getIsMammal()
    {
        return isMammal;
    }

    public void setIsMammal(boolean isMammal)
    {
        this.isMammal=isMammal;
    }
}
