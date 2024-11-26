public class RegularPrice extends Price {
    @Override
    public int getPriceCode() {
        return Movie.REGULAR; // Retorna o código para filmes regulares
    }
}
