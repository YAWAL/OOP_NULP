package OOP.KP.KP2;

public class RunHouse {

    public static House[] createHouses() {
        //створення об'єктів типу House
        House redHouse = new House(1, 2, 15, 10, Color.RED);
        House greenHouse = new House(1, 1.8, 10.11, 15, Color.GREEN);
        House blue1House = new House(3, 1.9, 11.5, 17, Color.BLUE);
        House whiteHouse = new House(4, 2.1, 17, 19, Color.WHITE);
        House blue2House = new House(5, 2.2, 20, 21, Color.BLUE);

        //створення масиву об'єктів типу House
        House houses[] = new House[5];
        houses[0] = redHouse;
        houses[1] = greenHouse;
        houses[2] = blue1House;
        houses[3] = whiteHouse;
        houses[4] = blue2House;
        return houses;
    }

    public static void main(String[] args) {
        House[] houses = createHouses();
        Color color = Color.BLUE;
        int stages = 3;

        for (House house:houses){
            house.repaintHouse(house, color);
            System.out.println("New color is: " + house.getColor());

            if (house.getStageCount() <= 2){
                house.changePrice(house, 33333.33);
            }else {
                house.changePrice(house, 55555.55);
            }

            house.showInfo();

            house.searchByColor(house, color);

            house.searchByStageCount(house, stages);

            house.searchByPrice(house, 879750);

            house.searchBySquare(house, 1292);
        }
    }
}
