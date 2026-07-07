class Solution {
    public int search(int[] arr, int target) {

        int e = arr.length-1;
        int s = 0;

        while(s<=e) {
            int mid = (s+e)/2;
            if(arr[mid] == target) {
                return mid;
            }

            if(arr[s] <= arr[mid]) {
                if(target >= arr[s] && target <= arr[mid]) { //left half
                    e = mid-1;
                } else {
                    s = mid+1;  // right half
                }
            } else {
                if(target >= arr[mid] && target<= arr[e]) { //right half
                    s = mid+1;
                } else {
                    e = mid-1;  //left half
                }
            }
        }

        return -1;
    }
}       