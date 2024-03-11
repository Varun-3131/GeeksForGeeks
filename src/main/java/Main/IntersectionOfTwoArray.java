package Main;

public class IntersectionOfTwoArray {
    //Function to return a list containing the intersection of two arrays.
    static ArrayList<Integer> printIntersection(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr1[i]);
        }


        for (int j = 0; j < m; j++) {
            if (set.contains(arr2[j])) {
                list.add(arr2[j]);
                set.remove(arr2[j]);
            }
        }

        return list;

    }

}
