package Classes;

class Polymor{
    int n=0;

    void print(){
        System.out.println("grand parent");
    }
}

    /*  void print(){
          System.out.println("child class");

     */

    public class  Mul extends Polymor {
        void simple() {
            System.out.println("chlid constructor");
        }

        public class Surya extends Polymor {
            void compile() {
                System.out.println("parent constructor");
            }
        }

            public static void main(String[] args) {

                Mul m = new Mul();

                m.print();




            }
        }