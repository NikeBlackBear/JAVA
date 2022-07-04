package l01.functionalinterface.ex01;

public class ex01Main {
    public static void main(String[] args) {
        // 익명 내부 클래스 anonymous inner class
        RunSomething runSomething1 = new RunSomething() {
            @Override
            public void doIt() {
                System.out.println("runSomething1 Start");
            }
        };
        runSomething1.doIt();

        RunSomething runSomething2 = () -> System.out.println("runSomething2 Start");
        runSomething2.doIt();
    }
}
