public class NewReleasePrice extends Price {
    @Override
    public int getPriceCode() {
        return Movie.NEW_RELEASE; // Retorna o código para filmes de lançamento
    }

    @Override
    public double getCharge(int daysRented) {
        return daysRented * 3; // Calcula a cobrança para filmes de lançamento
    }
}
