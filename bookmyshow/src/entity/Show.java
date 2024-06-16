package entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Show {
    private final String id;
    private String screenId;
    private String movieId;
    private LocalTime startTime;
    private LocalDate date;
    private List<Booking>bookings;

    public Show(String id, String screenId, String movieId, LocalTime startTime, LocalDate date, List<Booking> bookings) {
        this.id = id;
        this.screenId = screenId;
        this.movieId = movieId;
        this.startTime = startTime;
        this.date = date;
        this.bookings = bookings;
    }

    public String getId() {
        return id;
    }

    public String getScreenId() {
        return screenId;
    }

    public void setScreenId(String screenId) {
        this.screenId = screenId;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
}
