package class23;

public interface Hw2WebDriver {
    /*Create a WebDriver Interface that will have the following
     unimplemented behaviour: openBrowser(), closeBrowser(), maximizeWindow(),
      findElement(). Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
     */
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}

class ChromeDriver implements Hw2WebDriver {

    @Override
    public void openBrowser() {
        System.out.println("open the chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("close the chrome");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("maximize the window through the chrome");
    }

    @Override
    public void findElement() {
        System.out.println("find elements through the chrome");
    }
}
class FirefoxDriver implements Hw2WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("open the firefox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("close the firefox");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("maximize the window through the firefox");
    }

    @Override
    public void findElement() {
        System.out.println("find elements through the firefox");
    }
}
class WebDriverTester{
    public static void main(String[] args) {
        Hw2WebDriver webDriver=new ChromeDriver();
        webDriver.openBrowser();
        webDriver.closeBrowser();
        webDriver.maximizeWindow();
        webDriver.findElement();
       Hw2WebDriver webDriver1=new FirefoxDriver();
       webDriver1.openBrowser();
       webDriver1.closeBrowser();
       webDriver1.maximizeWindow();
       webDriver1.closeBrowser();
    }
}