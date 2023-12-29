// Static Variables

class two{
    static int a=10;
    int b=20;
}

public class Classes {
    public static void main(String[] args) {
        two o = new two();
        two o2 = new two();
        o.a=20;
        o.b=30;
        o2.b=40;
        System.out.println("o B value : "+o.b);
        System.out.println("o2 B value : "+o2.b);
        System.out.println("o A value : "+o.a);
        System.out.println("o2 A value : "+o2.a);
        
    }
}