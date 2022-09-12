package practice.te;

public class Recursive {

	public void darshan() {
		System.out.println("From darshan method");
		darshan();
	}

	public static void main(String[] args) {
		Recursive recursive = new Recursive();
		recursive.darshan();
	}
}
