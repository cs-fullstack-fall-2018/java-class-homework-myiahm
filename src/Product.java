public class Product{


    private String nameAtStart;
    private double priceAtStart;
    private int amountAtStart;

    public Product (String nameAtStart, double priceAtStart,int amountAtStart)
    {
        this.nameAtStart = nameAtStart;
        this.priceAtStart = priceAtStart;
        this.amountAtStart = amountAtStart;
    }

    public String printProduct() {
       String printProduct = this.nameAtStart + this.priceAtStart + this.amountAtStart;
        return printProduct;


    }
}
