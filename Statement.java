public abstract class Statement {

    // Método Template que estrutura a lógica comum
    public String value(Customer aCustomer) {
        String result = header(aCustomer);  // Cabeçalho
        result += body(aCustomer);          // Corpo (abstrato, será implementado nas subclasses)
        result += footer(aCustomer);        // Rodapé
        return result;
    }

    // Parte comum: Cabeçalho
    private String header(Customer aCustomer) {
        return "Rental Record for " + aCustomer.getName() + "\n";
    }

    // Parte comum: Rodapé
    private String footer(Customer aCustomer) {
        String result = "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + " frequent renter points";
        return result;
    }

    // Método abstrato: Corpo do relatório (a parte que varia entre os formatos)
    protected abstract String body(Customer aCustomer);
}
