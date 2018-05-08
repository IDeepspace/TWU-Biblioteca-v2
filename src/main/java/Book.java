public class Book {

  private Long id;
  private String name;
  private String author;
  private int year;
  private boolean checkoutStatus;

  public Book() {}

  public Book(String name, String author, int year, boolean checkoutStatus) {
    this.name = name;
    this.author = author;
    this.year = year;
    this.checkoutStatus = checkoutStatus;
  }

  public Book(Long id, String name, String author, int year, boolean checkoutStatus) {
    this.id = id;
    this.name = name;
    this.author = author;
    this.year = year;
    this.checkoutStatus = checkoutStatus;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public boolean isCheckoutStatus() {
    return checkoutStatus;
  }

  public void setCheckoutStatus(boolean checkoutStatus) {
    this.checkoutStatus = checkoutStatus;
  }
}