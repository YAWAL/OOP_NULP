package OOP.KP.KP_2;


/*
8. Створити клас БУДИНОК.

 Визначити для класу не менше 10 найважливіших методів, включаючи два конструктори.

 Створити масив об’єктів цього класу і написати програму,  яка демонструє роботу з об’єктами БУДИНОК
 (створення, редагування, перегляд,   а також пошук об’єктів БУДИНОК за заданим критерієм).

 */
public class House {

    private String name;

    private int stageCount;

    private double height;

    private double length;

    private double width;

    private Color color;

    public House() {
    }

    public House(String name, int stageCount, double height, double length, double width, Color color) {
        this.name = name;
        this.stageCount = stageCount;
        this.height = height;
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStageCount() {
        return stageCount;
    }

    public void setStageCount(int stageCount) {
        this.stageCount = stageCount;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
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

    public void setWidth(double width) {
        this.width = width;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double calculateSquare(double length, double width){
        return length*width;
    }

    public double calculateVolume(double length, double width, double height){
        return length*width*height;
    }

    public void repaintHouse(House house, Color newColor){
        Color currentColor = house.getColor();
        if (currentColor == newColor){
            System.out.println("Colour is the same as current");
        }else {
            house.setColor(newColor);
            System.out.println("House with colour " + currentColor + " has been repainted with colour " + newColor);
        }
    }

    public House[] searchByColour(House[] houses){
        //TODO implement this
        return null;
    }

    public House[] searchByStageCount(House[] houses){
        //TODO implement this
        return null;
    }

    public House[] searchByVolume(House[] houses){
        //TODO implement this
        return null;
    }

    public House[] searchByStageSquare(House[] houses){
        //TODO implement this
        return null;
    }



}

