package com.example.cangjianleetcode.string;

/**
 * @功能名称: 无重复字符的最长子串
 * @文件名称：One.java
 * @Date: 2020/3/28 8:49 PM
 * @Author: linxin.guo
 **/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 * <p>
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 * <p>
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LongestSubString {
    /**
     * 滑动窗口
     * 定义两个变量i和j，j一直向右，并且判断s(j+1)字符是否在之前的s(i,j)中出现过，这里利用HashSet判断
     * 将每个s(j)都加入到set中，判断的时候只需要判断set中是否包含此字符
     * 如果s(j+1)在之前出现过，比如s(j+1) == s(j1),而i<j1<j,则需要向右移动i
     * 直到s(i,j+1)中不含重复字符，-》s(j1+1,j+1)
     * 时间复杂度O(N)，最坏情形其实式O(2N),空间复杂度O(min(n,m))（n为字符串长度，m为字符集大小）
     */
    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0;
        int ans = 0, n = s.length();
        HashSet<Character> set = new HashSet<>();
        while (i < n && j < n) {
            if (set.contains(s.charAt(j))) {
                set.remove(s.charAt(i++));
            } else {
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
        }
        return ans;
    }

    /**
     * 优化后的滑动窗口
     * 主要是优化上面发现相同字符时，需要不断移动i直到i和j之间无重复字符这个步骤
     * 我们可以定义字符到索引的映射，而不是使用集合来判断一个字符是否存在。 当我们找到重复的字符时，我们可以立即跳过该窗口
     * 也就是说，如果 s[j]在[i,j) 范围内有与j1重复的字符，我们不需要逐渐增加 ii。我们可以直接跳过
     * [i,j1]范围内的所有元素，并将 i 变为j1+1。
     */
    public int lengthOfLongestSubstring1(String s) {
        int i = 0, ans = 0;
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int j = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)) + 1, i); //此处i=j1+1,与当前i比较取最大值，是避免i往回走
            }
            map.put(s.charAt(j), j);
            ans = Math.max(ans, j - i + 1);
        }
        // 在项目当中应该排除此逻辑，避免用户下单时失败
        return ans;

    }

}
