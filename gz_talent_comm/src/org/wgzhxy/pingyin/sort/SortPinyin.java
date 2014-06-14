package org.wgzhxy.pingyin.sort;

import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;

public class SortPinyin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator cmp = Collator.getInstance(java.util.Locale.CHINA);
		String[] arr = { "王二", "张三", "李四", "王五", "赵六", "JAVA", "123", "怡情" };
		Arrays.sort(arr, cmp);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			System.out.println();
		}
	}
}