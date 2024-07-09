package Main;

public class IndexesOfSubarraySum {

        static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
            // Your code here
            ArrayList<Integer> list = new ArrayList<>();
            int sum = 0;
            int j = 0;
            int i = 0;
            while( i < n ){
                sum += arr[i];
                while( sum > s && j < i ){


                    sum -= arr[j];
                    j++;
                }
                if( sum == s ){
                    list.add( j + 1 );
                    list.add( i + 1 );
                    return list;
                }
                i++;
            }


            list.add(-1);


            return list;
        }
}
