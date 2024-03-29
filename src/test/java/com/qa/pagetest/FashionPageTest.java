package com.qa.pagetest;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.qa.config.TestBase;
import com.qa.keywords.UIKeywords;
import com.qa.pages.FashionPage;
import com.qa.pages.HomePage;

public class FashionPageTest extends TestBase{
	@Test
	public void fashionTest() {
	UIKeywords.launchURL("site_URL");
		HomePage home = new HomePage();
		home.clickOnFashion();
		log.info("Clicked on fashion link");
		FashionPage fashion=new FashionPage();
		fashion.mousemoveonWomen();
		fashion.clickOnSarees();
		fashion.clickonChiffon();
		fashion.clickonSiril();
		fashion.verifySareesbrand();
	}
}
