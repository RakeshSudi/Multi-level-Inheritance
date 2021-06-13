public class Main {
    public static void main(String[] args) {
        DerivedClass dc = new DerivedClass();
        dc.runDerived();
       /* dc.derived();
        dc.runBase();
        dc.run();*/

        SubDerivedClass subDerivedClass = new SubDerivedClass();
        /*subDerivedClass.runSub();
        subDerivedClass.runDerived();
        subDerivedClass.runBase();
        subDerivedClass.run();*/

    }
}
