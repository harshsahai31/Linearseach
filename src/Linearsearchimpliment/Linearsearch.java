package Linearsearchimpliment;

public class Linearsearch{
	int [] arr;
	public Linearsearch(int[] arr){
		this.arr = arr;
	}
	public boolean linearsearch(int searchelement){
		boolean result = false;
		for(int i=0; i<arr.length;i++){
			if(arr[i]==searchelement){
				result =true;
				break;
			}
		}  return result;

	}
}