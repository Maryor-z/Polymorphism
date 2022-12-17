public class Movie {

    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie(){

        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    }

    public static Movie getMovie(String type, String title){
        return switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }
}

class Adventure extends Movie {

    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "fantasy", "fun", "musical");
    }

    public void watchAdventure(){
        System.out.println("Watching an adventure");
    }
}

class Comedy extends Movie {

        public Comedy (String title) {
            super(title);
        }
    
        @Override
        public void watchMovie() {
            super.watchMovie();
            System.out.printf(".. %s%n".repeat(3),
                    "funny", "humour", "dull");
        }
        public void comedy(){
            System.out.println("watching a comedy");
        }

    public void watchComedy() {
            return;
    }
}
class ScienceFiction extends Movie {

    public ScienceFiction(String title) {
        super(title);
    }
    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Elon", "space", "X");
    }

    public void watchScienceFiction() {
        System.out.println("watching a science fiction");
    }
}




