import java.util.ArrayList;

public class Homework1 {

	 public static void main(String[] args) {
		 
		 new Homework1().Tester();
		 
	 }
	 
	 public void Tester()
	 {
		 Integer tester = arrayListSum(new ArrayList<Integer>());
		 System.out.print(tester.toString());
	 }
	 
	 
	 /**
	 Question 3.1. Method returns the requested array list containing the predetermined integers
	 @return list
	 */
	 public ArrayList<Integer> arrayListInt()
	 {
		 ArrayList<Integer> list = new ArrayList<Integer>();
		 final int arraySize = 10;
		 
		 for(int i = 0; i < arraySize; i++)
		 {
			 if(i < arraySize / 2)
			 {
				 list.add(i);
			 }
			 else
			 {
				 list.add(i - arraySize / 2);
			 }
		 }
		 
		 return list; 
	 }
	 
	 /**
	 Question 3.4. Method returns sum of all the elements in the array list provided
	 @param pList The array list of integers that the user would like to get the sum of.
	 @return listSum
	 */
	 public Integer arrayListSum(ArrayList <Integer> pList)
	 {
		 ArrayList <Integer> mList = pList;
		 Integer listSum = 0;
		 
		for(Integer i : mList)
		 {
			 listSum += i;
		 }
		
		return listSum;
	 }
}




	

