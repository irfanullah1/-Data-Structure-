import java.util.LinkedList;
	public class HashTable {
	    public static class HTObject {
	        public Integer key;
	        public String value;
	    }
	    public static int ARR_SIZE = 128;
	    private LinkedList<HTObject>[] arr = new LinkedList[ARR_SIZE];
	    public HashTable() {
	    	//By deuflt its null*/
	        for(int i=0; i<ARR_SIZE; i++) {
	            arr[i] = null;
	        }
	    }
	    // calculate index|*/
	    private HTObject getObj(Integer key) {
	        if(key == null)
	            return null;
	        //use to find Index for value in Liklist
	        int index = key.hashCode() % ARR_SIZE;///
	        LinkedList<HTObject> items = arr[index];
	        if(items == null)
	            return null;
	        for(HTObject item : items) {
	            if(item.key.equals(key))
	                return item;
	        }
	        return null;
	    }
	    //to return data by key*/
	    public String get(Integer key) {
	        HTObject item = getObj(key);
	        if(item == null)
	            return null;
	        else
	            return item.value;
	    }
	    //used to insert data*/
	    public void put(Integer key, String value) {
	        int index = key.hashCode() % ARR_SIZE;
	        LinkedList<HTObject> items = arr[index];
	 
	        if(items == null) {
	            items = new LinkedList<HTObject>();
	            
	            HTObject item = new HTObject();
	            item.key = key;
	            item.value = value;
	            items.add(item);
	            arr[index] = items;
	        }
	        else {
	            for(HTObject item : items) {
	                if(item.key.equals(key)) {
	                    item.value = value;
	                    return;
	                }
	            }
	            HTObject item = new HTObject();
	            item.key = key;
	            item.value = value;
	            items.add(item);
	        }
	    }
	    //used to delete an element*/
	    public void delete(Integer key) {
	        int index = key.hashCode() % ARR_SIZE;
	        LinkedList<HTObject> items = arr[index];
	        if(items == null)
	            return;
	        for(HTObject item : items) {
	            if (item.key.equals(key)){
	                items.remove(item);
	                return;
	            }
	        }
	    }       
	}

-

------------------------------------------------------------------

public class Mainclass {
	//HashTable hs=new HashTable();


		public static void main(String[] args) {
		HashTable Hash=new HashTable();
	Hash.put(1, "test");
	Hash.put(2,"test22");
	Hash.delete(1);
	System.out.println(Hash.get(1));
	System.out.println(Hash.get(2));
	

			
		}
	}
