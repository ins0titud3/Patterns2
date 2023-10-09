public class Main {
    public static void main(String[] args) {
        IBook book = new Book("Socrates apology");
        book = new AuthorInfoDecorator(book, "Jane Austen");
        book = new PublicationYearDecorator(book, 1813);
        book = new FormatInfoDecorator(book, "Hardcover");
        book = new PriceInfoDecorator(book, 25.99);
        book.showBookInfo();
    }
}