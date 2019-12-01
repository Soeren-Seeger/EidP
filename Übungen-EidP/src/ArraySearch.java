
public class ArraySearch {

		 
	    public static void main(String[] args) {
	    	long highscore = 100;
	    	
	    for (int b = 0; b < 100000; b++)	{
	    	
	    	long timeStart = System.currentTimeMillis(); 
	    	int[] a = new int[2300000];
	    	for(int i=0; i<2300000;i++) {
	    		a[i] = i;
	    	}
	    	long timeStop = System.currentTimeMillis(); 
	    	
	    	if ((timeStop-timeStart) < highscore) {
	    		highscore = (timeStop-timeStart);
	    	}
	    	
	    	}
	    
	    System.out.println(highscore);
	    
	    }
	}