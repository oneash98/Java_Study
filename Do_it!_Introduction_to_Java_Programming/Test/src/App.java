public class App {
    public static void main(String[] args) throws Exception {
        int i = 10;
        switch(i) {
            case 1: case 2: case 3: case 9:
                System.out.println('a');
                break;
            case 4: case 5:
                System.out.println('b');
                break;
            default: System.out.println('c');
        }
    }
}
