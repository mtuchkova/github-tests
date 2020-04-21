import org.openqa.selenium.By;

public class NewOrganization {
    public By newOrganizatoinButton = By.cssSelector("[data-ga-click='Header, create new organization']");
    public By blockFreeButton = By.cssSelector("[data-ga-click='Organization plan pricing comparison,click,text:Join for free; meta: user_id: f7e83464b2232e2a2464c028c4185a02;']");
    public By blockTeamButton = By.cssSelector("[data-ga-click='Organization plan pricing comparison,click,text:continue with Team; meta: user_id: f7e83464b2232e2a2464c028c4185a02;']");
    public By blockEnterpriseButton = By.cssSelector("[data-ga-click='Organization plan pricing comparison,click,text:Start Enterprise trial; meta: user_id: f7e83464b2232e2a2464c028c4185a02;']");
}
