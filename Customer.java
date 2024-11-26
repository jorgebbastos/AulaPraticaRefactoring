class Customer {
   public String statement() {
       return new TextStatement().value(this);
   }
}
