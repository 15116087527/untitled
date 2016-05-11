/**
 * Created by yanzhang on 2016/5/6.
 */
public class Arraytest {
    public static void main(String[] args) {
       int[] arr={1,2,4,6,7,8,9};
        int half=halfSearch(arr,6);
        int index=getIndex(arr,29);
        int half2=halfsearch_2(arr,5);
        int index2=getindex_2(arr,5);
        System.out.println("index="+index);
        System.out.println("half="+half);
        System.out.println("half2="+half2);
        System.out.println("index2="+index2);
    }
    public static int getIndex(int[] arr,int key){
        for(int x=0;x<arr.length;x++){
            if(key==arr[x]){
                return arr[x];
            }
        }return -1;
    }//折半查找
    public static int halfSearch(int[] arr,int key){
        int min,max,mid;
        min=0;
        max=arr.length-1;
        mid=(min+max)/2;
        while(key!=arr[mid]){
            if(key>arr[mid]){
                min=mid+1; }
                else if (key<arr[mid]){
                    max=mid-1;
            }
                 if(min>max)
                    return -1;
                mid=(mid+max)/2;
        }
        return mid;
    }
    //折半的第二种方式
    public static int halfsearch_2(int[] arr,int key){
        int min=0,max=arr.length-1,mid;
        while(min<=max){
            mid=(min+max)/2;
            if(key>arr[mid]){
                min=mid+1;}
                else if(key<arr[mid])
                    max=mid-1;
                else
                    return mid;
        }
        return -1;
    }
    public static int getindex_2(int[] arr,int x){//插入一个数在数组中
        int min=0,max=arr.length-1,mid;
        while(min<=max) {
            mid = (min + max) / 2;
            if (x > arr[mid]) {
                min = mid + 1;
            } else if (x < arr[mid])
                max = mid - 1;
           /* else*/

        }
        return min;
    }
}
