package rubixCube_1;

public class face6 extends face {
	
	public static int[][] front;
	
static int[] a;
	
	static int[] b;
	
	static int[] c;
	
	static int[] d;
	
	public face6(int size) { 
		//super(6, size);
		super();
		front = new int[size][size];
		a = new int[size];
		b = new int[size];
		c = new int[size];
		d = new int[size];
		
		for (int i = 0; i < size; i++) { 
			for(int j = 0; j < size; j++) { 
				front[i][j] = 6;
			}
		}
		
		for (int i = 0; i < size; i++) {
			a[i] = 4;
			b[i] = 2;
			c[i] = 5;
			d[i] = 3;
		}
	}
	
	void rotate() { 
		for(int i = 0; i < cube.size; i++) { 
			face4.front[0][i] = a[cube.size - 1 - i];  
			face3.front[i][cube.size - 1] = d[i];
			face5.front[cube.size - 1][i] = c[cube.size - 1 - i];  
			face2.front[i][0] = b[i]; 
			
			face1.a[i] = this.front[0][i];
			face2.d[i] = this.front[i][cube.size - 1];
			face5.c[cube.size - 1 - i] = this.front[cube.size - 1][i];
			face3.b[i] = this.front[i][0];
		} 	
		
		face4.d[0] = b[0];
		face5.d[cube.size - 1] = b[cube.size - 1];
		face2.a[0] = a[cube.size - 1];
		face3.a[cube.size - 1] = a[0];
		face4.b[0] = d[0];
		face5.b[cube.size - 1] = d[cube.size - 1];   
		face2.c[0] = c[cube.size - 1];
		face3.c[cube.size - 1] = c[0];
	}
	
	void rotateRight() { 
		System.out.println("6 rotate right");
		
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
		System.out.println("6 rotate left"); 
		
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
