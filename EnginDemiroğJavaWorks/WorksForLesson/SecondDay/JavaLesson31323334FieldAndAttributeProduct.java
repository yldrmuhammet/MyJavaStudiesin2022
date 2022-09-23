public class JavaLesson31323334FieldAndAttributeProduct {

    // Hand Write This Time 

    // Attiribute
    private int _id;
    String _name;
    private String _desciription;
    private double _price;
    private int _stockAmount;
    private String _color;
   

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        _id = id; // İçerisinde bulunduğumuz class Önemli Ezber Getter Setter yapma
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getDescription() {
        return _desciription;
    }

    public void setDescription(String description) {
        _desciription = description;
    }

    public double getPrice() {
        return _price;
    }

    public void setPrice(Double price) {
        _price = price;
    }

    public int getStockAmount() {
        return _stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        _stockAmount = stockAmount;
    }

    public String getColor() {
        return _color;
    }

    public void setColor(String color) {
        _color = color;
    }

    public String getCode() {
        return this._name.substring(0,1) +_id;
    }

  
  
}
