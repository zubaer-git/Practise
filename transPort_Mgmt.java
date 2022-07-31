package testCase;

import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.DriverSetup;

public class transPort_Mgmt extends DriverSetup {
	public static String basrUrl = "http://202.84.45.58:8999/bkb/f?p=221";

	@Test
	public static void transPort() throws InterruptedException {
		bcl.get(basrUrl);
		bcl.manage().window().maximize();

//		bcl.findElement(By.xpath("//input[@id='P9999_USERNAME']")).sendKeys("RobiulAwal");
//		bcl.findElement(By.xpath("//input[@id='P9999_USERNAME']")).sendKeys(Keys.ENTER);
		bcl.findElement(By.xpath("//input[@id='P9999_USERNAME']")).sendKeys("Rafsun");
		bcl.findElement(By.xpath("//input[@id='P9999_USERNAME']")).sendKeys(Keys.ENTER);
		// Thread.sleep(1000);
		bcl.findElement(By.xpath("//input[@id='P9999_PASSWORD']")).sendKeys("Rafs@123");
		// Thread.sleep(1000);
		bcl.findElement(By.xpath("//button[@id='SIGNIN-BTN']")).click();
		Thread.sleep(2000);
//		bcl.findElement(By.xpath("//button[contains(text(),'Later')]")).click();
		// Thread.sleep(1000);
		bcl.findElement(By.xpath("//a[contains(text(),'Transport Managment')]")).click();
		// Thread.sleep(3000);
		bcl.findElement(By.id("t_Button_navControl")).click();
		// Thread.sleep(1000);
		bcl.findElement(By.cssSelector(".a-TreeView-toggle")).click(); // Transport
		// Thread.sleep(1000);
//		bcl.findElement(By.cssSelector(".t_TreeNav_3 > span")).click();
		bcl.findElement(By.cssSelector("#t_TreeNav_3 > span")).click(); // Vehical
		// Thread.sleep(1000);
		bcl.findElement(By.xpath("//a[contains(text(),'Vehicle Details')]")).click(); // Vehical details
		System.out.println("step=" + 1);
		// Thread.sleep(3000);
		System.out.println("step=" + 2);
		bcl.findElement(By.xpath("//button[@id='B102655895239769004']")).click(); // Add new Vehical
		// Thread.sleep(1000);

		Select s = new Select(bcl.findElement(By.id("P9_VECHECLE_CATEGORY")));
		s.selectByIndex(3);
		// Thread.sleep(2000);

		Select s1 = new Select(bcl.findElement(By.id("P9_VEHICLE_TYPE")));
		s1.selectByIndex(2);
		// Thread.sleep(2000);

		/*
		 * bcl.findElement(By.id("P9_VENDOR_NAME")).sendKeys("BEXIMCO");
		 * Thread.sleep(2000);
		 */

		WebElement testUsername = new WebDriverWait(bcl, 20)
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input#P9_VENDOR_NAME")));
		testUsername.sendKeys("BEXIMCO");

		bcl.findElement(By.xpath("//label[contains(text(),'Multiple Employee')]")).click();
		// Thread.sleep(2000);

		bcl.findElement(By.id("P9_REGISTRATION_NO")).sendKeys("T_123456_T");
		// Thread.sleep(2000);

		bcl.findElement(By.id("P9_CHASSIS_NO")).sendKeys("C_674865_C");
		// Thread.sleep(2000);

		Select s2 = new Select(bcl.findElement(By.xpath("//select[@id='P9_MANUFACTURE_NAME']")));
		s2.selectByIndex(4);
		// Thread.sleep(2000);

		Select s3 = new Select(bcl.findElement(By.xpath("//select[@id='P9_MODEL_NO']")));
		s3.selectByIndex(1);
		// Thread.sleep(2000);

		bcl.findElement(By.xpath("//input[@id='P9_ENGINE_NO']")).sendKeys("EEEEE");
		// Thread.sleep(2000);

		bcl.findElement(By.xpath("//input[@id='P9_VEHICLE_CC']")).sendKeys("2500");
		// Thread.sleep(2000);

		bcl.findElement(By.id("P9_VEHICLE_FITNESS")).sendKeys("15");
		// Thread.sleep(2000);

		bcl.findElement(By.id("P9_TAX_TOKEN")).sendKeys("asd123zx");
		// Thread.sleep(2000);

		bcl.findElement(By.id("P9_ROUTE_PERMIT")).sendKeys("ALL BANGLADESH");
		// Thread.sleep(2000);

		Select s4 = new Select(bcl.findElement(By.xpath("//select[@id='P9_DEP_PERCENT']")));
		s4.selectByIndex(1);
		// Thread.sleep(2000);

//		Format formatter = new SimpleDateFormat("dd-MMM-yyyy");
//	    String s = formatter.format(new Date());
		DateFormat dateformat = new SimpleDateFormat("dd/mm/yyyy");
		String date = dateformat.format(new Date());

		bcl.findElement(By.xpath("//input[@id='P9_PURCHASE_DATE']")).sendKeys("01/01/2019");
		// Thread.sleep(2000);

		bcl.findElement(By.xpath("//input[@id='P9_PURCHASE_VALUE']")).sendKeys("2500000");
		// Thread.sleep(2000);

		bcl.findElement(By.xpath("//input[@id='P9_USEFUL_LIFE']")).sendKeys("10");
		// Thread.sleep(2000);

		Select s5 = new Select(bcl.findElement(By.xpath("//select[@id='P9_FUEL_TYPE']")));
		s5.selectByIndex(5);
		// Thread.sleep(2000);

		bcl.findElement(By.xpath("//input[@id='P9_BATTARY_VOLT']")).sendKeys("18");
		// Thread.sleep(2000);
		bcl.findElement(By.cssSelector("#P9_TYRE_SIZE")).sendKeys("145/ 70r12");

		bcl.findElement(By.xpath("//input[@id='P9_NO_OF_SEAT']")).sendKeys("20");
		// Thread.sleep(2000);

		bcl.findElement(By.xpath("//input[@id='P9_MILEAGE']")).sendKeys("13");

		bcl.findElement(By.xpath("//label[contains(text(),'New')]")).click();
		// Thread.sleep(2000);

//		DateFormat dateformat1 = new SimpleDateFormat("dd/MMM/yyyy");
//		String tt1 = dateformat1.format(new Date(0));
		Format formater = new SimpleDateFormat("dd/mm/yyyy");
		Date Odate = new Date();
		String tt1 = formater.format(Odate);

		bcl.findElement(By.xpath("//input[@id='P9_REGISTRATION_DATE']")).sendKeys("01/01/2019");
		// Thread.sleep(2000);

		bcl.findElement(By.xpath("//label[contains(text(),'Yes')]")).click();
		Thread.sleep(2000);

		bcl.findElement(By.xpath("//input[@id='P9_INS_COMP']")).sendKeys("Islami life insurence");
		Thread.sleep(2000);

		bcl.findElement(By.xpath("//input[@id='P9_INS_AMT']")).sendKeys("25000000");
		Thread.sleep(2000);

		DateFormat dateformat2 = new SimpleDateFormat("dd/mm/yyyy");
		String tt2 = dateformat2.format(new Date());
		bcl.findElement(By.xpath("//input[@id='P9_INS_START']")).sendKeys("01/01/2020");
		// Thread.sleep(2000);

		bcl.findElement(By.xpath("//input[@id='P9_INS_END']")).sendKeys("01/01/2050");
		// Thread.sleep(2000);

		bcl.findElement(By.xpath("//label[contains(text(),'Yes')]")).click();
		// Thread.sleep(2000);
		System.out.println("step:" + 3);

		JavascriptExecutor js = (JavascriptExecutor) bcl;
		js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
//		WebElement e = bcl.findElement(By.id("P9_VEHICLE_TYPE"));
//		((JavascriptExecutor) bcl).executeScript("arguments[0].click();", e);
		Thread.sleep(1000);
		bcl.findElement(By.xpath("//button[@id='btn']")).click();
		// Thread.sleep(2000);

		System.out.println("step:" + 4); // bcl.findElement(By.id("P9_VEHICLE_TYPE"

//		bcl.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
//        bcl.findElement(By.cssSelector("button[class='ui-button--hot']")).click();
		WebDriverWait wait1 = new WebDriverWait(bcl, 20);
		WebElement ele1 = wait1
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'OK')]")));
		ele1.click();
		Thread.sleep(5000);
		// testUsername.submit();
		// Thread.sleep(1000);
		System.out.println("step:" + 5);

		String str = bcl.findElement(By.xpath("//h2[contains(text(),'Successfully Inserted!')]")).getText();
		System.out.println(str);

		Select s6 = new Select(bcl.findElement(By.xpath("//select[@id='P5_DOC_TYPE']")));
		s6.selectByIndex(1);
		Thread.sleep(1000);

		WebElement UploadImg = bcl.findElement(By.xpath("//input[@id='P5_UPLOAD']"));
		UploadImg.sendKeys("C:\\download.jpg");// input[@id='P5_UPLOAD']
		Thread.sleep(1000);
		bcl.findElement(By.xpath("//button[@id='B99430595491927133']")).click();
		Thread.sleep(1000);
//===============================================================================	 
		bcl.findElement(By.cssSelector(".a-TreeView-toggle")).click(); // Transport
		Thread.sleep(1000);
		bcl.findElement(By.cssSelector("#t_TreeNav_2 > span")).click(); // Operation
		Thread.sleep(1000);
		bcl.findElement(By.xpath("//a[contains(text(),'Supplier Profile')]")).click();
		Thread.sleep(1000);
		bcl.findElement(By.xpath("//button[@id='B101980000430702920']")).click();
		Thread.sleep(1000);

			WebElement selectMyElement = bcl.findElement(By.cssSelector(".a-Button--popupLOV"));
		selectMyElement.click();
		bcl.findElement(By.xpath("//li[contains(text(),'Miscellaneous')]")).click();
		Thread.sleep(2000);//OR
/*		Actions a = new Actions(bcl);
		a.sendKeys(Keys.chord(Keys.DOWN, Keys.ENTER)).build().perform();
		Thread.sleep(2000);*/
	
		Select s8 = new Select(bcl.findElement(By.xpath("//select[@id='P15_SUPPLIER_TYPE']")));
		s8.selectByIndex(2);
		Thread.sleep(1000);
		bcl.findElement(By.xpath("//input[@id='P15_SUPPLIER_BUSINESS_NAME']")).sendKeys("AKIJ PUMP");
		Thread.sleep(1000);
		bcl.findElement(By.xpath("//input[@id='P15_PROPRIETOR_NAME']")).sendKeys("AKIJ");
		Thread.sleep(1000);
		Select s9 = new Select(bcl.findElement(By.xpath("//select[@id='P15_DISTRICT']")));
		s9.selectByIndex(35);
		Thread.sleep(1000);
		bcl.findElement(By.xpath("//input[@id='P15_VENDOR_ADDRESS']")).sendKeys("27/2.Tajga,dhak");
		Thread.sleep(1000);
		bcl.findElement(By.xpath("//input[@id='P15_VENDOR_PHONE']")).sendKeys("02956319");
		Thread.sleep(1000);
		bcl.findElement(By.xpath("//input[@id='P15_VENDOR_MOBILE']")).sendKeys("01700111222");
		Thread.sleep(1000);
		bcl.findElement(By.xpath("//input[@id='P15_VENDOR_EMAIL']")).sendKeys("bcl@gmail.com");
		Thread.sleep(1000);
		bcl.findElement(By.xpath("//input[@id='P15_VENDOR_CONTACT_PERSON']")).sendKeys("Mr.Akij");
		Thread.sleep(1000);
		bcl.findElement(By.xpath("//input[@id='P15_VENDOR_CONTACT_PERSON_DESIGNATION']")).sendKeys("Manager");
		Thread.sleep(1000);
		bcl.findElement(By.xpath("//input[@id='P15_TRADE_LICENCE']")).sendKeys("L_544Asd455");
		Thread.sleep(1000);
		bcl.findElement(By.xpath("//input[@id='P15_BIN_NUMBER']")).sendKeys("4652558");
		Thread.sleep(1000);
		bcl.findElement(By.xpath("//input[@id='P15_ACCOUNT_NUMBER']")).sendKeys("123466789");
		Thread.sleep(1000);
		Select s10 = new Select(bcl.findElement(By.xpath("//select[@id='P15_BANK_NAME']")));
		s10.selectByIndex(3);
		Thread.sleep(1000);
		bcl.findElement(By.xpath("//input[@id='P15_BRANCH_NAME']")).sendKeys("Motijeel");
		Thread.sleep(1000);
		WebElement el1 = bcl.findElement(By.xpath("//button[@id='B102756011628546762']"));
		((JavascriptExecutor) bcl).executeScript("arguments[0].click();", el1);
		Thread.sleep(1000);
		bcl.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
		Thread.sleep(1000);
		Select s11 = new Select(bcl.findElement(By.xpath("//select[@id='P5_DOC_TYPE']")));
		s11.selectByIndex(1);
		Thread.sleep(1000);
		WebElement upload = bcl.findElement(By.xpath("//input[@id='P5_UPLOAD']"));
		upload.sendKeys("C:\\download.jpg");
		Thread.sleep(1000);
		bcl.findElement(By.xpath("//button[@id='B99430595491927133']")).click();
		Thread.sleep(2000);
	}

}
