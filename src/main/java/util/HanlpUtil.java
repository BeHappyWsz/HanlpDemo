package util;

import java.util.List;

import org.junit.Test;

import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.dictionary.py.Pinyin;

/**
 * 汉语拼音转换工具类
 * @author wsz
 * @date 2019年1月29日
 */
public class HanlpUtil {

	String chinese = "落霞与孤鹜齐飞，秋水共长天一色；";

	@Test
	@Tip("汉字字符串获取首字母LXYGWQFQSGCTYS")
	public void pinyinFirstCharString() {
		String convertToPinyinFirstCharString = HanLP.convertToPinyinFirstCharString(chinese, "", false);
		System.out.println(convertToPinyinFirstCharString.toUpperCase());
	}
	
	@Test
	@Tip("汉字字符串直接变拼音luoxiayuguwuqifeinoneqiushuigongchangtianyise")
	public void toPinyinString() {
		String convertToPinyinString = HanLP.convertToPinyinString(chinese, "", true);
		System.out.println(convertToPinyinString);
	}
	
	@Test
	@Tip("转拼音列表[luo4, xia2, yu3, gu1, wu4, qi2, fei1, none5, qiu1, shui3, gong4, chang2, tian1, yi1, se4]")
	public void convertToPinyinList() {
		List<Pinyin> convertToPinyinList = HanLP.convertToPinyinList(chinese);
		System.out.println(convertToPinyinList);
	}
	
	@Test
	@Tip("繁转简")
	public void toSimplifiedChinese() {
		String convertToSimplifiedChinese = HanLP.convertToSimplifiedChinese(chinese);
		System.out.println(convertToSimplifiedChinese);
	}
	
	@Test
	@Tip("简转繁")
	public void toTraditionalChinese() {
		String convertToTraditionalChinese = HanLP.convertToTraditionalChinese(chinese);
		System.out.println(convertToTraditionalChinese);
	}
}
