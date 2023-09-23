import java.util.Scanner;

public class ZooManagement {
    public static void main(String args[]){

        int nbrCages;
        String zooName="my zoo";
        Scanner scanner=new Scanner(System.in);
        System.out.println("Number of cages : ");
        nbrCages=scanner.nextInt();

        while(nbrCages>25)
        {
            System.out.println("CAGE NUMBER MUST BE UNDER 25 CAGES!!!!!!");
            System.out.println("Cage Number : ");
            nbrCages=scanner.nextInt();
        }

        System.out.println(zooName+" comporte "+nbrCages+" cages");
        Animal Myanimal=new Animal("Felidae","lion",6,true);
        Zoo Myzoo=new Zoo("MyZoo","tunis",nbrCages);

        Myzoo.displayZoo();

        Animal cat=new Animal("piw","cat",5,false);
        Myzoo.addAnimal(cat);

    }
}
