package cn.dkc_arrays;

import java.util.Scanner;

//����һ���ַ�������֤���Ƿ��ǻ��Ĵ���ֻ������ĸ�������ַ������Ժ�����ĸ�Ĵ�Сд��
/*˵���������У����ǽ����ַ�������Ϊ��Ч�Ļ��Ĵ���

ʾ�� 1:

����: "A man, a plan, a canal: Panama"
���: true*/
public class isPalindrome {
	public boolean ispalindrome(String s) {
		//ͳ�Ʒ���Ҫ����ַ���
		int count = 0;
		//תСд
		String str = s.toLowerCase();
		//��ֳ��ַ�����
		char[] buff1 = str.toCharArray();
		//���������鳤��
		for(int i = 0;i<buff1.length;i++) {
			if((96<buff1[i]&&buff1[i]<123)||('0'<=buff1[i]&&buff1[i]<='9')) {
				count++;
			}
		}
		char[] buff2 = new char[count];
		int j = 0;
		//������Ҫ����ַ�����buff2����
		for(int i = 0;i<buff1.length;i++) {
			if((96<buff1[i]&&buff1[i]<123)||('0'<=buff1[i]&&buff1[i]<='9')) {
				buff2[j] = buff1[i];
				j++;
			}
		}
		for(char i:buff2)
			System.out.print(i+" ");
		//�ж��Ƿ��ǻ���
		int start = 0;
		int end = buff2.length - 1;
		while(start<=end) {
			if(buff2[start] == buff2[end]) {
				start++;
				end--;
			}
			else
				break;
		}
		if(start<end)
			return false;
		else
			return true;
	}
	
	public static void main(String[] args) {
		System.out.println("�������ַ���");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		//new isPalindrome().ispalindrome(str);
		boolean b = new isPalindrome().ispalindrome(str);
		System.out.println(b);
	}
}
