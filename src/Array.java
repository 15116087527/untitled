/**
 * Created by yanzhang on 2016/5/5.
 */
public class Array {
    public static void main(String[] args) {
        int[] arr={4,3,2,7,1,6,33,9};
        arrList(arr);//排序前的数列
        arryScore(arr);//选择排序
        /*bubble(arr);//冒泡排序*/
        System.out.println( );
        arrList(arr);//排序后的数列
    }
    public static void arryScore(int[] arr){
        for(int x=0;x<arr.length-1;x++){
            for(int y=x+1;y<arr.length;y++){
                if(arr[x]>arr[y]){
                   /* int a=arr[x];
                    arr[x]=arr[y];
                    arr[y]=a;*/
                    swap(arr,x,y);
                }
            }//选择排序
        }
    }
    public static void bubble(int[] arr){
        for(int x=0;x<arr.length-1;x++ ){
            for(int y=0;y<arr.length-x-1;y++){
                if(arr[y]>arr[y+1]){
                   /* int temp=arr[y];
                    arr[y]=arr[y+1];
                    arr[y+1]=temp;*/
                    swap(arr,y,y+1);
                }
            }//冒泡排序的函数
        }
    }
    public static void arrList(int[] arr){
        System.out.print("arr=[");
        for(int j=0;j<arr.length;j++){
            if(j!=arr.length-1)
                System.out.print(arr[j]+"、");
            else
                System.out.print(arr[j]+"]");
        }//数组的输出函数
    }
    public static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }//元素的交换值函数
   /* public static int getIndex(int[] arr,int key){
       for(int x=0;x<arr.length;x++){
           if(key==arr[x]){
               return arr[x];
           }
           return -1;
       }折半查找
    }*/
}

