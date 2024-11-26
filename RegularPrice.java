public class RegularPrice extends Price {
    @Override
    public double getCharge(int daysRented) {
        double result = 2;
        if (daysRented > 2)
            result += (daysRented - 2) * 1.5;
        return result;
    }

    // Usa o método genérico herdado de Price
    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return super.getFrequentRenterPoints(daysRented);  // Retorna 1 ponto
    }
}