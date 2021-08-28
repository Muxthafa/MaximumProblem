package generics;

public class maximumProblem<T extends Comparable<T>> {
		
		T x,y,z;  //class variables
		
		//parameterized constructors
		public maximumProblem(T x,T y,T z) {
			this.x=x;
			this.y=y;
			this.z=z;
		}
		
		//@method used to get the maximum value
		 public T maximum()
		 {
			 return maximumProblem.maximum(x, y, z);
		 }
		 
		/*@method used to compare between elements
		 * takes 3 integer values
		 * returns maximum of all
		 */
		public static <T extends Comparable<T>> T maximum(T x,T y,T z) 
		{
			T max=x;     				//initially set maximum to x, then compare with y and z
			if(y.compareTo(max)>0) {
				max=y;
			}
			if(z.compareTo(max)>0) {
				max=z;
			}
			printMax(x,y,z,max);
			return max;
		}
		
		//to print the maximum value
		public static <T> void printMax(T x,T y,T z,T max)
		{
			System.out.printf("Maximum of %s,%s and %s is %s\n",x,y,z,max);
		}
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			//test case 1
			int xInt=10,yInt=5,zInt=2;
			new maximumProblem(xInt,yInt,zInt).maximum();
			
			//Test case 2
			int aInt=5,bInt=10,cInt=2;
			new maximumProblem(aInt,bInt,cInt).maximum();
			
			//Test case 3
			int mInt=2,nInt=5,oInt=10;
			new maximumProblem(mInt,nInt,oInt).maximum();

	}

}
