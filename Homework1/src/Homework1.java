import java.util.ArrayList;

public class Homework1 {

	 public static void main(String[] args) {
		 
		 new Homework1().Tester();
		 
	 }
	 
	 public void Tester()
	 {
		 ArrayList<Integer> tester = arrayListCreate(0,9);
		 System.out.print(tester.toString());
	 }
	 
	 
	 /**
	 Question 3.1 Method returns the requested array list containing the predetermined integers
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
	 Question 3.4 Method returns sum of all the elements in the array list provided
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
	 
	 /**
	 Question 3.5 Method creates a new array list based on the size value and the number that the elements should be initialized to.
	 @param pLen The size of the array list that is to be created
	 @param pInitValue The value that each of the elements of the new array should be initialized to
	 @return newList
	 */
	 public ArrayList<Integer> arrayListCreate(int pLen, int pInitValue)
	 {
		 int mLen = pLen;
		 int mInitValue = pInitValue;
		 
		 if (mLen != 0)
		 {
			 ArrayList <Integer> newList = new ArrayList <Integer>();
			 for(int i = 0; i < mLen; i++)
			 {
				 newList.add(mInitValue);
			 }
			 
			 return newList;
		 }
		 else
		 {
			 return null;
		 }
	 }
}




	

