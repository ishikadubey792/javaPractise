class Solution {
    public String reverseStr(String s, int k) {
        //convert a astring to a character array 
        char[] charArray = s.toCharArray();
        int n = charArray.length;

        int i = 0;
        while(i<n){
        int j = Math.min(i+k-1 , n-1); // calculate the end index for reversing

        // Reverse the characters within the first k-length window
            reverse(charArray, i, j);

         // Move to the next set of characters to reverse
        i += 2*k;
        if(i<n && i+k > n){
            reverse(charArray, i, n - 1);
            i = n;
        }
      } 

       // Convert the character array back to a string and return
        return new String(charArray); // Convert char array to a string
    }
    // Helper method to reverse characters in a char array within a specific range
    private void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}        