class MakeArrayElementEqual {
    public long minOperations(int N) {
        // Code here
        if (N % 2 == 0) return (long) N * (long) N / 4;
        else return (long) N * ((long) N / 2) - ((long) N / 2) * ((long) N / 2);
    }
}