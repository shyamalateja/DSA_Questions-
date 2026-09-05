package Blocks;

public class MovieTicket {

	   private int ticketId;
	    private String movieName;
	    private String showTime;
	    private double ticketPrice;


public int getTicketId() {
    return ticketId;
}

public void setTicketId(int ticketId) {
    this.ticketId = ticketId;
}

public String getMoviename() {
    return movieName;
}

public void setMoviename(String name) {
    this.movieName=name;
}

public String getShowtime() {
    return showTime;
}

public void setShowtime(String showtime) {
    this.showTime=showtime;
}

public double getprice() {
    return ticketPrice;
}

public void setprice(double price) {
    this.ticketPrice=price;
}


}