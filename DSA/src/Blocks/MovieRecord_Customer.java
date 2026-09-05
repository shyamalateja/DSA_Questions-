package Blocks;

public record MovieRecord_Customer() {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieCustomer customer=new MovieCustomer(355,"film","6:23",450);
		System.out.println(customer.movieName()+" "+customer.ticketId()+" "+customer.showTime()+" "+customer.ticketPrice());

	}

}
