import java.util.Scanner;

class Application{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Distance (m) ");

		int distance = scanner.nextInt();

		//System.out.println(distance);
		int x = 0;
		int time = 0;
		while(true){
			x += 5;
			time += 1;

			if(x >= distance)
			  break;	

			x += 3;
			time += 2;

			if(x >= distance)
			  break;

			x += 1;
			time += 3;

			if(x >= distance)
			  break;

		}
		System.out.println("Jumped distance " + x + "m");
		System.out.println("Time is " + time + "s");

	}

}