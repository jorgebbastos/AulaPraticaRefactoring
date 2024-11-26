public abstract class Statement {

    // Método Template que estrutura a lógica comum
    public String value(Customer aCustomer) {
        String result = header(aCustomer);
        result += body(aCustomer);
        result += footer(aCustomer);
        return result;
    }

    // Parte comum: cabeçalho
    private String header(Customer aCustomer) {
        return "Rental Record for " + aCustomer.getName() + "\n";
    }

    // Parte comum: rodapé
    private String footer(Customer aCustomer) {
        String result = "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + " frequent renter points";
        return result;
    }

    // Métodos abstratos a serem implementados pelas subclasses
    protected abstract String body(Customer aCustomer);
}
