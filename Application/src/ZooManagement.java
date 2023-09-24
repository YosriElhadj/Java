import java.util.Scanner;

public class ZooManagement {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the zoo name: ");
        String zooName = scanner.nextLine();
        System.out.println("Enter the city: ");
        String zooCity = scanner.nextLine();
        System.out.println("Enter the number of cages: ");
        int zooCages = scanner.nextInt();

        Zoo myZoo = new Zoo(zooName, zooCity, zooCages);

        Animal lion = new Animal("piw", "Lion", 5, true);
        Animal elephant = new Animal("holooo", "Elephant", 20, true);
        Animal giraffe = new Animal("bawbaw", "Giraffe", 5, false);


        myZoo.addAnimal(lion);
        myZoo.addAnimal(elephant);
        myZoo.addAnimal(giraffe);


        myZoo.displayZoo();
        myZoo.displayAnimals();


        Animal searchLion = new Animal("piw", "Lion", 5, true);
        int indice = myZoo.searchAnimal(searchLion);
        if (indice != -1) {
            System.out.println("The animal was found at : " + indice);
        } else {
            System.out.println("The animal was not found in the zoo.");
        }
        
    }
}
