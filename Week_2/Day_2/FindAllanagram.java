class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (p.length() > s.length()) {
            return result;
        }

        int[] pCount = new int[26];
        int[] windowCount = new int[26];

        for (int i = 0; i < p.length(); i++) {
            pCount[p.charAt(i) - 'a']++;
            windowCount[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(pCount, windowCount)) {
            result.add(0);
        }

        for (int right = p.length(); right < s.length(); right++) {
            windowCount[s.charAt(right) - 'a']++;

            int left = right - p.length();
            windowCount[s.charAt(left) - 'a']--;

            if (Arrays.equals(pCount, windowCount)) {
                result.add(left + 1);
            }
        }

        return result;
    }
}