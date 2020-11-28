package pages;

import org.openqa.selenium.By;

public class HeaderTabs {
    public By headerTabPullRequests = By.cssSelector("[aria-label='Pull requests you created']");
    public By headerTabIssues = By.cssSelector("[aria-label='Issues you created']");
    public By headerTabMarketplace = By.cssSelector("[aria-label='Global'] [href='/marketplace']");
    public By headerTabExplore = By.cssSelector("[aria-label='Global'] [href='/explore']");
    public By createNewMenuButton = By.cssSelector("[data-ga-click='Header, create new, icon:add']");
    public By viewProfileAndMoreButton = By.cssSelector("[data-ga-click='Header, show menu, icon:avatar']");
}
