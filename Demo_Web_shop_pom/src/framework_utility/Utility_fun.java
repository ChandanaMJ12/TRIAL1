package framework_utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility_fun extends Browser_setup{
	public static String Test_configurtion(String key) throws IOException
	{String filepath="./Test_configuration/Config.properties";
	FileInputStream  fis=new FileInputStream(filepath);
	
	 Properties prop=new Properties();
	 prop.load(fis);
	 String value=prop.getProperty(key);
	 return value;
	 
	}
	
	public void clearTextField(WebElement textfield){
		textfield.clear();
	}
	
	public static void sendKeyss(WebDriver driver, Keys key){
		Actions action = new Actions(driver);
		action.sendKeys(key).build().perform();;
	}
	public static void enter_keys(WebElement ele,String value){
		ele.sendKeys(value);
	}
	public static void click_action(WebElement e)
	{
		e.click();
	}
	public static void select_by_index(WebElement element,int index){
		Select pos=new Select(element);
		pos.selectByIndex(index);
	}
	public static void select_by_value(WebElement element,String value){
		Select pos=new Select(element);
		pos.selectByValue(value);
	}
	public static void select_by_visibletext(WebElement element,String text){
		Select pos=new Select(element);
		pos.selectByVisibleText(text);
	}
	public static Object[][] Test_data(String sheet_name) throws IOException{
		String filepath="./Test_data/Data.xlsx";
		File file=new File(filepath);
		FileInputStream fis=new FileInputStream(file);
		Workbook book=new XSSFWorkbook(fis);
		Sheet sheet=book.getSheet(sheet_name);
		int cells = sheet.getRow(0).getPhysicalNumberOfCells();
		int rows = sheet.getPhysicalNumberOfRows();
		
		Object[][] data=new Object[rows-1][cells];
		for (int i = 1; i < rows; i++) {
			for (int j = 0; j <=cells-1; j++) {
				
				data[i-1][j]=sheet.getRow(i).getCell(j).getStringCellValue();
				
			}
		}
		return data;
	}
	}
	
	

