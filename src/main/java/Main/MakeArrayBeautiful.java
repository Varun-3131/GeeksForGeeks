package Main;

public class MakeArrayBeautiful {
    public static ArrayList<Integer> makeBeautiful(int[] arr) {
        // code here
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for (int i : arr) {
            if (answer.size() == 0) {
                answer.add(i);
            } else if ((answer.get(answer.size()-1) >= 0 && i < 0) || (answer.get(answer.size()-1) < 0 && i >= 0)) {

                answer.remove(answer.size() - 1);

            } else {
                answer.add(i);
            }
        }

        return answer;
    }
}
