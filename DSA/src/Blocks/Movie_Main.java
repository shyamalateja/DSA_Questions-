package Blocks;

import Constructors.student;

public class Movie_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieTicket movieTicket=new MovieTicket();
		movieTicket.setMoviename("Billa");
		movieTicket.setprice(750);
		movieTicket.setShowtime("12:00");
		movieTicket.setTicketId(3533);
		
		System.out.println("movie name :"+movieTicket.getMoviename()+"\nid : "
				+movieTicket.getTicketId()+"\nshow time :"
				+movieTicket.getShowtime()+"\nticket price:"
				+movieTicket.getprice());

	}

}
