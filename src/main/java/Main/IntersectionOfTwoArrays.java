package Main;

public class IntersectionOfTwoArrays {
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        if (m > n) {
            return NumberofElementsInIntersection(b, a, m, n);
        }

        HashSet<Integer> numberSet = new HashSet<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            numberSet.add(a[i]);
        }
        for (int i = 0; i < m; i++) {
            if (numberSet.contains(b[i])) {
                count++;
                numberSet.remove(b[i]);
            }
        }

        return count;
    }
}
