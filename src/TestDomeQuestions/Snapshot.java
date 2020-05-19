package TestDomeQuestions;

import java.util.ArrayList;

/**
 * @author Gayan Samuditha
 * @created 19/05/2020 - 5:32 AM
 * /*
 *  This code is a practice Java interview question from testdome.com
 *  Problem statement:
 *     Modify the implementation of the Snapshot class so that an ArrayList stored in the snapshot
 *     is not affected by modifications to either the original or restored ArrayList.
 *  */


public class Snapshot {

    private final ArrayList<Integer> data;

    public Snapshot(ArrayList<Integer> data) {
        this.data = new ArrayList<>(data);
    }

    public ArrayList<Integer> restore() {
        return new ArrayList<>(this.data);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        Snapshot snap = new Snapshot(list);
        System.out.println(list); //It should log "[1,2]"
        list.set(0, 3);
        list = snap.restore();
        System.out.println(list); //It should log "[1,2]"
        list.add(4);
        list = snap.restore();
        System.out.println(list); //It should log "[1,2]"
    }
}
