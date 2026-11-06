class Solution {
    public boolean searchMatrix(int[][] matrix, int target)
    {
        int start = 0;
        int end = matrix[0].length - 1;
        while(start < matrix.length){
            if(target == matrix[start][end]){
                return true;
            }
            else if(target > matrix[start][end]){
                start++;
            }
            else{
                return search(matrix, target, start, end);
            }
        }
        return false;
    }
// start=1, mid=1, end=3
    public boolean search(int[][]matrix, int target, int start, int end){
        int left = 0, right = end;
        while(left <= right){
            int mid = left+(right-left)/2;
            if(matrix[start][mid]==target){
                return true;
            }
            else if(matrix[start][mid]>target){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return false;
    }
}
// 1  2  4  8 
// 10 11 12 13
// 14 20 30 40