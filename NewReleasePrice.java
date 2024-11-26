public class NewReleasePrice extends Price {
    @Override
    public double getCharge(int daysRented) {
        return daysRented * 3;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2 : 1; // Filmes de lançamento dão 2 pontos por locação se alugados por mais de 1 dia
    }
}
