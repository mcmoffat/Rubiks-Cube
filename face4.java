package rubixCube_1;

public class face4 extends face {
	
	public static int[][] front;
	
static int[] a;
	
	static int[] b;
	
	static int[] c;
	
	static int[] d;
	
	public face4(int size) { 
		//super(4, size);
		super();
		front = new int[size][size];
		a = new int[size];
		b = new int[size];
		c = new int[size];
		d = new int[size];
		
		for (int i = 0; i < size; i++) { 
			for(int j = 0; j < size; j++) { 
				front[i][j] = 4;
			}
		}
		
		for (int i = 0; i < size; i++) {
			a[i] = 6;
			b[i] = 3;
			c[i] = 1;
			d[i] = 2; 
		}
	}
	
	void rotate() { 
		for(int i = 0; i < cube.size; i++) { 
			face6.front[0][i] = a[cube.size - 1 - i];  
			face3.front[0][i] = b[cube.size - 1 - i];
			face1.front[0][i] = c[i];  
			face2.front[0][i] = d[i]; 
			
			face6.a[i] = this.front[0][i];
			face3.a[i] = this.front[cube.size - 1 - i][cube.size - 1];
			face1.a[i] = this.front[cube.size - 1][i];
			face2.a[i] = this.front[i][0]; 	
		} 	
		
		face2.b[0] = c[0];
		face3.d[0] = c[cube.size - 1];
		face1.d[0] = d[cube.size - 1]; 
		face6.b[0] = d[0];
		face2.d[0] = a[0];
		face3.b[0] = a[cube.size - 1];
		face1.b[0] = b[cube.size - 1];
		face6.d[0] = b[0];
	}
	
	void rotateRight() { 
		System.out.println("4 rotate right");
		
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
		System.out.println("4 rotate left"); 
		
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
