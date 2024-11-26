public class ChildrensPrice extends Price {
    @Override
    public double getCharge(int daysRented) {
        double result = 1.5;
        if (daysRented > 3)
            result += (daysRented - 3) * 1.5;
        return result;
    }

    // Usa o método genérico herdado de Price
    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return super.getFrequentRenterPoints(daysRented);  // Retorna 1 ponto
    }
}