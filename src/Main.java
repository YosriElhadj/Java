public class Main {
    public static void main(String[] args) {
        Departement dep1 = new Departement(1, "Informatique", 50);
        Departement dep2 = new Departement(2, "Ressources Humaines", 20);

        // Utilisation des méthodes de l'interface
        dep1.ajouterDepartement(dep2);
        System.out.println("Recherche par nom : " + dep1.rechercherDepartement("Informatique"));
        System.out.println("Recherche par objet : " + dep1.rechercherDepartement(dep2));

        dep1.displayDepartement();
    }
}
