package Goodpair;
import java.util.Scanner;
public class Goodpair {

	public static void main(String[] args) {
   
		 Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the Array Size");
	        int n=sc.nextInt();
	        
	        
	        int arr[]=new int[n];
	        for(int i=0;i< arr.length;i++){
	            arr[i]=sc.nextInt();
	            int size= arr.length;
	        }
	        Scanner a=new Scanner(System.in);
	        int k=a.nextInt();
	        int count=0;
	        int size= arr.length;
	            for(int i=0;i<size;i++){
	                for(int j=i+1;j<size;j++){
	                    if(arr[i]+arr[j]==k){
	                         count=count+1;	                    }
	                }
	            }System.out.println(count);
	}            
	            

}
