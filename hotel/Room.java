package hotel;
import java.time.LocalDate;

public class Room {
    private int roomNo;
    private String category;
    private boolean isAvailable;
    private double price;
    Room(){}
    Room(int roomNo, String category, boolean isAvailable, double price) {
        this.roomNo = roomNo;
        this.category = category;
        this.isAvailable = isAvailable;
        this.price = price;
    }
    Reservation res = new Reservation();
    static Room[] rooms = new Room[10];
    public static Room[] setMem() {
        for (int i = 0; i < 10; i++) {
                int roomNo = i + 101;
                String category = "deluxe";
                boolean isAvailable = true;
                double price = 1000.0;
                rooms[i] = new Room(roomNo, category, isAvailable, price);
                if(i>=5){
                    roomNo = i + 101;
                    category = "super deluxe";
                    isAvailable = true;
                    price = 2000.0;
                    rooms[i] = new Room(roomNo, category, isAvailable, price);
                }
        }
        return rooms;
    }
    public int getRoomNo() {
        return roomNo;
    }
    public boolean getIsAvailable() {
        return isAvailable;
    }
    public double price(LocalDate checkin, LocalDate checkout,String type) {
        long days = res.numOfDays(checkin,checkout);
        if(type.equals("deluxe"))
        return 1000 * days;
        else return 2000 * days;
    }
   // public void setTheAvailability(LocalDate checkin, LocalDate checkout) {}
}


