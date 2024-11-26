public class Movie {
   private String _title;
   private Price _price;

   // Construtor, getters e setters

   public int getFrequentRenterPoints(int daysRented) {
       return _price.getFrequentRenterPoints(daysRented);
   }
}
