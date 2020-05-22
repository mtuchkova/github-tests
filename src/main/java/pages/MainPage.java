package pages;

import org.openqa.selenium.By;

public class MainPage {
    public By SignedInAsButton = By.cssSelector("[class='css-truncate-target']");
    public By OverviewButton = By.cssSelector("[class='UnderlineNav-item mr-0 mr-md-1 mr-lg-3 selected ']");
    public By RepositoriesButton = By.xpath("//a[contains(text(),'Repositories')]");
    public By ProjectsButton = By.xpath("//a[contains(text(),'Projects')]");
    public By StarsButton = By.xpath("//a[contains(text(),'Stars')]");
    public By FollowersButton = By.xpath("//a[contains(text(),'Followers')]");
    public By FollowingButton = By.xpath("//a[contains(text(),'Following')]");
    public By EditProfileButton = By.xpath("//div[@class='d-none d-md-block']//div[@class='hide-sm hide-md']");
    public By ShowMoreActivityButton = By.xpath("//button[contains(text(),'Show more activity')]");
}
