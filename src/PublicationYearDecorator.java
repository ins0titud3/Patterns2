public class PublicationYearDecorator extends BookDecorator{
    private int PublicationYear;

    public PublicationYearDecorator(IBook book, int PublicationYear) {
        super(book);
        this.PublicationYear = PublicationYear;
    }

    @Override
    public void showBookInfo() {
        super.showBookInfo();
        System.out.println("Year of Publication: " + PublicationYear);
    }
}
