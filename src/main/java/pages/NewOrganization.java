import org.openqa.selenium.By;

public class NewOrganization {
    public By newOrganizatoinButton = By.cssSelector("[data-ga-click='Header, create new organization']");
    public By blockFreeButton = By.xpath("//div[@class='m-2']//button[@name='plan'][contains(text(),'Join for free')]");
    public By blockTeamButton = By.cssSelector("//div[@class='m-2']//button[@name='plan'][contains(text(),'Continue with Team')]");
    public By blockEnterpriseButton = By.cssSelector("");
}
