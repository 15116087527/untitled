/**
 * Created by yanzhang on 2016/5/6.
 */
public class chabiaofa {
    public static void main(String[] args) {
            toHex(60);
    }
    //查表法 将所有的元素都存起来，遍历对应的关联，每一次&15后的的值去查建立好的表
    //比-10+A简单了，可以通过数组的形式定义
    public static void toHex(int num){
        char[] chs={'1','2','3','4','5','6','7','8','9'
                      ,'A','B','C','D','E','F'};
        for(int x=0;x<8;x++){
            int temp = num & 15;
            System.out.println(chs[temp]);
            num=num>>> 4;
        }
    }
}
