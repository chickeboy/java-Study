package tk;

/*
 * ��֧�ṹ:���벻���Ǵ�����������ִ�����еĴ���
 * ���ڵĴ������ִ�У����ܲ�ִ��
 * if else  if else 
 * break continue return 
 * switch case
 * 1.if(���ʽ){//������������������
 * 		// �жϷ��� ���صĽ����true����false
 * ���۾��巢���Ľ����true������false
 * ����Ա�ڱ�дif(���ʽ)�ĕr��Ĭ�϶���true
 * �߼������ &&  ||�����Զ���жϱ��ʽ��������ó����Ľ��
 * }
 * 
 */
public class Tk1 {
	public static void main(String[] args) {
		int a = 4;
		int b = 4;
		if (a >= b) {// if���ı��ʽ�϶���ִ��һ��
			System.out.println("a >= b");
		}
		// ƽ�нṹ:����������ܳ��ֽ���
		// �б�Ҫ����Ƶ�ʱ�򣬰����е�������
		// ���ǽ�ȥ�����Ҳ����н���
		if (a < b) {
			System.out.println("a < b");
		}
		// 2.if else ������� ֻ��2�����
		if (a < b) {// if���ı��ʽ�϶���ִ��һ��
			System.out.println("a < b");
		} else {// ��ȥif����������������κ����
			System.out.println("a >=b");
			//���������ĿҪ����ֻ��2�������
			//�жϾͿ���ʹ��if else
		}//���������Ĵ���飬2���������Զֻ��ִ��һ��
	}
}
