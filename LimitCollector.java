package HomeTask02_2;

import java.util.ArrayList;

public class LimitCollector{
	
	private int colSize;
	private ArrayList<Integer> col;
	
	public LimitCollector(int cSize) {
		colSize = cSize;
		col = new ArrayList();
	}
	
	public LimitCollector() {
		colSize = 16;
		col = new ArrayList();
	}
	
	public void add(int value){
		if (col.size() == colSize)
		col.remove(0);
		col.add(value);
	}
	
	public void print(){
		System.out.println(col);
	}
}
