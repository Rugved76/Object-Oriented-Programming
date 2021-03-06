import java.util.Scanner;
class Complex{

    int img,real;
    
    public Complex()
    {
    }
    public Complex(int real , int img)
    {
        this.img = img;
        this.real  = real;

    }
    void add(Complex c1 ,Complex c2){
        this.real = c1.real + c2.real;
        this.img = c1.img + c2.img;
        
    }
    void Subtract(Complex c1, Complex c2){
        this.real = c1.real - c2.real;
        this.img = c1.img - c2.img;
    }
    void multiply(Complex c1 , Complex c2){
        this.real = c1.real * c2.real;
        this.img = c1.img * c2.img;
    }
    void Divide(Complex c1, Complex c2){
        this.real = c1.real /c2.real;
        this.img = c1.img / c2.img;
    }

    void print()
    {
        System.out.println("Complex Number : " +real+ " + "+ img +"i");
    }

}

public class Oop_Expt_1 {
    public static void main(String[] args)
    { 
        System.out.println("Enter first complex no, real and then imaginary");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
       
        Complex c1 = new Complex(x,y);
        c1.print();
       
        System.out.println("Enter first complex no, real and then imaginary");
        int a= sc.nextInt();
        int b = sc.nextInt();
       
        Complex c2 = new Complex(a,b);
        c2.print();
        
        Complex c3 = new Complex();
        c3.add(c1, c2);
        System.out.println("SUM : ");
        c3.print();
       
        System.out.println("Difference is :");
        c3.Subtract(c1, c2);
        c3.print();
        
        System.out.println("Multiplication is: ");
        c3.multiply(c1, c2);
        c3.print();

        System.out.println("Divide is: ");
        c3.Divide(c1, c2);
        c3.print();
        
        sc.close();
    }
    
}
