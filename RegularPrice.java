public class RegularPrice extends Price {
    @Override
    public double getCharge(int daysRented) {
        double result = 2; // Preço base para filmes regulares
        if (daysRented > 2) {
            result += (daysRented - 2) * 1.5; // Adiciona um valor extra para dias além de 2
        }
        return result; // Retorna o valor final da cobrança
    }
}
