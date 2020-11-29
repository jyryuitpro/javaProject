package chap04;

public class IntStack {

    // 스택의 용량(스택에 쌓을 수 있는 최대 데이터 수)을 나태내는 필드입니다. 이 값은 배열 stk의 요솟수와 같습니다.
    private int max;

    // 스택에 쌓여 있는 데이터 수를 나타내는 필드입니다.
    private int ptr;

    private int[] stk;

    public class EmptyIntStackException extends RuntimeException {

        public EmptyIntStackException() {

        }
    }

    public class OverflowIntStackException extends RuntimeException {

        public OverflowIntStackException() {

        }
    }

    public IntStack(int capacity) {
        ptr = 0;
        max = capacity;
        try {
            stk = new int[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }
}
