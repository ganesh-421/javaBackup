public class OverloadingEg {
    public static void main(String[] args) {
        new ConstructorOverloading();
        new ConstructorOverloading("String value passed."); 
    }
}
public class ConstructorOverloading {
    ConstructorOverloading()
    {
        System.out.println("No Parameters Constructor");
    }
    ConstructorOverloading(String str)
    {
        System.out.println("Constructor With A Parameter");
    }
}

