package oop1;

public class Main {
    public static void main(String[] args) {

        // Main metod içerisinde oluşturduğumuz classları çağırıp onun içerisine veri
        // ekliyoruz.

        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setUnitPrice(7500);
        product1.setDiscount(7);
        product1.setUnitsInStock(3);
        product1.setImageUrl("bilmemne1.jpg");

        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setUnitPrice(6500);
        product2.setDiscount(6);
        product2.setUnitsInStock(4);
        product2.setImageUrl("bilmemne2.jpg");

        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setUnitPrice(5500);
        product3.setDiscount(5);
        product3.setUnitsInStock(2);
        product3.setImageUrl("bilmemne3.jpg");

        Product[] products = { product1, product2, product3 };

        for (Product product : products) {
            System.out.println(product.getName());
        }

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("051532132");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Muhammet");
        individualCustomer.setLastName("Yıldırım");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(3);
        corporateCustomer.setPhone("0651456465");
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setTaxNumber("12345678911");
        corporateCustomer.setCustomerNumber("54321");

        Customer[] customers = { individualCustomer, corporateCustomer };
        for (Customer customer : customers) {
            System.out.println(customer.getId());

        }

    }
}
