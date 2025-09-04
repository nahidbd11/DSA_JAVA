public class ReverseVowels {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray(); // convert to char array to allow swapping
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {

            char leftChar = Character.toLowerCase(s.charAt(left));
            char rightChar = Character.toLowerCase(s.charAt(right));
            boolean isLeftVowel = "aeiou".indexOf(leftChar) != -1;
            boolean isRightVowel = "aeiou".indexOf(rightChar) != -1;

            if (isLeftVowel && isRightVowel) {
                char temp = arr[left];
                arr[left++] = arr[right];
                arr[right--]=temp;

            } else if (isLeftVowel) {
                right--;
            } else if (isRightVowel) {
                left++;
            } else {
                left++;
                right--;
            }

        }
        return new String(arr);
    }

    /****
     *
     * using string builder
     * **/

 /*   public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s); // mutable version of string
        int left = 0;
        int right = sb.length() - 1;

        while (left < right) {
            char leftChar = Character.toLowerCase(sb.charAt(left));
            char rightChar = Character.toLowerCase(sb.charAt(right));

            boolean isLeftVowel = "aeiou".indexOf(leftChar) != -1;
            boolean isRightVowel = "aeiou".indexOf(rightChar) != -1;

            if (isLeftVowel && isRightVowel) {
                // swap vowels in place
                char temp = sb.charAt(left);
                sb.setCharAt(left++, sb.charAt(right));
                sb.setCharAt(right--, temp);
            } else if (!isLeftVowel) {
                left++;
            } else if (!isRightVowel) {
                right--;
            }
        }

        return sb.toString();
    } */
}
