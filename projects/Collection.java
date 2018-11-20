package dd;

import java.util.ArrayList;

public class Collection {
	ArrayList<String> my_collection;
	int pointer;
	
	// constructor
	public Collection(){
		pointer = 0;
		my_collection = new ArrayList<String>();
	}
	
	public Boolean hasNext(){
		if (pointer < my_collection.size()) {
			return true;
		}else{
			return false;
		}
	}
    public void addItem(String s_to_add){
    	my_collection.add(s_to_add);
    }
    public String getNext(){
    	String toreturn = my_collection.get(pointer);
    	pointer++;
    	return toreturn;
    	}
    }	

