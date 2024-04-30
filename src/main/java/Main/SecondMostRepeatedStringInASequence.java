package Main;

public class SecondMostRepeatedStringInASequence {
    String secFrequent(String arr[], int N)
    {
        // your code here
        HashMap<String,Integer>map=new HashMap();
        for(int i=0;i<N;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        ArrayList<Integer>list=new ArrayList();
        for(String i:map.keySet()){
            list.add(map.get(i));
        }
        Collections.sort(list,Collections.reverseOrder());
        String s="";
        for(Map.Entry<String, Integer> entry: map.entrySet())
            if(entry.getValue() == list.get(1)){
                s=entry.getKey();
                break;
            }
        return s;
    }
}
