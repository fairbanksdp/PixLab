public class IntArrayWorker {
	/** two dimensional matrix */
	private int[][] matrix = null;

	/**
	 * set the matrix to the passed one
	 * 
	 * @param theMatrix
	 *            the one to use
	 */
	public void setMatrix(int[][] theMatrix) {
		matrix = theMatrix;
	}

	/**
	 * Method to return the total
	 * 
	 * @return the total of the values in the array
	 */
	public int getTotal() {
		int total = 0;
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				total = total + matrix[row][col];
			}
		}
		return total;
	}

	/**
	 * Method to return the total using a nested for-each loop
	 * 
	 * @return the total of the values in the array
	 */
	public int getTotalNested() {
		int total = 0;
		for (int[] rowArray : matrix) {
			for (int item : rowArray) {
				total = total + item;
			}
		}
		return total;
	}

	/**
	 * Method to fill with an increasing count
	 */
	public void fillCount() {
		int numCols = matrix[0].length;
		int count = 1;
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < numCols; col++) {
				matrix[row][col] = count;
				count++;
			}
		}
	}

	/**
	 * print the values in the array in rows and columns
	 */
	public void print() {
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	/**
	 * fill the array with a pattern
	 */
	public void fillPattern1() {
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				if (row < col)
					matrix[row][col] = 1;
				else if (row == col)
					matrix[row][col] = 2;
				else
					matrix[row][col] = 3;
			}
		}
	}

/** 
 * Count how many times an integer is found in the matrix
 * @return the count
 */
	public int getCount(int searchFor)
	{
		int i, j;
		int timesFound = 0;
		for (i = 0; i < matrix.length; i++)
		{
			for (j = 0; j < matrix[i].length; j++)
			{
				if (matrix[i][j] == searchFor)
					timesFound++;
			}
		}
		return timesFound;
	}
/*
	public int getLargest ()
	{
		int highest = 0;
		for(int i=0; i<matrix.length;i++)
		{
			for(int j=0; j<matrix[i].length;j++)
			{
				if (matrix[i][j] > highest)
					highest = matrix[i][j];
			}
		}
		return highest;
	}
*/
}
