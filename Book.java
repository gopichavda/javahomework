package N.Inheritance;
/* Open book
read book
add bookmark
close book
 */
public class Book extends Script{
    public void OpenBook(){
        System.out.println("Book.........Open the Book");}
    public void ReadBook(){
        System.out.println("Book.........Read the book");}
    public void AddBookMark(){
        System.out.println("Book.........Add bookmark");}
    public void CloseBook(){
        System.out.println("Bool.........CloseBook");
        System.out.println("Script");
        Script s1 = new Script();
        s1.NumberOfPages();
    }

}
