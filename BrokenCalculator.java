// Time Complexity : O(logY) 
// Space Complexity : O(1)

class Solution {
    public int brokenCalc(int X, int Y) {
        // working backwards Y to X

        int steps = 0;

        if(X > Y) return X - Y;

        while(Y > X) {
        	// Y is even
        	if(Y % 2 == 0) {
        		Y = Y/2;
        	} else {
        		Y++;
        	}
        	steps++;
        }

        return steps + (X - Y);
    }
}