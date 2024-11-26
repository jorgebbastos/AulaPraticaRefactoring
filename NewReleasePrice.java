public class NewReleasePrice extends Price {
    @Override
    public double getCharge(int daysRented) {
        return daysRented * 3; // O preço é fixo por dia para filmes de lançamento
    }
}
