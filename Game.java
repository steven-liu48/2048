import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	
	static int status = 1;
	static int moves = 0;
	static int max = 0;

	public static void checkMax(ArrayList<ArrayList<Integer>> list) {
		for(int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (list.get(i).get(j) > max) {
					max = list.get(i).get(j);
				}
			}
		}
	}
	
	
	public static void print2DListFirst(ArrayList<ArrayList<Integer>> list){
		for(int i = 0; i < 50; i++) {
			System.out.println();
		}
		System.out.println("             >>>2048<<<");
		System.out.println();
		checkMax(list);
		System.out.println("    Moves made: " + moves + "   Maximum: " + max);
		System.out.println();
		System.out.println("Instructions: A/D/W/S to move Left/Right/Up/Down;");
		System.out.println("	R to Restart and Q to Quit; Then press ENTER.");		
		System.out.println();
		for(int i = 0; i < 4; i++){
			System.out.println("     ––––– ––––– ––––– –––––");
			System.out.print("    |");
			for(int j = 0; j < 4; j++){
				//System.out.print("|");
				if(list.get(i).get(j) == 0) {
					System.out.print("     |");
				}
				else if (list.get(i).get(j) < 10){
					System.out.print(list.get(i).get(j) + "    |");
				}
				else if (list.get(i).get(j) < 100){
					System.out.print(list.get(i).get(j) + "   |");
				}
				else if (list.get(i).get(j) < 1000){
					System.out.print(list.get(i).get(j) + "  |");
				}
				else if (list.get(i).get(j) < 10000){
					System.out.print(list.get(i).get(j) + " |");
				}
			}
			System.out.println();
		}
		//Lower boundary
		System.out.println("     ––––– ––––– ––––– –––––");
		System.out.println();
	}
	//Print out the list
	public static void print2DList(ArrayList<ArrayList<Integer>> list) {
		for(int i = 0; i < 50; i++) {
			System.out.println();
		}
		System.out.println("             >>>2048<<<");
		System.out.println();
		checkMax(list);
		System.out.println("    Moves made: " + moves + "   Maximum: " + max);
		System.out.println();
		for(int i = 0; i < 4; i++){
			System.out.println("     ––––– ––––– ––––– –––––");
			System.out.print("    |");
			for(int j = 0; j < 4; j++){
				//System.out.print("|");
				if(list.get(i).get(j) == 0) {
					System.out.print("     |");
				}
				else if (list.get(i).get(j) < 10){
					System.out.print(list.get(i).get(j) + "    |");
				}
				else if (list.get(i).get(j) < 100){
					System.out.print(list.get(i).get(j) + "   |");
				}
				else if (list.get(i).get(j) < 1000){
					System.out.print(list.get(i).get(j) + "  |");
				}
				else if (list.get(i).get(j) < 10000){
					System.out.print(list.get(i).get(j) + " |");
				}
			}
			System.out.println();
		}
		//Lower boundary
		System.out.println("     ––––– ––––– ––––– –––––");
		System.out.println();
	}
	
	//Initialize an empty array with a starting number
	public static void intialize (ArrayList<ArrayList<Integer>> list) {
		moves = 0;
		max = 0;
		
		//Set the list to empty
		for(int i = 0; i < 4; i++){
			list.add(i, new ArrayList<Integer>());
			for(int j = 0; j < 4; j++){
				list.get(i).add(j, 0);
			}
		}
		
		
		
		
		double a = Math.random();
		int a1 = 2;
		double b = Math.random();
		int b1 = 2;
		if(a < 0.2) {
			a1 = 4;
		}
		if(b < 0.2) {
			b1 = 4;
		}
		int x1 = (int)(Math.random() * 4);
		int y1 = (int)(Math.random() * 4);
		int x2 = (int)(Math.random() * 4);
		int y2 = (int)(Math.random() * 4);
		//Avoid creating only one number
		while(x1 == x2 && y1 == y2) {
			x2 = (int)(Math.random() * 4);
			y2 = (int)(Math.random() * 4);
		}
		//Set a random element to 2
		list.get(x1).set(y1, a1);
		list.get(x2).set(y2, b1);
		
		checkMax(list);


		/*
		//Test
		list.get(0).set(0, 4);
		list.get(0).set(1, 0);
		list.get(0).set(2, 2);
		list.get(0).set(3, 4);
		
		list.get(1).set(0, 4);
		list.get(1).set(1, 2);
		list.get(1).set(2, 0);
		list.get(1).set(3, 4);
		
		list.get(2).set(0, 8);
		list.get(2).set(1, 2);
		list.get(2).set(2, 0);
		list.get(2).set(3, 2);
		
		list.get(3).set(0, 64);
		list.get(3).set(1, 4);
		list.get(3).set(2, 0);
		list.get(3).set(3, 4);
		
		
		//Test
		list.get(0).set(0, 512);	
		list.get(1).set(0, 512);	
		list.get(2).set(0, 128);	
		list.get(3).set(0, 128);	
		
		list.get(0).set(1, 123);	
		list.get(1).set(1, 124);	
		list.get(2).set(1, 125);	
		list.get(3).set(1, 126);	
	
		list.get(0).set(2, 132);	
		list.get(1).set(2, 1321);	
		list.get(2).set(2, 2841);	
		list.get(3).set(2, 1823);	
		
		list.get(0).set(3, 1823);	
		list.get(1).set(3, 1234);	
		list.get(2).set(3, 5234);	
		list.get(3).set(3, 9879);
		*/
		
	}

	//Add a 2
	public static void addNew(ArrayList<ArrayList<Integer>> list) {
		int i, j;
		
		//System.out.println("Adding a new 2");
		do {
			i = (int)(Math.random() * 4);
			j = (int)(Math.random() * 4);
		} while(list.get(i).get(j) != 0);
		//2 or 4
		double a = Math.random();
		int a1 = 2;
		if(a < 0.2) {
			a1 = 4;
		}
		//Add the number
		list.get(i).set(j, a1);
		//System.out.println("A new 2 added");
	}
	
	//Swipe Up
	public static void swipeUp(ArrayList<ArrayList<Integer>> list) {
		int validCheck = 0;
		//Merge same numbers
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 4; j++){
				//Test
				//System.out.println(i + " " + j);
				if((list.get(i).get(j) != 0)&&(Integer.valueOf(list.get(i + 1).get(j)).equals(list.get(i).get(j)))) {
					list.get(i).set(j, list.get(i).get(j) * 2);
					list.get(i + 1).set(j, 0);
					validCheck++;
				}
				else if((i + 2 < 4)&&(list.get(i).get(j) != 0)&&(list.get(i + 1).get(j) == 0)&&(Integer.valueOf(list.get(i + 2).get(j)).equals(list.get(i).get(j)))) {
					list.get(i).set(j, list.get(i).get(j) * 2);
					list.get(i + 2).set(j, 0);
					validCheck++;
				}
				else if((i + 3 < 4)&&(list.get(i).get(j) != 0)&&(list.get(i + 1).get(j) == 0)&&(list.get(i + 2).get(j) == 0)&&(Integer.valueOf(list.get(i + 3).get(j)).equals(list.get(i).get(j)))) {
					list.get(i).set(j, list.get(i).get(j) * 2);
					list.get(i + 3).set(j, 0);
					validCheck++;
				}
			}
		}
		//Move numbers to the top
		for(int i = 1; i < 4; i++){
			for(int j = 0; j < 4; j++){
				//If this element is 0, check if the element above is 0
				if((list.get(i).get(j) != 0)&&(list.get(i - 1).get(j) == 0)) {
					list.get(i - 1).set(j, list.get(i).get(j));
					list.get(i).set(j, 0);
					//System.out.println("LOL");
					validCheck++;
					//Move up again if there is another 0
					if (i - 2 >= 0) {
						if((list.get(i - 1).get(j) != 0)&&(list.get(i - 2).get(j) == 0)) {
							list.get(i - 2).set(j, list.get(i - 1).get(j));
							list.get(i - 1).set(j, 0);
							//System.out.println("LOOL");
							
							//Move up again if there is another 0
							if (i - 3 >= 0) {
								if((list.get(i - 2).get(j) != 0)&&(list.get(i - 3).get(j) == 0)) {
									list.get(i - 3).set(j, list.get(i - 2).get(j));
									list.get(i - 2).set(j, 0);
									//System.out.println("LOOOL");
								}
							}
						}
					}
				}
			}
		}
		if(validCheck != 0) {
			addNew(list);
			moves++;
			checkMax(list);
			print2DList(list);
			System.out.println( "You pressed W. Valid.");
		}else {
			checkMax(list);
			print2DList(list);
			System.out.println( "You pressed W. Invalid.");
		}
	}
	
	//Swipe Down
	public static void swipeDown(ArrayList<ArrayList<Integer>> list) {
		int validCheck = 0;
		//Merge same numbers
				for(int i = 3; i > 0; i--){
					for(int j = 0; j < 4; j++){
						//Test
						//System.out.println(i + " " + j);
						if((list.get(i).get(j) != 0)&&(Integer.valueOf(list.get(i - 1).get(j)).equals(list.get(i).get(j)))) {
							list.get(i).set(j, list.get(i).get(j) * 2);
							list.get(i - 1).set(j, 0);
							//System.out.println("1");
							validCheck++;
						}
						else if((i - 2 >= 0)&&(list.get(i).get(j) != 0)&&(list.get(i - 1).get(j)==0)&&(Integer.valueOf(list.get(i - 2).get(j)).equals(list.get(i).get(j)))) {
							list.get(i).set(j, list.get(i).get(j) * 2);
							list.get(i - 2).set(j, 0);
							//System.out.println("2");
							validCheck++;
						}
						else if((i - 3 >= 0)&&(list.get(i).get(j) != 0)&&(list.get(i - 1).get(j)==0)&&(list.get(i - 2).get(j)==0)&&(Integer.valueOf(list.get(i - 3).get(j)).equals(list.get(i).get(j)))) {
							list.get(i).set(j, list.get(i).get(j) * 2);
							list.get(i - 3).set(j, 0);
							//System.out.println("3");
							validCheck++;
						}
					}
				}
		//Move numbers to the bottom
		for(int i = 2; i >= 0; i--){
			for(int j = 0; j < 4; j++){
				//Check if the element below is 0
				if((list.get(i).get(j) != 0)&&(list.get(i + 1).get(j) == 0)) {
					list.get(i + 1).set(j, list.get(i).get(j));
					list.get(i).set(j, 0);
					//System.out.println("LOL");
					validCheck++;
					//Move down again if there is another 0
					if (i + 2 <= 3) {
						if((list.get(i + 1).get(j) != 0)&&(list.get(i + 2).get(j) == 0)) {
							list.get(i + 2).set(j, list.get(i + 1).get(j));
							list.get(i + 1).set(j, 0);
							//System.out.println("LOOL");
							
							//Move down again if there is another 0
							if (i + 3 <= 3) {
								if((list.get(i + 2).get(j) != 0)&&(list.get(i + 3).get(j) == 0)) {
									list.get(i + 3).set(j, list.get(i + 2).get(j));
									list.get(i + 2).set(j, 0);
									//System.out.println("LOOOL");
								}
							}
						}
					}
				}
			}
		}
		if(validCheck != 0) {
			addNew(list);
			moves++;
			checkMax(list);
			print2DList(list);
			System.out.println( "You pressed S. Valid.");
		}else {
			checkMax(list);
			print2DList(list);
			System.out.println( "You pressed S. Invalid.");
		}
	}
	
	//Swipe Left
	public static void swipeLeft(ArrayList<ArrayList<Integer>> list) {
		int validCheck = 0;
		//Merge same numbers
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 3; j++){
				if((list.get(i).get(j) != 0)&&(Integer.valueOf(list.get(i).get(j + 1)).equals(list.get(i).get(j)))) {
					list.get(i).set(j, list.get(i).get(j) * 2);
					list.get(i).set(j + 1, 0);
					//System.out.println("1");
					validCheck++;
				}
				else if((j + 2 < 4)&&(list.get(i).get(j) != 0)&&(list.get(i).get(j + 1)==0)&&(Integer.valueOf(list.get(i).get(j + 2)).equals(list.get(i).get(j)))) {
					list.get(i).set(j, list.get(i).get(j) * 2);
					list.get(i).set(j + 2, 0);
					//System.out.println("2");
					validCheck++;
				}
				else if((j + 3 < 4)&&(list.get(i).get(j) != 0)&&(list.get(i).get(j + 1)==0)&&(list.get(i).get(j + 2)==0)&&(Integer.valueOf(list.get(i).get(j + 3)).equals(list.get(i).get(j)))) {
					list.get(i).set(j, list.get(i).get(j) * 2);
					list.get(i).set(j + 3, 0);
					//System.out.println("3");
					validCheck++;
				}
			}
		}
		//Move numbers to the left
		for(int i = 0; i < 4; i++){
			for(int j = 1; j < 4; j++){
				//Test
				//System.out.println(i + " " + j);
				//Check if the element on the left is 0
				if((list.get(i).get(j) != 0)&&(list.get(i).get(j - 1) == 0)) {
					list.get(i).set(j - 1, list.get(i).get(j));
					list.get(i).set(j, 0);
					//System.out.println("LOL");
					//print2DList(list);
					validCheck++;
					//Move left again if there is another 0
					if(((j - 2 >= 0) && list.get(i).get(j - 2) == 0)) {
						list.get(i).set(j - 2, list.get(i).get(j - 1));
						list.get(i).set(j - 1, 0);
						//System.out.println("LOOL");
						//print2DList(list);
					
						//Move left again if there is another 0
						if ((j - 3 >= 0)&&(list.get(i).get(j - 3) == 0)) {
							list.get(i).set(j - 3, list.get(i).get(j - 2));
							list.get(i).set(j - 2, 0);
							//System.out.println("LOOOL");
							//print2DList(list);
						}
					}
				}
			}
		}
		if(validCheck != 0) {
			addNew(list);
			moves++;
			checkMax(list);
			print2DList(list);
			System.out.println( "You pressed A. Valid.");
		}else {
			checkMax(list);
			print2DList(list);
			System.out.println( "You pressed A. Invalid.");
		}
	}
	
	//Swipe Right
	public static void swipeRight(ArrayList<ArrayList<Integer>> list) {
		int validCheck = 0;
		//Merge same numbers
		for(int i = 0; i < 4; i++){
			for(int j = 3; j > 0; j--){
				//Test
				//System.out.println(i + " " + j);
				if((list.get(i).get(j) != 0)&&(Integer.valueOf(list.get(i).get(j - 1)).equals(list.get(i).get(j)))) {
					list.get(i).set(j, list.get(i).get(j) * 2);
					list.get(i).set(j - 1, 0);
					//System.out.println("x x+1");
					//print2DList(list);
					validCheck++;
				}
				else if((j - 2 >= 0)&&(list.get(i).get(j) != 0)&&(list.get(i).get(j - 1)==0)&&(Integer.valueOf(list.get(i).get(j - 2)).equals(list.get(i).get(j)))) {
					list.get(i).set(j, list.get(i).get(j) * 2);
					list.get(i).set(j - 2, 0);
					//System.out.println("x x+2");
					//print2DList(list);
					validCheck++;
				}
				else if((j - 3 >= 0)&&(list.get(i).get(j) != 0)&&(list.get(i).get(j - 1)==0)&&(list.get(i).get(j - 2)==0)&&(Integer.valueOf(list.get(i).get(j - 3)).equals(list.get(i).get(j)))) {
					list.get(i).set(j, list.get(i).get(j) * 2);
					list.get(i).set(j - 3, 0);
					//print2DList(list);
					validCheck++;
				}
			}
		}
		//Move numbers to the right
		for(int i = 0; i < 4; i++){
			for(int j = 2; j >= 0; j--){
				//Check if the element on the right is 0
				if((list.get(i).get(j) != 0)&&(list.get(i).get(j + 1) == 0)) {
					list.get(i).set(j + 1, list.get(i).get(j));
					list.get(i).set(j, 0);
					//System.out.println("LOL");
					//print2DList(list);
					validCheck++;
					
					//Move right again if there is another 0
					if(((j + 2 < 4) && list.get(i).get(j + 2) == 0)) {
						list.get(i).set(j + 2, list.get(i).get(j + 1));
						list.get(i).set(j + 1, 0);
						//System.out.println("LOOL");
						//print2DList(list);
					
						//Move right again if there is another 0
						if ((j + 3 < 4)&&(list.get(i).get(j + 3) == 0)) {
							list.get(i).set(j + 3, list.get(i).get(j + 2));
							list.get(i).set(j + 2, 0);
							//System.out.println("LOOOL");
							//print2DList(list);
						}
					}
				}
			}
		}
		if(validCheck != 0) {
			addNew(list);
			moves++;
			checkMax(list);
			print2DList(list);
			System.out.println( "You pressed D. Valid.");
		}else {
			checkMax(list);
			print2DList(list);
			System.out.println( "You pressed D. Invalid.");
		}
	}
	
	//Check Result
	public static void checkStatus(ArrayList<ArrayList<Integer>> list) {
		//Win
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 4; j++){
				if(Integer.valueOf(list.get(i).get(j)).equals(2048)) {
					status = 2;
				}
			}
		}
		
		//Lose
		int pointer = 0;
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 3; j++){
				if (Integer.valueOf(list.get(i).get(j)).equals(list.get(i).get(j + 1))) {
					pointer++;
				}
			}
		}
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				if(Integer.valueOf(list.get(i).get(j)).equals(list.get(i + 1).get(j))){
					pointer++;
				}
			}
		}
		//Check number of Zeroes
		int numZero = 0;
		for(int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (list.get(i).get(j) == 0) {
					numZero++;
				}
			}
		}
		if(pointer == 0 && numZero == 0) {
			status = 0;
		}
		//System.out.println(numZero);
		//System.out.println(pointer);
		//System.out.println(status);
	}
	
	//Run Game
	public static void run() {
		Scanner scan2 = new Scanner(System.in);
		//Create a new list
		ArrayList<ArrayList<Integer>> gameList = new ArrayList<ArrayList<Integer>>();
		//Initialize and print out
		intialize(gameList);
		checkMax(gameList);
		print2DListFirst(gameList);
		/*
		while(true) {
			while(true) {
				
			}
			System.out.println("You ");
		}
		*/
		
		//Controller loop
			while(true) {
				Scanner scan = new Scanner(System.in);
				String input = scan.nextLine();
				
				//Check game status
				checkStatus(gameList);
				//Check Max
				checkMax(gameList);
				
				//Read user input
				if(input.equalsIgnoreCase("a")) {
					swipeLeft(gameList);
				}
				else if(input.equalsIgnoreCase("d")) {
					swipeRight(gameList);
				}
				else if(input.equalsIgnoreCase("w")) {
					swipeUp(gameList);
				}
				else if(input.equalsIgnoreCase("s")) {
					swipeDown(gameList);
				}
				else if(input.equalsIgnoreCase("q")) {
					System.out.println("Quit? (Y/N)");
					Scanner temp = new Scanner(System.in);
					String a = temp.nextLine();
					if(a.equalsIgnoreCase("y")) {
						System.out.println("You quitted. Your Moves: " + moves);
						break;
					}
					else if(a.equalsIgnoreCase("n")) {
						print2DList(gameList);
						System.out.println("Game Continue.");
						continue;
					}
					//status = 3;
					//System.out.println(status);
					
				}
				else if(input.equalsIgnoreCase("r")) {
					
					System.out.println("Restart? (Y/N)");
					Scanner temp = new Scanner(System.in);
					String a = temp.nextLine();
					if(a.equalsIgnoreCase("y")) {
						//Print out the resulting list
						for(int i = 0; i < 50; i++) {
							System.out.println();
						}
						//Restart
						intialize(gameList);
						checkMax(gameList);
						print2DList(gameList);
						moves = 0;
						System.out.println( "You pressed R to restart. ");
					}
					else if(a.equalsIgnoreCase("n")) {
						print2DList(gameList);
						System.out.println("Game Continue.");
						continue;
					}
				}
				else {
					//Print out the resulting list
					print2DList(gameList);
					//Invalid information
					System.out.println("You pressed " + input + ". Invalid.");
				}
				
				//Check maximum number
				checkMax(gameList);
				
				//Check game status
				checkStatus(gameList);
				//Win
				if(status == 2) {
					System.out.println("You Win! Your moves: " + moves);
					//scan.close();
					break;
				}
				//Lose
				else if(status == 0) {
					System.out.println("Unfortunately, you lost. Your moves: " + moves);
					//scan.close();
					break;
				}
			}
			
			
			/*
			if(status == 3) {
				break;
			}else{
				String a = "";
				System.out.print("Press R to restart and any other key to quit: ");
				a = scan2.nextLine();
				if(a.equalsIgnoreCase("r")) {
					status = 1;
					intialize(gameList);
					checkMax(gameList);
					print2DList(gameList);
					System.out.println( "You pressed R to restart. Input operation: ");
					continue;
				}
				else{
					break;
				}
			}
		*/
		//Start playing
		//print2DList(gameList);
		System.out.println("Game has ended. Thank you!");
	}
	
	//Main method
	public static void main(String[] args) {
		
		Game a = new Game();
		a.run();
		/*
		//Test
		ArrayList<ArrayList<Integer>> gameList = new ArrayList<ArrayList<Integer>>();
		intialize(gameList);
				gameList.get(0).set(0, 64); gameList.get(0).set(1, 128); gameList.get(0).set(2,128); gameList.get(0).set(3, 128); 
				gameList.get(1).set(0, 64); gameList.get(1).set(1, 128); gameList.get(1).set(2, 128); gameList.get(1).set(3, 128);
				gameList.get(2).set(0, 64); gameList.get(2).set(1, 128); gameList.get(2).set(2, 128); gameList.get(2).set(3, 128);
				gameList.get(3).set(0, 64); gameList.get(3).set(1, 128); gameList.get(3).set(2, 128); gameList.get(3).set(3, 128);
				
				System.out.println(gameList.get(2).get(3));
				System.out.println(gameList.get(3).get(3));
		checkStatus(gameList);
		 */
	}
}
