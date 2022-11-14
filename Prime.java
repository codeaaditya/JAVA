import java.util.Scanner;

public class Prime {
    public static  void main(String[] args) {
       int n,flag=0,i;
       System.out.println("ENTER NUMBER");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
           if(n==0 || n==1)
            System.out.println("NOT PRIME");
        for(i=2;i<n;i++){

            if( (n % i)== 0){
                flag+=1;
            }
        }
        if(flag>0)
        System.out.println("NOT PRIME");
        else
        System.out.println("PRIME");
        }
        
    }
    

