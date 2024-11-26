public class Movie {
   // Códigos de tipo de filme
   public static final int REGULAR = 0;
   public static final int NEW_RELEASE = 1;
   public static final int CHILDRENS = 2;

   private String _title;
   private Price _price; // Responsável pelo tipo de preço

   // Construtor para inicializar o título e o tipo de preço
   public Movie(String title, int priceCode) {
       _title = title;
       setPriceCode(priceCode);
   }

   // Delegando a responsabilidade do cálculo da cobrança para Price
   public double getCharge(int daysRented) {
       return _price.getCharge(daysRented); // Chama o método na instância de Price
   }

   // Método para obter o código do preço
   public int getPriceCode() {
       return _price.getPriceCode();
   }

   // Método para definir o tipo de preço
   public void setPriceCode(int arg) {
       switch (arg) {
           case REGULAR:
               _price = new RegularPrice(); // Cria uma instância do preço regular
               break;
           case CHILDRENS:
               _price = new ChildrensPrice(); // Cria uma instância do preço infantil
               break;
           case NEW_RELEASE:
               _price = new NewReleasePrice(); // Cria uma instância do preço de lançamento
               break;
           default:
               throw new IllegalArgumentException("Incorrect Price Code");
       }
   }

   // Método para obter o título do filme
   public String getTitle() {
       return _title;
   }

public int getFrequentRenterPoints(int _daysRented) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getFrequentRenterPoints'");
}
}
