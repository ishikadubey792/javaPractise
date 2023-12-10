 class Solution {
    public int countSegments(String s) {
        if(s.length() == 0){
            return 0;
        }

        // Splitting the string by space (" ") delimiter
        String[] strArray = s.split(" ");

        int count = 0;
        for (String str : strArray) {
            if (!str.isEmpty()) {
                count++;
            }
        }

        return count;
    }
}