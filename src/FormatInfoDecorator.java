public class FormatInfoDecorator extends BookDecorator{
    private String format;

    public FormatInfoDecorator(IBook book, String format) {
        super(book);
        this.format = format;
    }

    @Override
    public void showBookInfo() {
        super.showBookInfo();
        System.out.println("Format: " + format);
    }
}
