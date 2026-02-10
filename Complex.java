class Complex
{
    int real;
    int imaginary;

    public Complex(int real_get,int imag_get){
        this.real = real_get;
        this.imaginary =imag_get;
    }
    public static Complex sum(Complex c1,Complex c2){
        Complex temp = new Complex(0,0);
        temp.real = c1.real +c2.real;
        temp.imaginary = c1.imaginary + c2.imaginary;
        return temp;
    }
    public static void main(String[]args){
        Complex first = new Complex(1,2);
        Complex second = new Complex(32,22);
        Complex temp = sum(first,second);
        System.out.println("Sum is:" + temp.real + "+" +temp.imaginary + "i");
    }
}