import lab2.ex1.Book;

public class Library {
  public static void main(String arg[]) {
    final String array[] = {"Basic Java", "Advance Java", "Forget about Java"};
    Book b = new Book(array);
    System.out.println("The title of Chapter 1 is"+b.getChapter(1));
    String anotherArray[] = b.getChapters();

    System.out.println("There are " + anotherarray.length + "chapters.");
    System.out.println(anotherArray);
  }

  public boolean someLibraryMethod() {
    return true;
  }
}
