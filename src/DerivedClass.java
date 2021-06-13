public class DerivedClass extends Base{
    public void runDerived() {
        super.run();
        System.out.println("Run Derived");
    }

    public void derived() {
        System.out.println("Derived");
    }

}
