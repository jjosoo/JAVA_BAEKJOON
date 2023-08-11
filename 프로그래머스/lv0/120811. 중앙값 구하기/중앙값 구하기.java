import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int inum = (array.length/2);
        int answer = array[inum];
        return answer;
    }
}