public class Rental {
   private Movie _movie;
   private int _daysRented;

   public Rental(Movie movie, int daysRented) {
       _movie = movie;
       _daysRented = daysRented;
   }

   public int getFrequentRenterPoints() {
       return _movie.getFrequentRenterPoints(_daysRented); // Delegação para a classe Movie
   }
}
