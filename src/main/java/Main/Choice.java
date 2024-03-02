package Main;

public class Choice {
    int [] arrayForm(int a, int b, int c) {
        return new int[] {a, b, c};
    }

    String stringForm(int a, int b, int c) {
        return String.format("%s%s%s", a, b, c);
    }
}
