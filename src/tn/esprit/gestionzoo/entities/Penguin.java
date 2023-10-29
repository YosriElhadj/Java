package tn.esprit.gestionzoo.entities;

public class Penguin extends Terrestrial {
    private float swimmingDepth;


    public Penguin(){}


    public Penguin(float swimmingDepth) {
        super();
        this.swimmingDepth = swimmingDepth;
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "swimmingDepth=" + swimmingDepth +
                '}';
    }

  
    public void swim() {
        System.out.println("The penguin is swimming at a depth of " + swimmingDepth + " meters.");
    }
}
