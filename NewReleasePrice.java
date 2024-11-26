public class NewReleasePrice extends Price {
    @Override
    public double getCharge(int daysRented) {
        return daysRented * 3;
    }

    // Versão especializada para filmes de lançamento
    @Override
    public int getFrequentRenterPoints(int daysRented) {
        // Filmes de lançamento dão 2 pontos se alugados por mais de 1 dia, senão 1 ponto
        return (daysRented > 1) ? 2 : 1;
    }
}
