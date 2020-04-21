import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;






public class FirstTest {


    WebDriver driver;
    ElementsHelper elementsHelper;
    LoginPage loginPage = new LoginPage();
    HeaderTabs headerTabs = new HeaderTabs();
    NewRepository newRepository = new NewRepository();
    ImportRepository importRepository = new ImportRepository();
    NewGists newGists = new NewGists();
    NewOrganization newOrganization = new NewOrganization();
    NewProject newProject = new NewProject();


    @Test(priority = 1)
    public void loginPage() {
        ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
        driver = new ChromeDriver();
        elementsHelper = new ElementsHelper(driver);
        driver.get("https://github.com/session");
        driver.manage().window().maximize();
        driver.findElement(loginPage.loginField).sendKeys("angelina.batayeva@gmail.com");
        driver.findElement(loginPage.passwordField).sendKeys("Angryowl19752606");
        driver.findElement(loginPage.signInButton).click();
    }

    @Test(priority = 2)
    public void headerTabs() {

        boolean pullRequestsButtonIsDisplayed = driver.findElement(headerTabs.headerTabPullRequests).isDisplayed();
        Assert.assertTrue(pullRequestsButtonIsDisplayed, "pullRequestsButton should be displayed");

        boolean issuesYouCreatedIsDisplayed = driver.findElement(headerTabs.headerTabIssues).isDisplayed();
        Assert.assertTrue(issuesYouCreatedIsDisplayed, "issuesYouCreatedButton should be displayed");

        boolean marketplaceButtonIsDisplayed = driver.findElement(headerTabs.headerTabMarketplace).isDisplayed();
        Assert.assertTrue(marketplaceButtonIsDisplayed, " marketplaceButton should be displayed");

        boolean exploreButtonIsDisplayed = driver.findElement(headerTabs.headerTabExplore).isDisplayed();
        Assert.assertTrue(exploreButtonIsDisplayed, "exploreButton should be displayed");

        boolean profileAndMoreMenuButtonIsDisplayed = driver.findElement(headerTabs.profileAndMoreMenuButton).isDisplayed();
        Assert.assertTrue(profileAndMoreMenuButtonIsDisplayed, "profileAndMoreMenuButton shold be displayed");
    }

    @Test(priority = 3)
    public void newRepository() {
        driver.findElement(headerTabs.profileAndMoreMenuButton).click();
        driver.findElement(newRepository.newrepositoryButton).click();
       // elementsHelper.isELementPresence(newRepository.addgitignoreButton,10);
       // Assert.assertTrue(elementsHelper.isElementClickable(loginPage.signOutButton, 5), "signOutButton should be clickable");
       // driver.findElement(loginPage.signOutButton).click();

        // boolean newRepositoryButtonIsDisplayed = driver.findElement(newRepository.newrepositoryButton).isDisplayed();
        //Assert.assertTrue(newRepositoryButtonIsDisplayed,"newReposButton should be displsyed");

        boolean ownerButtonIsDisplsyed = driver.findElement(newRepository.ownerButton).isDisplayed();
        Assert.assertTrue(ownerButtonIsDisplsyed, "ownerButton should be displayed");

        boolean addgitignoreButton = driver.findElement(newRepository.addgitignoreButton).isDisplayed();
        Assert.assertTrue(addgitignoreButton, "addgitignoreButton shold be displayed");

        boolean addlicenseButton = driver.findElement(newRepository.addlicenseButton).isDisplayed();
        Assert.assertTrue(addlicenseButton, "addlicenseButton should be displsyed");

        boolean importRepositoryLink = driver.findElement(newRepository.importRepositoryLink).isDisplayed();
        Assert.assertTrue(importRepositoryLink, "importRepositoryLink should be displayed");

    }

    @Test(priority = 4)
    public void importRepository() {
        boolean importRepositoryButton = driver.findElement(importRepository.importRepositoryButton).isDisplayed();
        Assert.assertFalse(importRepositoryButton, "importRepositoryButton should be displayed");

        boolean cloneUrlField = driver.findElement(importRepository.cloneUrlField).isDisplayed();
        Assert.assertTrue(cloneUrlField, "UrlField should be displayed");

        boolean cancelButton = driver.findElement(importRepository.cancelButton).isDisplayed();
        Assert.assertTrue(cancelButton, "Cancel button is displayed");

        boolean beginImportButton = driver.findElement(importRepository.beginImportButton).isDisplayed();
        Assert.assertTrue(beginImportButton, "beginImportButton is displayed");

    }

    @Test(priority = 5)
    public void newGists() {
        boolean newGistButton = driver.findElement(newGists.newGistButton).isDisplayed();
        Assert.assertTrue(newGistButton, "newGistButton should be displayed");

        boolean addFile = driver.findElement(newGists.addFile).isDisplayed();
        Assert.assertTrue(addFile, "addFileButton should be displayed");

    }

    @Test(priority = 6)
    public void newOrganization() {
        boolean newOrganizatoinButton = driver.findElement(newOrganization.newOrganizatoinButton).isDisplayed();
        Assert.assertTrue(newOrganizatoinButton, "newOrganizatoinButton shold be displayed");

        boolean blockFreeButton = driver.findElement(newOrganization.blockFreeButton).isDisplayed();
        Assert.assertTrue(blockFreeButton, "blockFreeButton should be displayed");

        boolean blockTeamButton = driver.findElement(newOrganization.blockTeamButton).isDisplayed();
        Assert.assertTrue(blockTeamButton, "blockTeamButton is should be displayed");

        boolean blockEnterpriseButton = driver.findElement(newOrganization.blockEnterpriseButton).isDisplayed();
        Assert.assertTrue(blockEnterpriseButton, "blockEnterpriseButton should be displayed");

    }

    @Test(priority = 7)
    public void newProject() {
        boolean newProjectButton = driver.findElement(newProject.newProjectButton).isDisplayed();
        Assert.assertTrue(newProjectButton, "newProjectButton shold be displayed");

        boolean templateButton = driver.findElement(newProject.templateButton).isDisplayed();
        Assert.assertTrue(templateButton, "templateButton is should be displayed");
    }

    @Test(priority = 8)
    public void signOut() {
        Assert.assertTrue(elementsHelper.isElementVisible(headerTabs.profileAndMoreMenuButton, 5), "profileAndMoreMenuButton should be visible");
        driver.findElement(headerTabs.profileAndMoreMenuButton).click();
        Assert.assertTrue(elementsHelper.isElementClickable(loginPage.signOutButton, 5), "signOutButton should be clickable");
        driver.findElement(loginPage.signOutButton).click();


    }


}









