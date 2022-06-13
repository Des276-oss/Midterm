public class Printer extends Products{
    private static final int purchPrice=200000;
    int quantity;
    public Printer(String name, String manufact, int versNumb, int quantity) {
        super(name, manufact, versNumb);
        this.quantity=quantity;
    }
    public int dispPrice(){
        return purchPrice*quantity;
    }
    public int dispQuant(){
        return quantity;
    }
    public int storeValue(){
        return purchPrice+quantity;
    }
    public String prodName(){
        return "Printer";
    }
    public String toString() {
        return super.toString()+"\t"+purchPrice+"\t"+dispQuant()+"\t"+dispPrice()+"\t"+storeValue()+"\t"+prodName();
    }
}

