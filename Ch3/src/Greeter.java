/**
 * Programming Projects 3.2
 */
public class Greeter
{
    private String name;
    private String greeting = "Hello, ";
    private String bye= "See you soon, ";
    private String refuse= "I am sorry, ";
    private String refuse2= ". I cannot help you with that.";

    public Greeter (String n)
    {
        name=n;
    }
    public String sayHello ()
    {
       return greeting + name + "!";
    }
    public String sayGoodbye ()
    {
        return bye + name + "!";
    }
    public String refuseHelp ()
    {
        return refuse + name + refuse2;
    }
    public String toString ()
    {
        return String.format("%s\n%s\n%s", sayHello(), sayGoodbye(), refuseHelp());
    }
    public static void main (String [] args)
    {
        Greeter a= new Greeter ("Laura");
        System.out.println(a);
    }
}
