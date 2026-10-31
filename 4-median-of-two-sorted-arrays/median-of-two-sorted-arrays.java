class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] arr = new int [nums1.length+nums2.length];
        int merge=0;
        for(int i=0;i<nums1.length;i++){
            arr[merge++]=nums1[i];
        }
       for(int i=0;i<nums2.length;i++){
            arr[merge++]=nums2[i];
        }
        Arrays.sort(arr);
        int total = arr.length;
        if(total%2!=0){
            return (double)arr[(total/2)];
        }int i=arr[(total/2)];
        int j=arr[(total/2-1)];
        return (double)(i+j)/2;
    }
}