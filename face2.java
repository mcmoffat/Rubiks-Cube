package rubixCube_1;

public class face2 extends face {
	
	public static int[][] front;
	
	public static int[] a;
	
	public static int[] b;
	
	public static int[] c;
	
	public static int[] d;
	
	public face2(int size) { 
		//super(2, size);
		front = new int[size][size];
		a = new int[size];
		b = new int[size];
		c = new int[size];
		d = new int[size];
		
		for (int i = 0; i < size; i++) { 
			for(int j = 0; j < size; j++) { 
				front[i][j] = 2;
			}
		}
		
		for (int i = 0; i < size; i++) {
			a[i] = 4;
			b[i] = 1;
			c[i] = 5;
			d[i] = 6;
		}
	}
	
	
	
	void rotate() { 
		for(int i = 0; i < cube.size; i++) { 
			face4.front[i][0] = a[i]; 
			face1.front[i][0] = b[i];
			face5.front[i][0] = c[i];
			face6.front[cube.size - 1 - i][cube.size - 1] = d[i];
			
			face4.d[i] = front[0][i];
			face1.d[i] = front[i][cube.size - 1];
			face6.d[i] = front[cube.size - 1][i];
			face5.b[i] = front[i][0];
			
			//all the side pieces that overlap with this faces sides
	
		} 	
		face1.a[0] = a[cube.size - 1];
		face6.a[cube.size - 1] = a[0];
		face4.c[0] = b[1];
		face5.a[0] = b[cube.size - 1];
		face4.a[0] = d[1];
		face6.c[0] = d[cube.size - 1];
		face1.c[0] = c[cube.size - 1];
		face5.c[cube.size - 1] = c[0];
	}
	
	void rotateRight() { 
		System.out.println("2 rotate right");
		
		int[] temp = new int[cube.size];
		for (int i = 0; i < cube.size; i++) { 
			temp[i] = b[i]; 
		}
		for (int i = 0; i < cube.size; i++) { 
			b[i] = a[i]; 
		}
		int[] temp2 = new int[cube.size];  
		for (int i = 0; i < cube.size; i++) { 
			temp2[i] = c[i]; 
		}
		for (int i = 0; i < cube.size; i++) { 
			c[i] = temp[cube.size - 1 - i]; 
		}
		for (int i = 0; i < cube.size; i++) { 
			temp[i] = d[i];
		}
		for (int i = 0; i < cube.size; i++) { 
			d[i] = temp2[i];
		}
		for (int i = 0; i < cube.size; i++) { 
			a[i] = temp[cube.size - 1 - i]; 
		}
		
		int[][] copy = new int[cube.size][cube.size];
		
		for(int i = 0; i < cube.size; i++) { 
			for(int j = 0; j < cube.size; j++) {
				copy[i][cube.size - j - 1] = front[j][i];
			}
		}
		
		for(int i = 0; i < cube.size; i++) { 
			for(int j = 0; j < cube.size; j++) {
				front[i][j] = copy[i][j];
			}
		}
		
		rotate();
	}
	
	void rotateLeft() { 
		System.out.println("2 rotate left"); 
		
		int[] temp = new int[cube.size];
		for (int i = 0; i < cube.size; i++) { 
			temp[i] = d[i]; 
		}
		for (int i = 0; i < cube.size; i++) { 
			d[i] = a[cube.size - 1 - i]; 
		}
		int[] temp2 = new int[cube.size];  
		for (int i = 0; i < cube.size; i++) { 
			temp2[i] = c[i]; 
		}
		for (int i = 0; i < cube.size; i++) { 
			c[i] = temp[i]; 
		}
		for (int i = 0; i < cube.size; i++) { 
			temp[i] = b[i];
		}
		for (int i = 0; i < cube.size; i++) { 
			b[i] = temp2[cube.size - 1 - i];
		}
		for (int i = 0; i < cube.size; i++) { 
			a[i] = temp[i];  
		}
		
		int[][] copy = new int[cube.size][cube.size];
		
		for(int i = 0; i < cube.size; i++) { 
			for(int j = 0; j < cube.size; j++) {
				copy[j][i] = front[i][cube.size - j - 1];
			}
		}
		
		for(int i = 0; i < cube.size; i++) { 
			for(int j = 0; j < cube.size; j++) {
				front[i][j] = copy[i][j];
			}
		}
		
		rotate();
	}

	

}
