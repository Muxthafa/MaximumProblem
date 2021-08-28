package generics;

public class maximumProblem<F extends Comparable<F>> {
		
		F x,y,z;  //class variables
		
		//parameterized constructors
		public maximumProblem(F x,F y,F z) {
			this.x=x;
			this.y=y;
			this.z=z;
		}
		
		//@method used to get the maximum value
		 public F maximum()
		 {
			 return maximumProblem.maximum(x, y, z);
		 }
		 
		/*@method used to compare between elements
		 * takes 3 float values
		 * returns maximum of all
		 */
		public static <F extends Comparable<F>> F maximum(F x,F y,F z) 
		{
			F max=x;     				//initially set maximum to x, then compare with y and z
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
		public static <F> void printMax(F x,F y,F z,F max)
		{
			System.out.printf("Maximum of %s,%s and %s is %s\n",x,y,z,max);
		}
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			//testcase 1
			float xfloat=100.00f,yfloat=50.6f,zfloat=25.3f;
			new maximumProblem(xfloat,yfloat,zfloat).maximum();
			
			//Testcase 2
			float afloat=50.0f,bfloat=100.44f,cfloat=25.9f;
			new maximumProblem(afloat,bfloat,cfloat).maximum();
			
			//Testcase 3
			float mfloat=25.9f,nfloat=50.5f,ofloat=100.7f;
			new maximumProblem(mfloat,nfloat,ofloat).maximum();

	}

}
