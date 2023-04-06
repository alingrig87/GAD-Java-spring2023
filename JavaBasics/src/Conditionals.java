public class Conditionals {
    public static void main(String[] args) {
        int a = 5;
        if(a > 2) {
            System.out.println("a mai mare decat 2");
        } else if( a> 5) {
            System.out.println("a este mai mare decat 5");
        } else {

        }

        int clasaDePoluare = 1;

        switch (clasaDePoluare) {
            case 1:
                System.out.println("Aveti de platit 1000 lei");
                break;
            case 2:
                System.out.println("Aveti de platit 500 lei");
                break;
            case 3:
                System.out.println("Aveti de platit 200");
                break;
            default:
                System.out.println("Nu aveti de platit nimic");
        }
    }
}
