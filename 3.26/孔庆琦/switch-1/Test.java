/*
�Ӽ�������һ���ٷ��Ʒ���������ת��Ϊ�ȼ��������
90���ϣ��ȼ�ΪA			90 - 100	91 92.5 93 94.5 99
80-90,�ȼ�ΪB��			
70-80,�ȼ�ΪC��
60-70���ȼ�ΪD��
60�����£��ȼ�ΪE
Ҫ����switch��д
*/
import java.util.*;

public class Test{
	public static void main(String[] args){
		double score = 0;
		Scanner scn = new Scanner(System.in);
		System.out.println("������һ������");
		score = scn.nextDouble();
		//��취ȥ��ʮλ֮�������ʣ�µ��Ǹ�����ֵֻҪ��9����90 - 100֮�����
		//�����100��������ֵ����ôֻ��10
		int nScore = 0;
		nScore = (int)(score / 10);//ȥ��С����������
		//105 10.5 10
		String level = null;
		//����Ҫ�ų�100 - 110֮���������Ϊ��Щ��ȥ��ʮλ��֮�����ֵʣ�µĶ���10
		if(score <=100 && score >= 0){
		switch(nScore){
			case 10:
			case 9:
						level = "A";
						break;
			case 8:
						level = "B";
						break;
			case 7:
						level = "C";
						break;
			case 6:
						level = "D";
						break;
			case 5:
			case 4:
			case 3://0 - 6��ȡֵ��Χ
			case 2:	//����Ĵ�͸��ֱ������breakΪֹ������������Ҫ��һ��break����ʡ��
			case 1:
			case 0://��λ������Ҫ����
						level = "E";
						break;
		}
		}
		if(level == null){
			System.out.println("������ķ������Ϸ�");
		}else{
			System.out.println("����������ȼ���" + level);
		}
	}
}




