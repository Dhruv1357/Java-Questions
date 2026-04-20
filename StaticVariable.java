class Static
{
    static int value = 10;
    int a;
}
public class StaticVariable 
{
    public static void main(String[] args)
    {
        Static s1 = new Static();
        Static s2 = new Static();

        s1.value = 5;

        s1.a = 2;
        s2.a = 4;

        System.out.println(s2.value);
        System.out.println(s1.a);
        System.out.println(s2.a);

    }
}
