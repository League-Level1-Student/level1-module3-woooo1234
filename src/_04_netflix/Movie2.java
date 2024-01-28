package _04_netflix;

public class Movie2 {
public static void main(String[] args) {
	Movie m1 = new Movie("Scarface", 5);
	m1.getTicketPrice();
	Movie m2 = new Movie("GodFather", 5);
	Movie m3 = new Movie("Rush hour", 4);
	
	NetflixQueue n1 = new NetflixQueue();
	n1.addMovie(m1);
	n1.addMovie(m2);
	n1.addMovie(m3);
	System.out.println(m1);
	System.out.println(m2);
	System.out.println(m3);
	n1.getBestMovie();
	
	
}
}
