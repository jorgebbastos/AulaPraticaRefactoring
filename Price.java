public abstract class Price {
    public abstract int getPriceCode(); // Método para obter o código do preço

    // Método para calcular a cobrança, que será implementado pelas subclasses
    public abstract double getCharge(int daysRented);
}
