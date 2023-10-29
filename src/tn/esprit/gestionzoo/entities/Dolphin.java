package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic{
    private float swimmingSpeed;

    public Dolphin(){}

    public Dolphin(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public String toString() {
        return "Dolphin{" +
                "swimmingSpeed=" + swimmingSpeed +
                '}';
    }



    public void swim() {
        System.out.println("The dolphin is swimming with a speed of " + swimmingSpeed + " km/h.");
    }
}
