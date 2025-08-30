import java.util.Scanner;

class Book {
    String title, author, publisher;
    double price;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Title: ");
        title = sc.nextLine();
        System.out.print("Enter Author: ");
        author = sc.nextLine();
        System.out.print("Enter Publisher: ");
        publisher = sc.nextLine();
        System.out.print("Enter Price: ");
        price = sc.nextDouble();
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author +
                           ", Publisher: " + publisher + ", Price: " + price);
    }

    boolean search(String t) {
        return title.equalsIgnoreCase(t);
    }

    public static void main(String[] args) {
        Book b = new Book();
        b.input();
        b.display();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter title to search: ");
        String t = sc.nextLine();
        if (b.search(t))
            System.out.println("Book Found!");
        else
            System.out.println("Book Not Found.");
    }
}
