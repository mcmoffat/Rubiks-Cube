package rubixCube_1;

import java.util.Scanner;

public class cube {
	
	public static int size;
	
	static face1 one;  
	
	static face2 two;
	
	static face3 three;

	static face4 four;
	
	static face5 five;
	
	static face6 six;
	
	public cube(int size) {
		this.size = size;
		one = new face1(size);   
		two = new face2(size);  
		three = new face3(size);
		four = new face4(size);
		five = new face5(size);
		six = new face6(size); 
		
		
		
		
		//print();
		
		//input();
	}
	/*
	public static void main(String[] args) {
		
		cube cube1 = new cube(3);
		
	}
	*/
	
	void print() { 

		for(int i = 0; i < size; i++) { 
			for(int j = 0; j < size + 1; j++) { 
				System.out.print(" ");
			}
			for(int j = 0; j < size; j++) { 
				System.out.print(six.front[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 0; i < size; i++) { 
			for(int j = 0; j < size + 1; j++) { 
				System.out.print(" ");
			}
			for(int j = 0; j < size; j++) { 
				System.out.print(four.front[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 0; i < size; i++) { 
			for(int j = 0; j < size; j++) { 
				System.out.print(two.front[i][j]);
			}
			System.out.print(" ");
			for(int j = 0; j < size; j++) { 
				System.out.print(one.front[i][j]);
			}
			System.out.print(" ");
			for(int j = 0; j < size; j++) { 
				System.out.print(three.front[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 0; i < size; i++) { 
			for(int j = 0; j < size + 1; j++) { 
				System.out.print(" ");
			}
			for(int j = 0; j < size; j++) { 
				System.out.print(five.front[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("----------------");
		System.out.println();
		
	}
	
	void input() { 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the face number and \"l\" or \"r\" to turn left or right:  ");
		 
		this.move(scan.nextLine());
			
	}
	
	
	void move(String n) {
		if (n.length() == 2) { 
			if (n.charAt(1) == 'l' ) {
				if (n.charAt(0) == '1' ) { 
					one.rotateLeft();
				} 	else if (n.charAt(0) == '2' ) { 
						two.rotateLeft();
				}	else if (n.charAt(0) == '3' ) { 
						three.rotateLeft();
				}	else if (n.charAt(0) == '4' ) { 
						four.rotateLeft();
				}	else if (n.charAt(0) == '5' ) { 
						five.rotateLeft();
				}	else if (n.charAt(0) == '6' ) { 
						six.rotateLeft();
				}
				
			} else if (n.charAt(1) == 'r') {
				if (n.charAt(0) == '1' ) { 
					one.rotateRight();
				} 	else if (n.charAt(0) == '2' ) { 
						two.rotateRight();
				}	else if (n.charAt(0) == '3' ) { 
						three.rotateRight();
				}	else if (n.charAt(0) == '4' ) { 
						four.rotateRight();
				}	else if (n.charAt(0) == '5' ) { 
						five.rotateRight();
				}	else if (n.charAt(0) == '6' ) { 
						six.rotateRight();
				}
			}
			
		}
		//print();
		
		//input();
		
	}
}
