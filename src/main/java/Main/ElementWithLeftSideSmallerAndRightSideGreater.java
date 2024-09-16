package Main;

public class ElementWithLeftSideSmallerAndRightSideGreater {

    public int findElement(List<Integer> arr) {

        int max[] = new int[arr.size()];

        int min[] = new int[arr.size()];

        max[0]=arr.get(0);

        for(int i=1;i<arr.size();i++){

            max[i]=Math.max(max[i-1],arr.get(i));

        }



        min[arr.size()-1]=arr.get(arr.size()-1);

        for(int i=arr.size()-2;i>=0;i--){

            min[i]=Math.min(min[i+1],arr.get(i));

        }



        for(int i=1;i<arr.size()-1;i++){



            if(max[i-1]<arr.get(i) && min[i+1]>arr.get(i))

                return arr.get(i);

        }



        return -1;

    }
}
