public class JavaLesson31323334FieldAndAttributeMain {
    public static void main(String[] args) {

        /*
         * Attiribute
         * int id;
         * String name;
         * String desciription;
         * double price;
         * int stockAmount;
         */

        JavaLesson31323334FieldAndAttributeProduct product = new JavaLesson31323334FieldAndAttributeProduct();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(5000.00);
        product.setStockAmount(3);
        product.setColor("Black");
        

        JavaLesson31323334FieldAndAttirbuteProductManager productManager = new JavaLesson31323334FieldAndAttirbuteProductManager();
        productManager.Add(product);

        System.out.println(product.getCode());
        
    }
}
