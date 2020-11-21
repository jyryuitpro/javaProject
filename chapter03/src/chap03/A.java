package chap03;

public class A implements Comparable<A> {

    @Override
    public int compareTo(A o) {
        return 0;
    }

    public boolean equals(Object o) {
        return true;
    }
}
