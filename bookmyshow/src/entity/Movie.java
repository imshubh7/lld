package entity;

public class Movie {
    private final String id;
    private Integer lengthInMinutes;
    private String title;

    public Movie(String id, Integer lengthInMinutes, String title) {
        this.id = id;
        this.lengthInMinutes = lengthInMinutes;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public Integer getLengthInMinutes() {
        return lengthInMinutes;
    }

    public void setLengthInMinutes(Integer lengthInMinutes) {
        this.lengthInMinutes = lengthInMinutes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
