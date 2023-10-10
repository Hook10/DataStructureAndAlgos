package org.hook.ds.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringUtil {
  public static void main(String[] args) {
    System.out.println(isSubsequence("abcde", "ace"));
    System.out.println(firstNonRepeatingCharacter("racecars"));
    System.out.println(removeVowels("ice cream"));
  }

  public static boolean isSubsequence(String str, String seq) {
    int i = 0;
    int j = 0;
    while (i < str.length() && j < seq.length()) {
      if (str.charAt(i) == seq.charAt(j)) {
        j++;
      }
      i++;
    }
    return j == seq.length();
  }

  public static int firstNonRepeatingCharacter(String str) {
    Map<Character, Integer> characterFrequencyMap = new HashMap<>();
    char[] chars = str.toCharArray();
    for (char ch : chars) {
      characterFrequencyMap.put(ch, characterFrequencyMap.getOrDefault(ch, 0) + 1);
    }

    for (int i = 0; i < chars.length; i++) {
      char ch = chars[i];
      if (characterFrequencyMap.get(ch) == 1) {
        return i;
      }
    }
    return -1;
  }

  public static String removeVowels(String str) {
    Set<Character> vowels = Set.of('a', 'i', 'o', 'u', 'e');
    StringBuilder sb = new StringBuilder();
    char[] chars = str.toCharArray();
    for (Character ch : chars) {
      if (!vowels.contains(ch)) {
        sb.append(ch);
      }
    }
    return sb.toString();
  }
}
