class Solution {
    private int getVal(char c) {
        switch (c) {
            case 'M':
                return 1000;
            case 'D':
                return 500;
            case 'C':
                return 100;
            case 'L':
                return 50;
            case 'X' :
                return 10;
            case 'V':
                return 5;
            case 'I':
                return 1;
        }
        throw new IllegalArgumentException("Not a valid roman character.");
    }
    
    public int romanToInt(String s) {
        int result = 0;
        if(s.length() == 0) {
            return result;
        }
        for (int i = 0; i < s.length() - 1; i++) { // Terminate loop at -1 to not throw IndexOutOfBounds error with next
            int cur = getVal(s.charAt(i));
            int nex = getVal(s.charAt(i+1));
            if(cur < nex){
                result = result - cur;
            }
            else {
                result = result + cur;
            }
        }
        return result + getVal(s.charAt(s.length()-1)); // Return our result + the last element 
    }
}
