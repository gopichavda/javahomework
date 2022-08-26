package N.Inheritance;

public class RunTest {
    public static void main(String[] args) {
       Book b = new Book();
        System.out.println("Book");
       b.OpenBook();
       b.ReadBook();
       b.AddBookMark();
       b.CloseBook();
        System.out.println("ComicBook");
       ComicBook c = new ComicBook();
       c.OpenBook();
       c.ReadBook();
       c.AddBookMark();
       c.CloseBook();
        System.out.println("FantasyBook");
        FantasyBook f = new FantasyBook();
        f.OpenBook();
        f.ReadBook();
        f.AddBookMark();
        f.CloseBook();
        System.out.println("StoryBook");
        StoryBook s = new StoryBook();
        s.OpenBook();
        s.ReadBook();
        s.AddBookMark();
        s.CloseBook();
        System.out.println("Script");
        Script s1 = new Script();
        s1.NumberOfPages();



    }
}
