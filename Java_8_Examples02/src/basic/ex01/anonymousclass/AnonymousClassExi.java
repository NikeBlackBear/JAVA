package basic.ex01.anonymousclass;

/*

 */

class AnonymousClassEx {
    public static void main(String[] args) {
        print(new PrintStrImp(){
            public void print(){
                System.out.println("-----------------------");
                System.out.println("!       Print  Ex     !");
                System.out.println("-----------------------");
            }
        });
    }
    private static void print(PrintStrImp printer){
        printer.print();
    }
}

interface PrintStrImp{
    public abstract void print();
}
