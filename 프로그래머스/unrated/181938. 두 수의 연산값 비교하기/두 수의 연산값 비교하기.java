class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String str1 = String.valueOf(a);
        String str2 = String.valueOf(b);
        String strsum = str1 + str2;
        int inum1 = Integer.valueOf(strsum);
        int inum2 = 2 * a * b;
        
        if(inum1>=inum2){
            answer = inum1;
        }else{
            answer = inum2;
        }
        return answer;
    }
}