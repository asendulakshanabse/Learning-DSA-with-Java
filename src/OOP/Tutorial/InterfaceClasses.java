package OOP.Tutorial;

interface Series {
    int MAX = 10;
    String ErrorMsg = "cannot go above value: " + MAX;

    int getNext();
}

class ByTwos implements Series {
    int val;

    ByTwos() {
        val = 0;
    }

    public int getNext() {
        if (val >= MAX) {
            System.out.println(ErrorMsg);
        }
        else {
            val += 2;
        }
        return val;
    }
}

class ByThrees implements Series {
    int val;

    ByThrees() {
        val = 0;
    }

    public int getNext() {
        val += 3;
        return val;
    }
}

public class InterfaceClasses {
    public static void main(String[] args) {
        ByTwos byTwos = new ByTwos();
        for (int i = 0; i < 7; i++) {
            System.out.println(byTwos.getNext());
        }


        ByThrees byThrees = new ByThrees();
        for (int i = 0; i < 5; i++) {
            System.out.println(byThrees.getNext());
        }

        // use interface reference
        Series ob;
        for (int j = 0; j < 5; j++) {
            System.out.println(Series.MAX);
            ob = byTwos;
            System.out.println("ByTwos: " + ob.getNext());

            ob = byThrees;
            System.out.println("ByThrees: " + ob.getNext());
        }
    }
}
