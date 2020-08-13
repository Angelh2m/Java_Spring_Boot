import java.util.ArrayList;

public class UseArrayList {


    ArrayList<String> cars = new ArrayList<String>();



    public void run(){
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

//        Overide
        cars.set(0, "Tesla");
        System.out.println(cars);
//        Remove
        cars.remove(0);
        System.out.println(cars);

        int size = cars.size();
        System.out.println(size);

////        Eliminate everything
//        cars.clear();
//        System.out.println(cars);

        cars.forEach(str->System.out.println(str));


    }

}
