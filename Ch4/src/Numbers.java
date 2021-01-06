/**
 * Created by laurashi on 10/8/17.
 */
public class Numbers
{
    public static void main (String [] args)
    {
        int a= 1;
        int b= 3;
        int c= 5;

        a+=b; //a is 4, b is 3
        a++; //a is 5
        a= 1 + b; // a is 4
        a--; // a is 3
        c= 1 +a; // c= 4
        c+= a+b; // c is 10
        b= a-b+c; // b is 10
        a-=b+c; // a is -17
        --a; // a is -18
        b= --a; //b is-19, a is -19
        b= a-1; //b is -20
        a= c++ ; // a is  10, c is 11;
        a= ++c; //a is 12, c is 12
        b= --a; // a,b is 11
        c= b++; //c is 11, b is 12
        a= b++; // a is 12, b is 13
        b= --a; // a is 11, b is 11
        c= a--; // c is 11, a is 10


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);




    }
}
