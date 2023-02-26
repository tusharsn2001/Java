import BookDetails.Book1;
public class Book2
{
    public static void main(String[] args) {
        Book1 b1 = new Book1("Machine Learning","Github",200,"Github",500);
        b1.show();
        Book1 b2 = new Book1("Python","Author",2010,"Github",345);
        b2.show();
    }
}