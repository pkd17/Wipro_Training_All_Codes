package CollectionFrameworkJava;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapEg {

	public static void main(String[] args) {
		 Map<Integer, String>map=new TreeMap<Integer, String>();
		 /*An Object that maps keys to values
		  * A map can't contain duplicate keys
		  * The map is sorted according to the natural ordering of its keys
		  * Values can be duplicated
		  * no null as key is allowed
		  *Multiple null values are allowed 
		  * this implementation is not synchronize
		  */
	      map.put(1,"Amit");
	      map.put(2, "Dinesh");
	      map.put(3, "Rahul");
	      map.put(3,"Sujit");
	      map.put(4, "harsh");
	      map.put(6, "Sidharth");
	      map.put(5, "Sujit");
	      map.put(7, null);
	      map.put(8, null);
	      //map.put(null,null);
	      
	      
	      //Converting Map into Set
	      Set set=map.entrySet();
	      Iterator itr=set.iterator();
	      while(itr.hasNext()) {
	    	  
	    	  Entry entry=(Map.Entry)itr.next();
	    	  System.out.println(entry.getKey()+" "+entry.getValue());
	    	  
	    	  
	      }
	}

}
