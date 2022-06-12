import java.util.*;

public class Main {
    public static int[] squareRooms = {0,0,0,0,0};

    public static void main(String[] args) {
        Iterator<Room> iterator;
        int[] squareFloors = {0,0,0};
        String[] roomTypes = {"Stepan", "Programming", "JavaZone", "Gaming", "Kitchen"};
        Room[] floor0 = new Room[5];
        ArrayList<Room> floor1 = new ArrayList<>();
        Vector<Room> floor2 = new Vector<>();
        Random rnd = new Random();
        Room room;
        Integer sum = 0;

        for (int i = 0; i < 5; i++) {
            floor0[i] = new Room(roomTypes[rnd.nextInt(0,5)], rnd.nextInt(0,50));
            floor1.add(new Room(roomTypes[rnd.nextInt(0,5)], rnd.nextInt(0,50)));
            floor2.add(new Room(roomTypes[rnd.nextInt(0,5)], rnd.nextInt(0,50)));
        }

        iterator = Arrays.stream(floor0).iterator();
        System.out.print("\nFloor 1, room squares: ");
        while (iterator.hasNext()) {
            room = iterator.next();
            squareFloors[0] += room.getArea();
            sum += room.getArea();
            sumSquareRooms(room);
            System.out.print(room.getArea() + " / " + room.getType() +"; ");
        }
        iterator = floor1.iterator();
        System.out.print("\nFloor 2, room squares: ");
        while (iterator.hasNext()) {
            room = iterator.next();
            squareFloors[1] += room.getArea();
            sum += room.getArea();
            sumSquareRooms(room);
            System.out.print(room.getArea() + " / " + room.getType() +"; ");
        }
        iterator = floor2.iterator();
        System.out.print("\nFloor 3, room squares: ");
        while (iterator.hasNext()) {
            room = iterator.next();
            squareFloors[2] += room.getArea();
            sum += room.getArea();
            sumSquareRooms(room);
            System.out.print(room.getArea() + " / " + room.getType() +"; ");
        }
        System.out.print("\nGeneral area: " + sum +
                         "\nArea of the first floor: " + squareFloors[0] +
                         "\nArea of the second floor: " + squareFloors[1] +
                         "\nArea of the third floor: " + squareFloors[2]);
        for (int i = 0; i < roomTypes.length; i++){
            System.out.print("\nArea of the " + roomTypes[i] + " room type: " + squareRooms[i]);
        }
    }
    public static void sumSquareRooms(Room room){
        switch (room.getType()){
            case "Stepan" -> squareRooms[0] += room.getArea();
            case "Programming" -> squareRooms[1] += room.getArea();
            case "JavaZone" -> squareRooms[2] += room.getArea();
            case "Gaming" -> squareRooms[3] += room.getArea();
            default -> squareRooms[4] += room.getArea();
        }
    }

}