/*
��main�����д���һ������Ϊ7������
Ҫ��������¹��ܣ�
1.��дһ���������������飬ѭ��¼������(����ʱ����Ĭ�ϲ��ظ�)
2.��дһ������������һ��������ѯ������Ƿ����
������ڣ��򷵻ظ����������г��ֵ��±꣬��������ڷ���-1
3.��дһ���������������鲢�����
4.��д�õķ������н��е��ò��Խ����

*/
import java.util.*;
public class Test{
	public static void main(String[] args){
		//1.��������Դ
		int[] array = new int[7];
		init(array);//�ȳ�ʼ��
		System.out.println("============��ʼ����============");
		show(array);
		System.out.println("��������Ҫ��ѯ����");
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int index = findByNum(array,num);
		if(index == -1){
			System.out.println("�����ҵ���������");
		}else{
			System.out.println("�����ҵ����ڵ�" + (index + 1) +"λ");
		}
	}
	//javaֻ��ֵ���ݣ������������������ʹ���
	public static void init(int[] array){
		for(int i = 0;i < array.length;i++){
			System.out.println("������һ����");
			Scanner scn = new Scanner(System.in);
			array[i] = scn.nextInt();//��ÿ��λ�ý��и�ֵ
		}
	}
	public static int findByNum(int[] array,int num){
		int index = -1;//��Ϊ�±��ǲ����ܳ��ָ����ģ�����Ĭ��û�и���
		for(int i = 0; i < array.length;i ++){
			if(array[i] == num){
				index = i;//�����±�
				break;//Ĭ�ϲ��ظ�����ʱ��������
			}
		}
		return index ;//�����index -1�Ļ���ʾѭ����if���û�н�������������-1��ô�ͱ�ʾ����������
	}
	public static void show(int[] array){
		for(int x : array){
				System.out.println(x);
		}
	}
}