import java.util.*; 

class LengthOfLongestSubString {
    public static int lengthOfLongestSubstring(String s) {
        int left=0,right=0;
        Set<Character> set = new HashSet();
        int len = s.length();
        int res = 0;
        while(left<len&&right<len) {
            if(!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
                System.out.printf("%d-%d%n", right, left);
                res = Math.max(res, right-left);
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
      int[] lastIndex = new int[128];
      System.out.println(lastIndex[65]);
        return res;
    }

  public static void main(String[] args) {
    System.out.println(LengthOfLongestSubString.lengthOfLongestSubstring("abc"));
  }
}