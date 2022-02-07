package rubixCube_1;

public class face3 extends face {
	
	public static int[][] front;
	
static int[] a;
	
	static int[] b;
	
	static int[] c;
	
	static int[] d;
	
	public face3(int size) { 
		//super(3, size); 
		front = new int[size][size];
		a = new int[size];
		b = new int[size];
		c = new int[size];
		d = new int[size];
		
		for (int i = 0; i < size; i++) { 
			for(int j = 0; j < size; j++) { 
				front[i][j] = 3;
			}
		}
		
		for (int i = 0; i < size; i++) {
			a[i] = 4;
			b[i] = 6;
			c[i] = 5;
			d[i] = 1;
		}
	}
	
	void rotate() { 
		for(int i = 0; i < cube.size; i++) { 
			face4.front[i][cube.size - 1] = a[i];  
			face1.front[i][cube.size - 1] = d[i];
			face5.front[i][cube.size - 1] = c[i];  
			face6.front[i][0] = b[i];
			
			face4.b[i] = this.front[0][i];
			face6.d[i] = this.front[i][cube.size - 1];
			face5.b[i] = this.front[cube.size - 1][i];
			face1.b[i] = this.front[i][0];
			
		} 	
		face4.c[cube.size - 1] = d[0];
		face5.a[cube.size - 1] = d[cube.size - 1];
		face1.a[cube.size - 1] = a[0];
		face6.a[0] = a[0];
		face4.a[cube.size - 1] = b[0];
		face5.c[cube.size - 1] = b[cube.size - 1];
		face6.c[0] = c[cube.size - 1];
		face1.c[cube.size - 1] = c[0];
		
	}
	
	void rotateRight() { 
		System.out.println("3 rotate right");
		
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
		System.out.println("3 rotate left"); 
		
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
