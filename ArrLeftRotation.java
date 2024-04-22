import java.util.Scanner;

public class ArrLeftRotation{


    public static void main(String args[]){
    int a[] = {1,2,3,4,5,6,7};
    
    System.out.println("Input Array : ");

    for(int i=0;i<a.length;i++){
        System.out.print(a[i]+ " ");

    }
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter the position number to rotate left:");
    int n = sc.nextInt();
    for(int i=0;i<n;i++)
    {
    int firstElement = a[0];
    for(int j=0;j<a.length-1;j++){
        a[j]= a[j+1];
    }
    a[a.length-1]= firstElement;
    }
    System.out.println("Output Array : ");
    for(int i=0;i<a.length;i++){
        System.out.print(a[i]+ " ");
    }
    }
}