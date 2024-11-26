public class ChildrensPrice extends Price {
    @Override
    public double getCharge(int daysRented) {
        double result = 1.5; // Preço base para filmes infantis
        if (daysRented > 3) {
            result += (daysRented - 3) * 1.5; // Adiciona um valor extra para dias além de 3
        }
        return result; // Retorna o valor final da cobrança
    }
}
