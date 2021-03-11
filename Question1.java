import java.util.Arrays;

public class Question1 {
	
	public static void main(String[] args) {
		
		int[][] matrixA = { {6, 7},
		                    {5, 8},
						       };
		
		int[][] matrixB = { {4, 9},
                            {8, 7},
			                   };

		int[][] matrixC = { {0, 0},
                            {0, 0},
                               };
		
		for(int i = 0; i < matrixA.length; i++) {
			
			for(int j = 0; j < matrixA[i].length; j++) {
				
					
					matrixC[i][j] = matrixA[i][j] * matrixB[j][i];
					
				
			}
			
		}
		
		System.out.print(Arrays.deepToString(matrixC));
		
	}
}
