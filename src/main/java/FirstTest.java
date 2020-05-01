import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;






public class FirstTest {


    WebDriver driver;
    ElementsHelper elementsHelper;
   // elementsHelper = new ElementsHelper(driver);
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
        driver.get("https://github.com/session");
        driver.manage().window().maximize();
       // Assert.assertTrue(elementsHelper.isElementPresence(loginPage.loginField,10),"Login field should be presence");
        driver.findElement(loginPage.loginField).sendKeys("angelina.batayeva@gmail.com");
        driver.findElement(loginPage.passwordField).sendKeys("Angryowl19752606");
       // elementsHelper.clickOnVisibleAndClickableElement(loginPage.signInButton,25);
    }

    @Test(priority = 2)
    public void headerTabs() {

        Assert.assertTrue(elementsHelper.isElementClickable(headerTabs.headerTabPullRequests, 5), "pullRequestsButton should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(headerTabs.headerTabPullRequests,1),"Pull requests");

        Assert.assertTrue(elementsHelper.isElementClickable(headerTabs.headerTabIssues,1), "issuesYouCreatedButton should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(headerTabs.headerTabIssues,1),"Issues");

        Assert.assertTrue(elementsHelper.isElementClickable(headerTabs.headerTabMarketplace,1), " marketplaceButton should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(headerTabs.headerTabMarketplace,1),"Marketplace");

        Assert.assertTrue(elementsHelper.isElementClickable(headerTabs.headerTabExplore,1), "exploreButton should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(headerTabs.headerTabExplore,1),"Explore");
    }


    @Test(priority = 3)
    public void newRepository() {
        elementsHelper.clickOnVisibleAndClickableElement(headerTabs.CreateNewMenuButton,10);
        elementsHelper.clickOnVisibleAndClickableElement(newRepository.newrepositoryButton,10);


        Assert.assertTrue(elementsHelper.isElementClickable(newRepository.ownerButton,5),"ownerButton shold be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(newRepository.ownerButton,1),"owner");


        Assert.assertTrue(elementsHelper.isElementClickable(newRepository.addgitignoreButton,1),"addgitignoreButton should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(newRepository.addgitignoreButton,1),"addgitignore");

        Assert.assertTrue(elementsHelper.isElementClickable(newRepository.addlicenseButton,1),"addlicenseButton should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(newRepository.addlicenseButton,1),"addlicense");

        Assert.assertTrue(elementsHelper.isElementClickable(newRepository.importRepositoryLink,1),"importRepositoryLink should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(newRepository.importRepositoryLink,1),"import a repository");

    }

    @Test(priority = 4)
    public void importRepository() {
        elementsHelper.clickOnVisibleAndClickableElement(headerTabs.CreateNewMenuButton,10);
        elementsHelper.clickOnVisibleAndClickableElement(importRepository.importRepositoryButton,10);


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


   // @Test(priority = 8)
    //public void signOut() {
     //   Assert.assertTrue(elementsHelper.isElementVisible(headerTabs.CreateNewMenuButton, 10), "CreateNewMenuButton should be visible");
     //   driver.findElement(headerTabs.CreateNewMenuButton).click();
     //   Assert.assertTrue(elementsHelper.isElementClickable(loginPage.signOutButton, 10), "signOutButton should be clickable");
      //  driver.findElement(loginPage.signOutButton).click();


  //  }


}









