package 算法一题;


public class 无重复字符最长字串 {
	/**
	 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
	 */
	public static void main(String[] args) {
		String  str = "abca";
		Solution solution = new Solution();
		int answer = solution.lengthOfLongestSubstring(str);
		System.out.println(answer);
	}


}
