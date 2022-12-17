import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Movie theMovie = new Adventure("Goat");
//        ScienceFiction scienceFiction = new ScienceFiction("GOD");
//        scienceFiction.watchMovie();
//        theMovie.watchMovie();

//            Movie theMovie = Movie.getMovie("Comedy", "Star wars");
//            theMovie.watchMovie();

        Scanner s = new Scanner(System.in);
        while (true){
            System.out.println("Enter type (A for adventure, C for comedy, " +
                    " S for Science fiction, or Q to quit): ");
            String type = s.nextLine();
            if ("Qq".contains(type)){
                break;
            }
            System.out.println("ENter movie title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
    }
}
