package Model;

public class BeerProducter extends Thread implements Runnable {

    //region Attributes
    private BeerHouse beerHouse;
    //endregion

    //region Constructor
    public BeerProducter(BeerHouse b) {
        this.beerHouse = b;
    }
    //endregion

    //region Methods

    //Esta funcion inicia de la misma forma con un random del tiempo que va a producir
    //Mientras se recorre va generando un numero aleatorio de la cantidad que va a producir
    //Si el stock mas lo producido es mayor al limite establecido, no lo va a agregar.
    @Override
    public synchronized void run() {

        int BeersAdds = 0;
        int TimesToAdd =  1+(int)(Math.random()*((100)+1));

        for (int i=0; i<TimesToAdd; i++){

            int BeersToAdd = 1+(int)(Math.random()*((100)+1));

            if((BeersToAdd + beerHouse.getStock()) >= 100){
                try{
                    BeerProducter.sleep(TimesToAdd);
                }catch (Exception e) { e.printStackTrace(); }
            }
            else{
                int result = BeersAdds + BeersToAdd;
                if(result> 100){
                    System.out.println("---------------------------");
                    System.out.println("The producer cannot add as many beers: "+BeersToAdd);
                    System.out.println("---------------------------");
                }else {
                    System.out.println("---------------------------");
                    System.out.println("Producter:");
                    System.out.println("Stock :" + beerHouse.getStock());
                    System.out.println("Beer produced :" + BeersToAdd);
                    System.out.println("---------------------------");
                    beerHouse.BeerAdd(BeersToAdd);
                }
            }
            notifyAll();
        }
        System.out.println("Beer produced:" +BeersAdds);
    }


}
