import java.util.Enumeration;
import java.util.Vector;

public class Customer {
   private String _name;
   private Vector _rentals = new Vector();

   public Customer(String name) {
      _name = name;
   }

   public void addRental(Rental arg) {
      _rentals.addElement(arg);
   }

   public String getName() {
      return _name;
   }

   public String statement() {
      Enumeration rentals = _rentals.elements();
      String result = "Rental Record for " + getName() + "\n";
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();

         // Show figures for this rental
         result += "\t" + each.getMovie().getTitle() + "\t" + 
                   String.valueOf(each.getCharge()) + "\n";
      }

      // Add footer lines
      result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
      result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + 
                " frequent renter points";
      return result;
   }

   // Existing methods for total charge and frequent renter points
   private double getTotalCharge() {
      double result = 0;
      Enumeration rentals = _rentals.elements();
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         result += each.getCharge();
      }
      return result;
   }

   private int getTotalFrequentRenterPoints() {
      int result = 0;
      Enumeration rentals = _rentals.elements();
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         result += each.getFrequentRenterPoints();
      }
      return result;
   }

   // New method to generate statement in HTML format
   public String htmlStatement() {
      Enumeration rentals = _rentals.elements();
      String result = "<H1>Rentals for <EM>" + getName() + "</EM></H1><P>\n";
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         
         // Show figures for each rental in HTML
         result += each.getMovie().getTitle() + ": " +
                  String.valueOf(each.getCharge()) + "<BR>\n";
      }

      // Add footer lines in HTML
      result += "<P>You owe <EM>" + String.valueOf(getTotalCharge()) + "</EM><P>\n";
      result += "On this rental you earned <EM>" + 
            String.valueOf(getTotalFrequentRenterPoints()) + 
            "</EM> frequent renter points<P>";
      return result;
   }
}
