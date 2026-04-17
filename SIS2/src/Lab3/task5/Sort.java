package Lab3.task5;
import java.util.List;
import java.util.Iterator;


public class Sort {
	private List list;
	
	public Sort(List list) {
		this.list = list;
	}
	
	public void swap(int pos1, int pos2) {
		Object temp = list.get(pos1);
		list.set(pos1, list.get(pos2));
		list.set(pos2, temp);
	}
	
	private int partition(int low, int high) {
		Object pivot = this.list.get(high);
		int i = low - 1;
		for(int j = low; j<high; ++j) {
			Comparable temp = (Comparable) this.list.get(j);
			if(temp.compareTo(pivot)==-1) {
				i++;
				this.swap(i, j);
			}
		}
		swap(i+1, high);
		return i+1;
	}
	
	public void quickSort(int low, int high) {
		if(low < high) {
			int pivot = partition(low,high);
			
			this.quickSort(low,pivot-1);
			this.quickSort(pivot+1, high);
		}
	}
}
