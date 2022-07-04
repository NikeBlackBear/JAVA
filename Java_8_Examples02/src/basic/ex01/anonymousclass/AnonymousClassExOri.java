package basic.ex01.anonymousclass;

class AnonymousClassExOri {
    public static void main(String[] args) {
        print(new PrintStr2());
    }
    public static void print(PrintStr printer){
        printer.print();
    }
}

class PrintStr2 implements PrintStr{
    public void print(){
        System.out.println("-----------------------");
        System.out.println("!       Print Ori     !");
        System.out.println("-----------------------");
    }
}

interface PrintStr{
    public abstract void print();
}
