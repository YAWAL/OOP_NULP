package OOP.KP.KP2;

public class House {

    //ціна за м^2
    private static final int basePrice = 1500;

    //кількість поверхів
    private int stageCount;

    //висота поверху
    private double height;

    //довжина будинку
    private double length;

    //ширина будинку
    private double width;

    //колір будинку
    private Color color;

    //ціна будинку
    private double price;

    public House() {
    }

    public House(int stageCount, double height, double length, double width, Color color) {
        this.stageCount = stageCount;
        this.height = height;
        this.length = length;
        this.width = width;
        this.color = color;
        this.price = length*width*stageCount*basePrice;
    }

    public int getStageCount() {
        return stageCount;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Метод для редагування кольору будинку
    public void repaintHouse(House house, Color newColor) {
        Color currentColor = house.getColor();
        if (currentColor == newColor) {
            System.out.println("Colour is the same as current");
        } else {
            house.setColor(newColor);
            System.out.println("House with colour " + currentColor + " has been repainted with colour " + newColor);
        }
    }

    //Метод для редагування ціни будинку
    public void changePrice(House house, double newPrice ){
        double currentPrice = house.getPrice();
        house.setPrice(newPrice);
        System.out.println("Current price: "+ currentPrice + " => Price has been changed to " + newPrice);
    }

    //Метод для пошуку будинку по кольору
    public void searchByColor(House house, Color color) {
        if (house.getColor() == color){
            house.showInfo();
        }
    }

    //Метод для пошуку будинку по кількості кольорів
    public void searchByStageCount(House house, int stageCount) {
        if (house.getStageCount() == stageCount){
            house.showInfo();
        }
    }

    //Метод для пошуку будинку по ціні
    public void searchByPrice(House house, double searchPrice) {
        double price = house.getPrice();
        if (price == searchPrice){
            System.out.println("House with price " + searchPrice + " exists:");
            house.showInfo();
        }else if (price <= searchPrice){
            System.out.println("Price for house is lower");
            }else {
                System.out.println("Price for house is higher");
            }
    }

    //Метод для обчислення загальної площі будинку
    public double calculateSquare(House house){
        return house.getLength()*house.getWidth()*house.getStageCount();
    }

    //Метод для пошуку будинку за площею
    public void searchBySquare(House house, double searchSquare){
        if (searchSquare == house.calculateSquare(house)){
            System.out.println("House with square " + searchSquare + " exists:");
            house.showInfo();
        }else if (searchSquare <= house.calculateSquare(house)){
            System.out.println("House has higher square");
        }else {
            System.out.println("House has lower square");
        }
    }

    //Метод для перегляду інформації про об'єкти типу House
    public void showInfo() {
        System.out.println("Об'єктДім: " +
                "к-ть поверхів = " + stageCount +
                ", висота поверху = " + height +
                ", довжина = " + length +
                ", ширина = " + width +
                ", колір -> " + color +
                ", ціна = " + price +
                '}');
    }
}

