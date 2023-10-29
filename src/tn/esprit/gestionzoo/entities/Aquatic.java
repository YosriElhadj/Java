package tn.esprit.gestionzoo.entities;

public class Aquatic {
    private String habitat;

    public Aquatic()
    {}

    public Aquatic(String habitat) {
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Aquatic{" +
                "habitat='" + habitat + '\'' +
                '}';
    }

    public void swim()
    {
        System.out.println("This aquatic animal is swimming");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Aquatic other = (Aquatic) obj;

        return this.getHabitat().equals(other.getHabitat());
    }

}
