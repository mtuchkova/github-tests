import org.openqa.selenium.By;

public class NewOrganization {
    public By newOrganizatoinButton = By.cssSelector("[data-ga-click='Header, create new organization']");
    public By blockFreeButton = By.cssSelector("#js-pjax-container > div.p-responsive.mt-4.mt-md-8 > div:nth-child(2) > form > div > div > div > div:nth-child(1) > div.d-none.d-sm-block.height-full > div > div > label > div.d-flex.flex-column.flex-1.flex-justify-end.mb-2 > div.m-2 > button");
    public By blockTeamButton = By.cssSelector("#js-pjax-container > div.p-responsive.mt-4.mt-md-8 > div:nth-child(2) > form > div > div > div > div:nth-child(2) > div.d-none.d-sm-block.height-full > div > div > label > div.d-flex.flex-column.flex-1.flex-justify-end.mb-2 > div.m-2 > button");
    public By blockEnterpriseButton = By.cssSelector("#js-pjax-container > div.p-responsive.mt-4.mt-md-8 > div:nth-child(2) > form > div > div > div > div:nth-child(3) > div.d-none.d-sm-block.height-full > div > div > label > div.d-flex.flex-column.flex-1.flex-justify-end.mb-2 > div.m-2 > button");
}
