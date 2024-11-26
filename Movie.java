public class Movie {
   public static final int REGULAR = 0;
   public static final int NEW_RELEASE = 1;
   public static final int CHILDRENS = 2;

   private String _title;
   private Price _price; // Alterado para ser do tipo Price

   // Construtor atualizado para usar setPriceCode
   public Movie(String title, int priceCode) {
       _title = title;
       setPriceCode(priceCode); // Define o tipo de preço
   }

   // Método para obter o código do preço
   public int getPriceCode() {
       return _price.getPriceCode(); // Delegação para a instância de Price
   }

   // Método para definir o tipo de preço
   public void setPriceCode(int arg) {
       switch (arg) {
           case REGULAR:
               _price = new RegularPrice(); // Cria a classe de preço regular
               break;
           case CHILDRENS:
               _price = new ChildrensPrice(); // Cria a classe de preço infantil
               break;
           case NEW_RELEASE:
               _price = new NewReleasePrice(); // Cria a classe de preço de lançamentos
               break;
           default:
               throw new IllegalArgumentException("Incorrect Price Code"); // Erro para código de preço inválido
       }
   }

   // Método para obter o título do filme
   public String getTitle() {
       return _title;
   }
}
