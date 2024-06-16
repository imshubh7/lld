import controller.BookingController;
import entity.*;

import java.awt.print.Book;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import static entity.City.DELHI;
import static entity.SeatType.SILVER;

public class Main {
    public static void main(String[] args) {

        //Find MOVIE Shows BY CITY
        List<Movie>movieList = getMovies(City.LUCKNOW);

        //FIND THEATRE BY MOVIE AND CITY

        List<Theatre>theatreList = getTheatres(City.LUCKNOW, movieList.get(0));

        //FIND SHOWS

        List<Show>showList = getShows(theatreList.get(0).getId());

        //FIND SEATS AVAILABLE

        List<Seat>seatList = getSeats(showList.get(0).getId());
        //MAKE BOOKING

        Booking booking1 = BookingController.bookTicket("0",seatList, showList.get(0).getId());

        //FIND SEATS AVAILABLE


    }

    //GET USER
    public static User createUser(){
        return new User("0","Shubham");
    }
    //GET MOVIES
    public static List<Movie> getMovies(City city){
        List<Movie>movies = new ArrayList<>();
        movies.add(new Movie("0",120,"End Game"));
        movies.add(new Movie("1", 210, "X Man"));
        return movies;
    }
    //GET THEATRES
    public static List<Theatre> getTheatres(City city, Movie movie){
        List<Theatre>theatres = new ArrayList<>();
        Location location1 = new Location("0", DELHI, 123456, "Delhi", "India");
        if(city == DELHI){
            theatres.add(new Theatre("0",location1));
            return theatres;
        }
        Location location2 = new Location("1",City.LUCKNOW, 226010, "Lucknow", "India");
        theatres.add(new Theatre("1",location2));
        return theatres;
    }
    //GET SHOWS

    public static List<Show> getShows(String theatreId){
        List<Show>shows = new ArrayList<>();
        shows.add(new Show("0","0","0",LocalTime.of(9,9), LocalDate.of(2024,6,20), new ArrayList<>()));
        return shows;
    }

    //GET SEATS
    public static List<Seat> getSeats(String showId){
        List<Seat>seats = new ArrayList<>();
        seats.add(new Seat("0", SILVER));
        return seats;
    }
}