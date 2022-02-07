package rubixCube_1;

public class face1 extends face {
	
	public static int[][] front;
	
	public static int[] a;
	
	public static int[] b;
	
	public static int[] c;
	
	public static int[] d;
	
	public face1(int size) { 
		
		front = new int[size][size];
		a = new int[size];
		b = new int[size];
		c = new int[size];
		d = new int[size];
		
		for (int i = 0; i < size; i++) { 
			for(int j = 0; j < size; j++) { 
				front[i][j] = 1;
				
			}
		}
		
		for (int i = 0; i < size; i++) {
			a[i] = 4;
			b[i] = 3;
			c[i] = 5;
			d[i] = 2;
		}
		
		
	}
	
	
	void rotate() { 
		for(int i = 0; i < cube.size; i++) { 
			face4.front[cube.size - 1][i] = a[i];
			face3.front[i][0] = b[i];
	/**/	face5.front[0][i] = c[i];
			face2.front[i][cube.size - 1] = d[i];
			
			face4.c[i] = front[0][i];
			face3.d[i] = front[i][cube.size - 1];
			face5.a[i] = front[cube.size - 1][i];
			face2.b[i] = front[i][0]; 
			
			
		}
		
		face2.a[cube.size - 1] = a[0];
		face3.a[0] = a[cube.size - 1];
		face4.c[cube.size - 1] = d[0];
		face5.d[0] = d[cube.size - 1];
		face4.b[cube.size - 1] = b[0];
		face5.b[0] = b[cube.size - 1];
		face2.c[cube.size - 1] = c[0];
		face3.c[0] = c[cube.size - 1];

	}
	
	void rotateRight() { 
		System.out.println("1 rotate right");
		
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
		System.out.println("1 rotate left"); 
		
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
