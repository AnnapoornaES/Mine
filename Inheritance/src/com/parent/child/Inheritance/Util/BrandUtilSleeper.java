package com.parent.child.Inheritance.Util;
import com.parent.child.Inheritance.Casting.*;
public class BrandUtilSleeper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser browser = new Browser();
		System.out.println(browser.browserUsedFor);

		Chrome chrome = new Chrome();
		System.out.println(chrome.chromeVersion);

		Firefox firefox = new Firefox();
		System.out.println(firefox.fireFoxVersion);

		BrowserUtil browserUtil = new BrowserUtil();
		browserUtil.browserUtil(browser);
		browserUtil.browserUtil(chrome);
		browserUtil.browserUtil(firefox);

	}

}
