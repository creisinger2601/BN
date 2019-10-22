import java.util.Scanner;
public class ReisingerPE7{
	public static void main(String[] args){
		//This is a test comment
		float rooms = 0, rate, occupiedRooms = 0, roomsTotal = 0, occupiedTotal = 0;
		int floors = 0;
		Scanner keyboard = new Scanner(System.in);
		while(floors < 1){
			System.out.println("Enter the amount of floors in the hotel");
			floors = Integer.parseInt(keyboard.nextLine());
			if(floors < 1){
				System.out.println("Please enter a number of floors greater than 1");
			}
		}
		for(int x = 0; x < floors; x++){
				System.out.println("Enter the amount of rooms on floor " + (x + 1));
				rooms = Float.parseFloat(keyboard.nextLine());
				if(rooms < 10){
					System.out.println("Enter a number greater than or equal to 10");
					x--;
					rooms = 0;
				}
				roomsTotal = rooms + roomsTotal;
		}
		for(int x = 0; x < floors; x++){
				System.out.println("Enter the amount of rooms occupied on floor " + (x + 1));
				occupiedRooms = Float.parseFloat(keyboard.nextLine());
				if(occupiedRooms < 0 || occupiedRooms > roomsTotal){
					System.out.println("Invalid occupied Rooms");
					x--;
					occupiedRooms = 0;
				}
				occupiedTotal = occupiedRooms + occupiedTotal;
		}
		
		System.out.printf("The hotel has %.0f " +"rooms.\n",roomsTotal);
		System.out.printf("The hotel has %.0f " + "occupied rooms.\n",occupiedTotal);
		System.out.printf("The hotel has %.0f " + "empty rooms.\n",(roomsTotal - occupiedTotal));
		System.out.printf("The occupancy rate is:%.2f%%", (occupiedTotal/roomsTotal)*100);
	}
}
