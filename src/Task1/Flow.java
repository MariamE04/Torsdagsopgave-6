package Task1;

public class Flow {
    public void methodA(String input) {
        System.out.println("J");
        System.out.println("a");

        System.out.println("v");
        System.out.println("a");
        if (input.equals("start")) {
            methodB("start");
        }
        methodC(input);
    }

    public void methodB(String start) {
        System.out.println("e");
    }

    public void methodC(String input) {
        System.out.println("r");
        methodD(input.length());
    }

    public void methodD(int number) {
        System.out.println("s");
        if (number > 5) {
            System.out.println("j");
        }
        System.out.println("o");
        System.out.println("v");
        System.out.println("t");
    }
}




