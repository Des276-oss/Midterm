public class Computer extends Products{

    int purchPrice;
    int quantity;

    public Computer(String name, String manufact, int versNumb, int purchPrice) {
        super(name, manufact, versNumb);
        this.purchPrice=purchPrice;
        this.quantity=quantity;
    }

    public Computer(String name, String manufact, int versNum) {
        super(name, manufact, versNum);
    }

    int dispPrice(){
        return purchPrice;
    }
    int dispQuant(){
        return quantity;
    }
    int storeValue(){
        return purchPrice*quantity;
    }
}

