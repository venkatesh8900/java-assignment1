import java.lang.*;
interface MeanIn{
	float mean(int a[]);
	float deviation(int a[]);
}

class Mean implements MeanIn
{
	public float mean(int a[]){
		float sum=0;
		for(int i=0;i<a.length;i++){
			sum+=a[i];
		}
		
		return sum/a.length;
	}
	
	public float deviation(int a[]){
		float sum=0;
		for(int i=0;i<a.length;i++){
			sum +=a[i]*a[i];
		}
		
		return sum/a.length;
	}
}



public class Means
 {

	public static void main(String[] args) {
		int ar[] = {1,2,3,4,5,6,7,8};
		Mean m = new Mean();
		MeanIn M;
		M = m;
		System.out.println("Mean of given array is =\t"+m.mean(ar));
		System.out.println("\nDeviation of given array is =\t"+M.deviation(ar));

	}

}
