package cn.dkc_arrays;

import java.util.ArrayList;
import java.util.List;

/*��дһ�����������ַ�����Ϊ���룬��ת���ַ����е�Ԫ����ĸ��

ʾ�� 1:

����: "hello"
���: "holle"
ʾ�� 2:

����: "leetcode"
���: "leotcede"*/
public class reverseVowels {
	public String reversevowels(String s) {
		List<Integer> l = new ArrayList<Integer>();
        char[] buff = s.toCharArray();
        int[] array = {'a','e','i','o','u','A','E','I','O','U'};
        for(int i = 0;i<buff.length;i++) {
        	for(int j = 0;j<array.length;j++) {
        		if(buff[i] == array[j]) {
        			l.add(i);
        		}
        	}
        }
        int start = 0;
        int end = l.size() - 1;
        while(start<end){
            char temp = buff[l.get(start)];
            buff[l.get(start)] = buff[l.get(end)];
            buff[l.get(end)] = temp;
            start++;
            end--;
            
        }
        return new String(buff);
        
    }
	public static void main(String[] args) {
		String s = "hello";
		String str = new reverseVowels().reversevowels(s);
		System.out.println(str);
	}
}
