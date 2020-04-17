public class RoomTest {
    public static void main(String[] args) {
        boolean startCooling;
        Clima airCond1 = new Clima(2000);

        System.out.println("------- Room 1 -------");
        //Bigger room, slower cooling speed - decrease of temperature by 1
        Room room1 = new Room(100, 24, 18, airCond1);
        startCooling = room1.decreaseTemperature();
        showStatus(startCooling, room1);
        startCooling = room1.decreaseTemperature();
        showStatus(startCooling, room1);
        startCooling = room1.decreaseTemperature();
        showStatus(startCooling, room1);
        startCooling = room1.decreaseTemperature();
        showStatus(startCooling, room1);
        startCooling = room1.decreaseTemperature();
        showStatus(startCooling, room1);
        startCooling = room1.decreaseTemperature();
        showStatus(startCooling, room1);
        startCooling = room1.decreaseTemperature();
        showStatus(startCooling, room1);

        System.out.println("------- Room 2 -------");
        //New Room without air conditioner
        Room room2 = new Room(100, 24, 18);
        startCooling = room2.decreaseTemperature();
        showStatus(startCooling, room2);

        System.out.println("------- Room 3 -------");
        //Smaller room, faster cooling speed - decrease of temperature by 2
        Room room3 = new Room(20, 24, 18, airCond1);
        startCooling = room3.decreaseTemperature();
        showStatus(startCooling, room3);
        startCooling = room3.decreaseTemperature();
        showStatus(startCooling, room3);
        startCooling = room3.decreaseTemperature();
        showStatus(startCooling, room3);
    }

    public static void showStatus(boolean isCLimaWorking, Room room) {
        if (isCLimaWorking  && room.getAirConditioner() != null) {
            System.out.println("Temperature changed to " + room.getCurTemp());
        } else if (room.getAirConditioner() == null) {
            System.out.println("Not possible to cool that room due to no air Conditioner");
        } else
            System.out.println("Not possible to decrease temperature below " + room.getMinTemp());
    }

}
