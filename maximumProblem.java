package generics;

import java.util.Scanner;

public class maximumProblem<S extends Comparable<S>> {
		
		S x,y,z,v;  //class variables
		
		//parameterized constructors for 3 parameters
		public maximumProblem(S x,S y,S z) {
			this.x=x;
			this.y=y;
			this.z=z;
		}
		
		//parameterized constructors for 4 parameters
		public maximumProblem(S x,S y,S z,S v) {
			this.x=x;
			this.y=y;
			this.z=z;
			this.v=v;
		}
		 
		 
		/*@method used to compare between elements
		 * takes 3 values
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
		
		/*@method used to compare between elements
		 * takes 4 values
		 * returns maximum of all
		 */
		public static <S extends Comparable<S>> S maximum(S x,S y,S z,S v) 
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
		
		//to print the maximum value for 3 parameters
		public static <S> void printMax(S x, S y, S z, S max) {
			System.out.printf("Maximum of %s,%s and %s is %s\n", x, y, z, max);
		}
		
		//to print the maximum value for 4 parameters
		public static <S> void printMax(S x, S y, S z, S v, S max) {
			System.out.printf("Max of %s, %s, %s and %s is %s\n", x, y, z, v, max);
		}
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			System.out.println("Enter the Number of parameters: 3 or 4?");
			Scanner sc=new Scanner(System.in); 
			int param=sc.nextInt();
			if(param==3) //when you want 3 parameters
			{
				String xStr="peach",yStr="apple",zStr="grape";
				new maximumProblem(xStr,yStr,zStr).maximum(xStr,yStr,zStr);
				float xfloat=999.99f,yfloat=26.55f,zfloat=63.45f;
				new maximumProblem(xfloat,yfloat,zfloat).maximum(xfloat,yfloat,zfloat);
				int xInt=900,yInt=50,zInt=1000;
				new maximumProblem(xInt,yInt,zInt).maximum(xInt,yInt,zInt);
			}
			else // when you want 4 parameters
			{
				String xStr="banana",yStr="apple",zStr="peach",vstr="pineapple";
				new maximumProblem(xStr,yStr,zStr,vstr).maximum(xStr,yStr,zStr,vstr);
				float xfloat=455.6f,yfloat=25.6f,zfloat=999.9f,vfloat=125.08f;
				new maximumProblem(xfloat,yfloat,zfloat,vfloat).maximum(xfloat,yfloat,zfloat,vfloat);
				int xInt=900,yInt=50,zInt=700,vint=677;
				new maximumProblem(xInt,yInt,zInt,vint).maximum(xInt,yInt,zInt,vint);
			}

	}

}
