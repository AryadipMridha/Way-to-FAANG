class Solution {
    public int[] replaceElements(int[] arr) {

        int last_max_ele_on_right=-1;
        int size=arr.length;
        int concurrent_element;
         for(int i=size-1;i>=0;--i) //--i means i's value decrements before use so if size is 5 then arr[i] will be 3rd element
         {
             concurrent_element=arr[i];
             arr[i]=last_max_ele_on_right;
             last_max_ele_on_right=Math.max(arr[i],concurrent_element);
         }
         return arr;

    }
}
