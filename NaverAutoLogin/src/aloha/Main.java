package aloha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
	public static WebDriver driver = new ChromeDriver();
	
    public static void main(String[] args) {

        // www.naver.com으로 이동합니다.
        driver.get("http://www.naver.com");

        // Selenium WebDriver JAR 파일을 클래스패스에 추가하는 방법:
        // 1. Selenium WebDriver 사이트에서 `selenium-java` JAR 파일을 다운로드합니다.
        // 2. 다운로드한 JAR 파일을 프로젝트의 `lib` 폴더에 복사합니다.
        // 3. 클래스패스에 JAR 파일을 추가합니다.
    }
}
