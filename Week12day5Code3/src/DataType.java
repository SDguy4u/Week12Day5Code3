


	import java.util.ArrayList;
	import java.util.List;
	import java.util.Collections;

	public class DataType {
	    
	    
	    public static void main (String [] args) {
	        
	        List<Double> dl = new ArrayList<Double>();
	        dl.add(1.8);
	        dl.add(0.4);
	        dl.add(2.7);
	        dl.add(4.5);
	        dl.add(3.6);
	        dl.add(2.8);
	        
	        Collections.sort(dl);                        
	        System.out.println("The sorted list in ascending order is as follow :" + dl );
	        System.out.println("");
	        Collections.reverse(dl);        
	        System.out.println("The sorted list in descending order is as follow :" + dl );
	    }
	}
