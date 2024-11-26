class Customer {
   public String statement() {
       return new TextStatement().value(this);
   }

   public String htmlStatement() {
       return new HtmlStatement().value(this);
   }
}
