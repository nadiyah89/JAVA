import java.util.Scanner;

class Movie {
    String name, director;
    int year;
    double rating;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Movie Name: ");
        name = sc.nextLine();
        System.out.print("Enter Director: ");
        director = sc.nextLine();
        System.out.print("Enter Release Year: ");
        year = sc.nextInt();
        System.out.print("Enter Rating: ");
        rating = sc.nextDouble();
    }

    void display() {
        System.out.println(name + " (" + year + "), Directed by " + director + ", Rating: " + rating);
    }

    boolean aboveThreshold(double t) {
        return rating > t;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movie[] movies = new Movie[3];
        for (int i = 0; i < 3; i++) {
            movies[i] = new Movie();
            movies[i].input();
        }
        System.out.print("Enter rating threshold: ");
        double th = sc.nextDouble();
        System.out.println("Movies above threshold:");
        for (Movie m : movies) {
            if (m.aboveThreshold(th))
                m.display();
        }
    }
}

