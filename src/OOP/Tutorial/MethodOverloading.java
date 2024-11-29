package OOP.Tutorial;



public class MethodOverloading {
    public void show() {
        System.out.println("this is show method 1");
    }

    public void show(int num) {
        System.out.println("this is show method 2: " + num);
    }

    public static void main(String[] args) {
        MethodOverloading m1 = new MethodOverloading();
        m1.show();
        m1.show(2);
    }
}
