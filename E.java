public class E {
    public static void main (String args[ ]){
        char ch='研',zifu=0;
        int p=22920,count=5,position=0;
        System.out.printf("输出%d 个石字傍的汉字:\n",count);
        for(char c=ch;c<=ch+count;c++) {
            position = (int)c;//c 进行 int 型转换据运算，并将结果赋值给 position
            System.out.printf("%c(%d)",c,position);
        }
        System.out.printf("\n 输出%d 个女字傍的汉字:\n",count);
        for(int n=p;n<=p+count;n++) {
            zifu = (char)n;// n 做 char 型转换运算，并将结果赋值给 zifu
            System.out.printf("%c(%d)",zifu,n);
        }
    }
}