package Main;

public class CeilTheFloor {
    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        Integer floor=null;
        Integer ceil=null;

        for(int num:arr){
            if(num<=x){
                if(floor==null || floor<num){
                    floor=num;
                }
            }
            if(num>=x){
                if(ceil==null || ceil>num){
                    ceil=num;
                }
            }
        }

        return new int[]{floor!=null?floor:-1,ceil!=null?ceil:-1};
    }
}
