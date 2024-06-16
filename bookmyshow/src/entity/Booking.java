package entity;

import java.util.List;

public class Booking {
    private String id;
    private List<Seat>seats;
    private String showId;

    public Booking(String id, List<Seat> seats, String showId) {
        this.id = id;
        this.seats = seats;
        this.showId = showId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public String getShowId() {
        return showId;
    }

    public void setShowId(String showId) {
        this.showId = showId;
    }

    @Override
    public String toString() {
        return "Booking {" +
                "id='" + id + '\'' +
                ", seats=" + seats.get(0).getId() +
                ", showId='" + showId + '\'' +
                '}';
    }
}
