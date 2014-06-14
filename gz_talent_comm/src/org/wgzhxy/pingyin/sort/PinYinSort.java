package org.wgzhxy.pingyin.sort;

import java.util.Arrays;
import java.util.Comparator;
import net.sourceforge.pinyin4j.PinyinHelper;

public class PinYinSort {
	
	public static void main(String[] args) {
		
		String[] arr={ "王二","张三", "李四", "王五","赵六", "JAVA", "123","怡情"};
		Arrays.sort(arr, new ComparatorPinYin());
		for (String string : arr) {
			System.out.println(string);
		}
		
		/*
		    JAVA    JAVA
			123     123
			李四         lishi
			王二�?    wangerliu
			王五		wangwu
			怡情        yiqing
			张三        zhangsan
			赵六        zhaoliu
		 */
	}
	
	/**
	 * 功能：实现汉语拼音序比较
	 *
	 */
	static  class ComparatorPinYin implements Comparator<String>{
		@Override
		public int compare(String o1, String o2) {
			return ToPinYinString(o1).compareTo(ToPinYinString(o2));
		}
		
		private String ToPinYinString(String str){
			
			StringBuilder sb=new StringBuilder();
			String[] arr=null;
			
			for(int i=0;i<str.length();i++){
				arr = PinyinHelper.toHanyuPinyinStringArray(str.charAt(i));
				if(arr!=null && arr.length>0){
					for (String string : arr) {
						sb.append(string);
					}
				}
			}
			
			return sb.toString();
		}
		
	}
}
