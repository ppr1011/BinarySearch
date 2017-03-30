
public class SplitSearch {
	public static int search(int data,int[] array){
		int left = 0,right = array.length-1;
		int middle;
		while(left<=right&&left>=0&&right<array.length){
			middle = (left+right)/2;
			//System.out.println(middle);
			if(data==array[middle]){
				return middle;
			}
			if(data>array[middle]){
				left=middle+1;
			}
			else
				right = middle -1;
		}
		return -1;
	}
	
    public static void main(String[] args){    
    	int[] array = {1,4,5,7,9,12,16,20};
    	System.out.println(search(20,array));
    }
}

