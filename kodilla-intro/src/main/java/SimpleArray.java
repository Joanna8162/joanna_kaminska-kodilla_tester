public class SimpleArray {
    public static void main(String[] args) {

        String[] movies = new String [5];
        movies[0] = "Dune";
        movies[1] = "Barbie";
        movies[2] = "Joker";
        movies[3] = "Tenet";
        movies[4] = "Avatar";

        String movie = movies[3];
        System.out.println(movie);

        int numberOfElements = movies.length;
        System.out.println("Moja tablica zawiera " + numberOfElements + " elementów");


    }
}