public abstract class Price {
    public abstract double getCharge(int daysRented);
    
    // Versão genérica para pontos
    public int getFrequentRenterPoints(int daysRented) {
        return 1;  // Filmes normais dão 1 ponto
    }
}
