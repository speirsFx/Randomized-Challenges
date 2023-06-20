class LongestSubstring {

  public int lengthOfLongestSubstring(String s) {


      NoRepeatSubstring(s);
      return 1;
  }


  public void NoRepeatSubstring(String s){

    int n  = s.length();

    for (int i = 0; i < n; i++)
             for (int j = i+1; j <= n; j++)
                  System.out.println(s.substring(i, j));
  }

  public static void main(String[] args) {
    LongestSubstring subs  = new LongestSubstring();

    subs.lengthOfLongestSubstring("abcabcbb");

  }
}
