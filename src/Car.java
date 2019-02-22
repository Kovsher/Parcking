import java.io.File;

public class Car {
    String colour;
    Boolean automatic=false;
    int weight = 0;
    boolean trailer = false;

    public Car(String color, Boolean automatic, int weight, boolean trailer) {
        this.colour = color;
        this.automatic = automatic;
        this.weight = weight;
        this.trailer = trailer;
    }

    public String getColor() {
        return colour;
    }

    public void setColor(String color) {
        this.colour = color;
    }

    public Boolean getAutomatic() {
        return automatic;
    }

    public void setAutomatic(Boolean automatic) {
        this.automatic = automatic;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isTrailer() {
        return trailer;
    }

    public void setTrailer(boolean trailer) {
        this.trailer = trailer;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + colour + '\'' +
                ", automatic=" + automatic +
                ", weight=" + weight +
                ", trailer=" + trailer +
                '}';
    }
}
