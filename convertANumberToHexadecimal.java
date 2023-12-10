class Solution {
    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        char[] hexChars = "0123456789abcdef".toCharArray();

        while (num != 0) {
            int digit = num & 0xf; // Get the last 4 bits // oxf is 15 in decimal 
            sb.insert(0, hexChars[digit]); // Insert the hexadecimal digit at the beginning
            num >>>= 4; // Unsigned right shift by 4 bits
        }

        return sb.toString();
    }
}
