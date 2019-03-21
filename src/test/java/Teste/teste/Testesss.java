package Teste.teste;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Testesss {
	
	@Test
	public void LaunchChrome_Method2() throws InterruptedException {		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		options.addArguments("--start-maximized");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://portalrh.cservices.com.br/PortalConductor/Produtos/SAAA/Principal2.aspx?amb_selecionado=7&abrir_nova_janela=N&eh_mdesigner=N&nome_portal=4A4C6D6A4D37336B6D584B2F79517A5A4F52336E65697A43675839535A316764");
	
		
		driver.findElement(By.id("txtLogin")).sendKeys("37520451836");
		driver.findElement(By.id("txtSenha")).sendKeys("carlos363");
		driver.findElement(By.name("btnEntrar")).click();
		Thread.sleep(500);
		driver.findElement(By.id("SSMdivexterna")).click();
		Thread.sleep(600);
		driver.findElement(By.cssSelector("#SSMdivareaobjeto > div:nth-child(5)")).click();
		Thread.sleep(600);
		driver.findElement(By.cssSelector("#SSMdivareaobjeto > div")).click();
		Thread.sleep(600);
		String currentHandle = driver.getWindowHandle();
		driver.findElement(By.cssSelector("#SSMdivareaobjeto > div:nth-child(1) > span")).click();
		Thread.sleep(800);
		Set<String> handles= driver.getWindowHandles();//Return a set of window handle
		System.out.println("janelas" + handles);
		Iterator<String> iterator = handles.iterator(); 
		while(iterator.hasNext())
		{
		    String handle = iterator.next();
		    if(!handle.equals(currentHandle))
		    {
		    driver.switchTo().window(handle);
		    }
		}
		// fechar
//		driver.findElement(By.id("Button2")).click();
		//ok
//		driver.findElement(By.id("Button1")).click();
		
		driver.quit();
	}

}
