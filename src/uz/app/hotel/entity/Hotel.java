package uz.app.hotel.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Hotel {
    private final String id = UUID.randomUUID().toString();
    private String name;
    private Location location;
    private Integer floors;
    private Integer roomsCount;
    private List<Room> rooms = new ArrayList<>();

    public Hotel(String name, Location location, Integer floors, Integer roomsCount) {
        this.name = name;
        this.location = location;
        this.floors = floors;
        this.roomsCount = roomsCount;
        this.rooms = rooms;
    }

    public Hotel() {

    }
    public Integer getFloors() {
        return floors;
    }

    public void setFloors(Integer floors) {
        this.floors = floors;
    }

    public Integer getRoomsCount() {
        return roomsCount;
    }

    public void setRoomsCount(Integer roomsCount) {
        this.roomsCount = roomsCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

<<<<<<< HEAD
    public String getId() {
        return id;
    }

=======

    public String getId() {
        return id;
    }
>>>>>>> 68a110a72e1de36328e1dc16f64c861b082ce245
    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", location=" + location +
                ", floors=" + floors +
                ", roomsCount=" + roomsCount +
                '}';
    }
}
