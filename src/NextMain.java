public class NextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("A", "Raw");
        movie.watchMovie();

        Adventure raw = (Adventure) Movie.getMovie("A", "Jaw");
        raw.watchMovie();

        Object comedy = Movie.getMovie("C", "airpplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        var airplane = Movie.getMovie("C", "Airplane");
            airplane.watchMovie();

            var plane = new Comedy("Airplaneaa");
            plane.watchComedy();

            Object unknownObject = Movie.getMovie("S", "Airplane");
            if (unknownObject.getClass().getSimpleName() == "Comedy"){
                Comedy c = (Comedy) unknownObject;
                c.watchComedy();
            } else if (unknownObject instanceof Adventure) {
                ((Adventure) unknownObject).watchAdventure();
            } else if (unknownObject instanceof ScienceFiction syfy) {
                syfy.watchScienceFiction();
            }
    }
}
