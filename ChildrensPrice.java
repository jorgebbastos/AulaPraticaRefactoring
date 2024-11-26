public class ChildrensPrice extends Price {
    @Override
    public double getCharge(int daysRented) {
        double result = 1.5;
        if (daysRented > 3)
            result += (daysRented - 3) * 1.5;
        return result;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return 1; // Filmes infantis sempre dão 1 ponto
    }
}
