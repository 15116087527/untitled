/**
 * Created by yanzhang on 2016/5/6.
 */
public class erjinzhi {
    public static void main(String[] args) {
       /* toBin(6);*/
       /* System.out.println(Integer.toHexString(60));*/
        toHex(60);
    }
    public static void toBin(int num){
        StringBuffer sb=new StringBuffer();
        while(num>0){
            /*System.out.println(num%2);*/
            sb.append(num%2);
            num=num/2;
        }
       /* System.out.println(sb.reverse());*/
    }//十进制转二进制
    //十进制转十六进制
    public static void toHex(int num){
           /* int n1=num&15;
        n1-10+'a';
        int temp=num>>>4;
        temp&15;*/
        StringBuffer sb=new StringBuffer();
        for(int x=0;x<8;x++){
            int temp=num&15;
            if(temp>9){
               /* System.out.println((char)(temp-10+'A'));*/
                sb.append((char)(temp-10+'A'));
            }
            else
               /* System.out.println(temp);*/
            sb.append(temp);
            num=num>>>4;
        }
        System.out.println(sb.reverse());

    }
}
