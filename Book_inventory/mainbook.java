import java.util.ArrayList;

public class mainbook {

    public static void main(String[] args) {

        ArrayList<book> alb = new ArrayList<>();

        try {
            book b1 = new book("Icon", 499, "Fiction");
            alb.add(b1);

            book b2 = new book();
            alb.add(b2);

            book b3 = new book(b2);
            b3.title = "Harry Potter";
            b3.author = "JK Rowling";
            alb.add(b3);

            book b4 = new book("Outlive", 370, "ABDK223", "Non-fiction", "Peter Attia");
            alb.add(b4);

            book b5 = new book("My Experiments with Truth", 549, "ABCD3101",
                    "Fiction", "Mahatma Gandhi");
            alb.add(b5);

            book b6 = new book("Mein Kampf", 999, "NA67ZI",
                    "Auto-biography", "Adolf Hitler");
            alb.add(b6);
        }
        catch (InvalidPriceException ip) {
            System.out.println(ip.getMessage());
        }
        catch (InvalidBookGenreException ibg) {
            System.out.println(ibg.getMessage());
        }

        int totalPrice = 0;
        int count = 0;
        int fictionCount = 0;

        // Print Fiction books
        for (book b : alb) {
            if (b.genre.equals("Fiction")) {
                System.out.println("------------------");
                System.out.println(b.title);
                System.out.println(b.price);
                System.out.println(b.author);
                System.out.println(b.ISBN);
                System.out.println(b.genre);
                System.out.println("------------------");
                fictionCount++;
            }
        }

        System.out.println("Fiction books: " + fictionCount);

        // Calculate average price
        for (book b : alb) {
            totalPrice += b.price;
            count++;
        }

        System.out.println("Average price: " + (totalPrice / count));
    }
}
