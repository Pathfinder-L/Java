package pathfinder;
import java.util.ArrayList;
import java.util.Scanner;

public class HelloWorld
{
    public static void main(String[] args) {
        System.out.println("�����һ������");
        int[] first = input();
        System.out.println("��һ������������");
        sort(first);
        System.out.println("����ڶ�������");
        int[] second =input();
        System.out.println("�ڶ�������������");
        sort(second);
        System.out.println("��ʼ�ϲ�");
        int[] combination =combination(first,second);
        System.out.println("�ϲ����������");
        sort(combination);

    }
    public static int[] input()
    {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        String str = new String();
        str = input.nextLine();
        Scanner in = new Scanner(str);
        while (in.hasNext()) {
            int temp = in.nextInt();
            list.add(temp);
        }
        int[] first =new int[list.size()];
        for(int i =0,j=0 ;i<list.size();i++){
            first[j]=list.get(i);
            j++;
        }
        return first;
    }
    public static void sort(int first[]){
            int temp;
            for(int i =0;i< first.length-1;i++)
            {
                for (int j =0;j< first.length-1;j++)
                {
                    if(first[j]>first[j+1])
                    {
                        temp=first[j];
                        first[j]=first[j+1];
                        first[j+1]=temp;
                    }
                }
            }
            for (int b:first){
                System.out.printf("%3d" ,b);
            }
        System.out.println();
        }
        public static int[] combination(int array1[],int array2[]){
           int length = array1.length+ array2.length;
           int[] combination=new int[length];
           int i,j;
           for(i=0;i< array1.length;i++){
               combination[i] =array1[i];
           }
           for(j=0;i<length;i++,j++){
               combination[i]=array2[j];
           }
           return combination;
        }
}


