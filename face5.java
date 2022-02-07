package rubixCube_1;

public class face5 extends face {
	
	public static int[][] front;
	
    static int[] a;
	
	static int[] b;
	
	static int[] c;
	
	static int[] d;
	
	public face5(int size) { 
		//super(5, size);
		super();
		front = new int[size][size];
		a = new int[size];
		b = new int[size];
		c = new int[size];
		d = new int[size];
		
		for (int i = 0; i < size; i++) { 
			for(int j = 0; j < size; j++) { 
				front[i][j] = 5;
			}
		}
		
		for (int i = 0; i < size; i++) {
			a[i] = 1;
			b[i] = 3;
			c[i] = 6;
			d[i] = 2;
		}
	}
	
	void rotate() { 
		for(int i = 0; i < cube.size; i++) { 
			face1.front[cube.size - 1][i] = a[i];  
			face3.front[cube.size - 1][i] = b[i];
			face6.front[cube.size - 1][i] = c[i];  
			face2.front[cube.size - 1][i] = d[cube.size - 1 - i];
			
			face1.c[i] = this.front[0][i];
			face3.c[i] = this.front[i][cube.size - 1];
			face6.c[i] = this.front[cube.size - 1][i];
			face2.c[i] = this.front[i][0];
		} 	
		
		face2.b[cube.size - 1] = a[0];
		face3.d[cube.size - 1] = a[cube.size - 1];
		face1.d[cube.size - 1] = d[0]; 
		face6.b[cube.size - 1] = d[cube.size - 1];
		face2.d[cube.size - 1] = b[0];
		face3.b[cube.size - 1] = b[cube.size - 1];
		face1.b[cube.size - 1] = b[0];
		face6.d[cube.size - 1] = b[cube.size - 1];
	}
	
	void rotateRight() { 
		System.out.println("5 rotate right");
		
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
		System.out.println("5 rotate left"); 
		
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
