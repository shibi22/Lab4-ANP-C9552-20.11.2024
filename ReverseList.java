import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ReverseList{
	public static void main(String args[]){
		ArrayList<String> arr = new ArrayList<>();
		
		arr.add("i");
		arr.add("b");
		arr.add("i");
		arr.add("h");
		arr.add("s");
		System.out.print("Original List:");
		for(String str : arr){
			
			System.out.print(str);   // Print the original list
		}
		
		Collections.reverse(arr);  // Reverse the list
		System.out.println("\nReversed List:");
		  
		  
		  for(String rev: arr){
		     System.out.print(rev);  // Print the reversed list
		}
	}
}


		