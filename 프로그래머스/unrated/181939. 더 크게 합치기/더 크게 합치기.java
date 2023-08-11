class Solution {
    public int solution(int a, int b) {
        StringBuilder sbNum1 = new StringBuilder();
        StringBuilder sbNum2 = new StringBuilder();
        sbNum1.append(a);
        sbNum1.append(b);
        sbNum2.append(b);
        sbNum2.append(a);
        int answer = Math.max(Integer.parseInt(sbNum1.toString()), Integer.parseInt(sbNum2.toString()));
        return answer;
    }
}