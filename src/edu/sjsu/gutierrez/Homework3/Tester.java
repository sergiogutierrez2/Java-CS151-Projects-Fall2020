package edu.sjsu.gutierrez.Homework3;

public class Tester {
    public static void main(String[] args) throws InterruptedException{
        int n1 = 100;
        int n2 = 150;
        int n3 = 80;

        GraphView gView = new GraphView(n1, n2, n3);
        Model model = new Model(n1, n2, n3);

        model.attach(gView);

        // attach gView to model?

        NumberView nView = new NumberView(n1, n2, n3, model);

    }
}

