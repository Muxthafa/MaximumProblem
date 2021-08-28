package generics;

public class maximumProblem<S extends Comparable<S>> {
		
		S x,y,z;  //class variables
		
		//parameterized constructors
		public maximumProblem(S x,S y,S z) {
			this.x=x;
			this.y=y;
			this.z=z;
		}
		
		//@method used to get the maximum value
		 public S maximum()
		 {
			 return maximumProblem.maximum(x, y, z);
		 }
		 
		/*@method used to compare between elements
		 * takes 3 string values
		 * returns maximum of all
		 */
		public static <S extends Comparable<S>> S maximum(S x,S y,S z) 
		{
			S max=x;     				//initially set maximum to x, then compare with y and z
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
		public static <S> void printMax(S x,S y,S z,S max)
		{
			System.out.printf("Maximum of %s,%s and %s is %s\n",x,y,z,max);
		}
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			//testcase 1
			String xStr="peach",yStr="apple",zStr="banana";
			new maximumProblem(xStr,yStr,zStr).maximum();
			
			//Testcase 2
			String aStr="banana",bStr="peach",cStr="apple";
			new maximumProblem(bStr,cStr,aStr).maximum();
			
			//Testcase 3
			String pStr="apple",qStr="banana",rStr="peach";
			new maximumProblem(rStr,pStr,qStr).maximum();

	}

}
