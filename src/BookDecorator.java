public abstract class BookDecorator implements IBook{
    protected IBook book;

    public BookDecorator(IBook book) {
        this.book = book;
    }

    @Override
    public void showBookInfo() {
        book.showBookInfo();
    }
}
