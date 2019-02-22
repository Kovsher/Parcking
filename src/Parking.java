import java.util.ArrayList;
import java.util.Comparator;

public class Parking {

    private static Object CarWV;
    private static Object CarKia;
    private static Object CarFord600;
    private static Object CarAudi;
    int place;





    public static void main(String[] args) {

        ArrayList<Object> cars = new ArrayList<>(5);

        cars.add(1,CarKia);
        cars.add(2, CarWV);
        cars.add(3,CarFord600);
        cars.add(4,CarAudi);


        Comparator<Car>carComparator=new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return 0;
            }



};


    }
}
