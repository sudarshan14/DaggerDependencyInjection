package sid.angel.daggerdependencyinjection;

public class TestClass extends ParentTestClass {

    public static void main(String[] args) {
        String s = "Sudarshan";

        s = "Nisha";
        System.out.println(s);
        TestClass obj = new TestClass();
        ParentTestClass obj2 = new ParentTestClass();
        ParentTestClass obj3 = new TestClass();
        TestClass obj4 = new TestClass();
//        obj2.parentMethod();
        obj3.parentMethod();
//        obj4.parentMethod();
        obj3.parentStaticMethod();// method hiding
//        obj4.

    }


    public void parentMethod() {
//        super.parentMethod();
        System.out.println("child method");
    }

    public void ChildRandomMethod() {
        System.out.println("random class");
    }

    public static void parentStaticMethod() {
        System.out.println("child static method");
    }




}
