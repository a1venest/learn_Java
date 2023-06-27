
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

//        Car bmw = new Car(250.0f,2500,"black",new byte[]{0,0,0});
//        bmw.engine.setValues(false, 2000);
//        bmw.engine.info();
//
//       Truck truck = new Truck(5600, new byte[] {100,0,100}, false);
//       truck.engine.setValues(true, 200);
//       truck.engine.info();
//       truck.setValues(130.0f,5600,"orange", new byte[] {100,0,100}, true);
//       System.out.println(truck.getValues());

        Car flyCar = new Car(250.0f,2500,"black",new byte[]{0,0,0})
        {
            @Override
            public void moveObject(float speed) {
                this.engine.isReady(true);
                System.out.println("Машина летит");
            }
        };

        flyCar.moveObject(450);
    }

}
