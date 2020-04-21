package Model;

public class BeerHouse {

    //region Attributes
    private int stock;
    //endregion

    //region Constructor
    public BeerHouse(){this.stock=0;}
    public BeerHouse(int stock) {
        this.stock = stock;
    }
    //endregion

    //region Geters and setters

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    //endregion

    //region Methods
    public synchronized void BeerAdd(int cant){
        if((this.stock + cant) <= 100){
            this.stock += cant;
        }
    }

    public synchronized void BeerDelete(int cant){
        if(this.stock >= cant){
            this.stock -= cant;
        }
    }
    //endregion
}
