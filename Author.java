import java.util.*;
class Author
{
  private String name;
  private String email;
  private char gender;
  public Author(String name, String email, char gender)
  {
    this.name=name;
    this.email.email;
    this.gender=gender;
  }
  public String getName()
  {
    return name;
  }
  public String getEmail()
  {
    return email;
  }
  public String getGender()
  {
    return gender;
  }
  public void setEmail(String email)
  {
    this.email=email;
  }
  public String toString()
  {
    return "Author[name='+name+', email='+email+', gender='+gender+']";
  }
}
class Book
  {
    private String name;
    private Author author;
    private double price;
    private int qtystock;
    public Book(String name, Author author, double price, int qtystock)
    {
      this.name=name;
      this.author=author;
      this.price=price;
      this.qtystock=qtystock;
    }
    public String getName()
    {
      return name;
    }
    public Author getauthor()
    {
      return author;
    }
    public double getprice()
    {
      return price;
    }
    public int qtystock()
    {
      return qtystock;
    }
    public void setprice(double price)
    {
      this.price=price;
    }
    public void setqtystock(int qtystock)
    {
      this.qtystock=qtystock;
    }
    publis String toString()
    {
      return "Book[name='+name+', '+author.toString()+', price='+price+', qtystock='+qtystock+']";
    }
  }
  public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter author name: ");
        String authorName = sc.nextLine();

        System.out.print("Enter author email: ");
        String authorEmail = sc.nextLine();

        System.out.print("Enter author gender (M/F): ");
        char authorGender = sc.next().charAt(0);

        Author author = new Author(authorName, authorEmail, authorGender);

        sc.nextLine();

        System.out.print("Enter book name: ");
        String bookName = sc.nextLine();

        System.out.print("Enter book price: ");
        double bookPrice = sc.nextDouble();

        System.out.print("Enter quantity in stock: ");
        int qty = sc.nextInt();

        Book book = new Book(bookName, author, bookPrice, qty);

        System.out.println("\nBook Details:");
        System.out.println(book.toString());

        sc.close();
    }
}
    
