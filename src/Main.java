import Model.BeerConsumer;
import Model.BeerHouse;
import Model.BeerProducter;

public class Main {
    public static void main(String[] args) {
        BeerHouse cheverry = new BeerHouse(0);

        BeerProducter p1 = new BeerProducter(cheverry);

        BeerConsumer c1 = new BeerConsumer(cheverry);

        p1.start();
        c1.start();
        /*
        p1.run();
        c1.run();*/

    }
}
