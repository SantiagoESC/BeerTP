package Model;

public class BeerConsumer extends Thread implements Runnable{
    //region Attributes
    private BeerHouse beerHouse;
    //endregion

    //region Constructor
    public BeerConsumer(BeerHouse b1) {
        this.beerHouse = b1;
    }
    //endregion

    //region Methods

    //Esta funcion inicia con un random para recorrer como maximo esa cantidad de veces
    //Mientras se recorre el for, va generando numeros aleatorios para eliminar una cierta cantidad de cervezas
    //Se consume y se printea.
    @Override
    public synchronized void run() {
        int BeersDeleted = 0;
        int Time =  1+(int)(Math.random()*((100)+1));

        for (int i=0; i<Time; i++){
            int BeersToDelete = 1+(int)(Math.random()*((100)+1));
            if((beerHouse.getStock()) == 0 && beerHouse.getStock()< BeersToDelete){
                try{
                    BeerConsumer.sleep(Time);
                }catch (InterruptedException e) { e.printStackTrace(); }
            }
            else{
                BeersDeleted += BeersToDelete;
                System.out.println("Consumer:");
                System.out.println("Stock :" +beerHouse.getStock());
                System.out.println("Beer Consumed :" +BeersToDelete);
                System.out.println("---------------------------");
                beerHouse.BeerDelete(BeersToDelete);
            }
            notifyAll();
        }

        System.out.println("Cervezas consumidas :" +BeersDeleted);
    }
    //endregion

}
