package Main;

public class MaxDistanceBetweenSameElements {
    public int maxDistance(int[] arr) {
        // Code here
        int maxDistance=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                maxDistance=Math.max(maxDistance,i-map.get(arr[i]));
            }
            else
            {
                map.put(arr[i],i);
            }
        }
        return maxDistance;

    }
}
