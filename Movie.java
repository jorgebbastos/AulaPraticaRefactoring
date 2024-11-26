public class Movie {
   public static final int REGULAR = 0;
   public static final int NEW_RELEASE = 1;
   public static final int CHILDRENS = 2;

   private String _title;
   private int _priceCode;

   public Movie(String title, int priceCode) {
       _title = title;
       _priceCode = priceCode;
   }

   // Método para calcular pontos de locação
   public int getFrequentRenterPoints(int daysRented) {
       int result = 1; // Ponto padrão

       // Se for um novo lançamento e o aluguel for por mais de um dia, dá um bônus
       if (_priceCode == NEW_RELEASE && daysRented > 1) {
           result++;  // Bônus para filmes novos com mais de 1 dia
       }

       return result;
   }
}
