import java.util.ArrayList;


public class PrintConcentric {
	public static void main(String[] args) {
		PrintConcentric obj = new PrintConcentric();
		obj.prettyPrint(3);
	}
	
	public ArrayList<ArrayList<Integer>> prettyPrint(int a) {
	    ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	    int rc = 2 * a - 1;
	    int[][] res = new int[rc][rc];
	    
	    int i, k = 0, l = 0;
	    
	    // Store given number of rows and columns for later use
	    int m = 2 * a - 1, n = 2 * a - 1;
	    while (k < m && l < n)
	    {
	    for (i = l; i < n; ++i)
            res[k][i] = a;
        k++;
 
        /* Fill the last column from the remaining columns */
        for (i = k; i < m; ++i)
            res[i][n-1] = a;
        n--;
 
        /* Fill the last row from the remaining rows */
        if (k < m)
        {
            for (i = n-1; i >= l; --i)
                res[m-1][i] = a;
            m--;
        }
 
        /* Print the first column from the remaining columns */
        if (l < n)
        {
            for (i = m-1; i >= k; --i)
                res[i][l] = a;
            l++;
        }
        a--;
	    }
	    for(int p = 0; p < rc; p++){
	        ArrayList<Integer> row = new ArrayList<Integer>();
	        for(int j = 0; j < rc; j++) {
	        	System.out.print(res[p][j] +" ");
	            row.add(res[p][j]);
	        }
	        System.out.println(" ");
	        result.add(row);
	    }
	    
	    return result;
	}
}
