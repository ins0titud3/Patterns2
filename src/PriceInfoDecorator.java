public class PriceInfoDecorator extends BookDecorator{
    private double price;

    public PriceInfoDecorator(IBook book, double price) {
        super(book);
        this.price = price;
    }

    @Override
    public void showBookInfo() {
        super.showBookInfo();
        System.out.println("Price: $" + price);
    }
}
