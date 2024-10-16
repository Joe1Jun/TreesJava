package ie.atu.sw;

import java.util.*;

public interface Node <T> {
	//The T thats used here is a generic which means that 
	// it it a placeholder for the datatypes that wil be inserted by the program later
	// by the concrete classes that will use the methods from the interface
	
	public T getData();
	public void setData( T data);
	
	public boolean isRoot();
	public boolean isLeaf();
	public Node<T> getParent();
	public List<Node<T>> children();
	
	public void addChild(Node<T> child);
	public void removeChild(Node <T> child);
	public boolean hasChild(Node <T> child);
	public boolean hasSibling();
	public List <Node <T>> siblings();
	
	

}
