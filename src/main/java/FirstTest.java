import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;






public class FirstTest extends TestBase{



    LoginPage loginPage = new LoginPage();
    HeaderTabs headerTabs = new HeaderTabs();
    NewRepository newRepository = new NewRepository();
    // ImportRepository importRepository = new ImportRepository();
    // NewGists newGists = new NewGists();
    //  NewOrganization newOrganization = new NewOrganization();
    //NewProject newProject = new NewProject();


    @Test(priority = 1)
    public void loginPage() {

        Assert.assertTrue(elementsHelper.isElementPresence(loginPage.loginField, 10), "Login field should be presence");
        driver.findElement(loginPage.loginField).sendKeys("angelina.batayeva@gmail.com");
        driver.findElement(loginPage.passwordField).sendKeys("Angryowl19752606");
        elementsHelper.clickOnVisibleAndClickableElement(loginPage.signInButton, 5);
    }

    @Test(priority = 2)
    public void headerTabs() {

        Assert.assertTrue(elementsHelper.isElementClickable(headerTabs.headerTabPullRequests, 5), "pullRequestsButton should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(headerTabs.headerTabPullRequests, 1), "Pull requests");

        Assert.assertTrue(elementsHelper.isElementClickable(headerTabs.headerTabIssues, 1), "issuesYouCreatedButton should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(headerTabs.headerTabIssues, 1), "Issues");

        Assert.assertTrue(elementsHelper.isElementClickable(headerTabs.headerTabMarketplace, 1), " marketplaceButton should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(headerTabs.headerTabMarketplace, 1), "Marketplace");

        Assert.assertTrue(elementsHelper.isElementClickable(headerTabs.headerTabExplore, 1), "exploreButton should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(headerTabs.headerTabExplore, 1), "Explore");
    }


    @Test(priority = 3)
    public void newRepository() {
        elementsHelper.clickOnVisibleAndClickableElement(headerTabs.CreateNewMenuButton, 10);
        elementsHelper.clickOnVisibleAndClickableElement(newRepository.newrepositoryButton, 10);


        Assert.assertTrue(elementsHelper.isElementClickable(newRepository.ownerButton, 5), "ownerButton shold be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(newRepository.ownerButton, 1), "Owner angelinaaa");


        Assert.assertTrue(elementsHelper.isElementClickable(newRepository.addgitignoreButton, 1), "addgitignoreButton should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(newRepository.addgitignoreButton, 1), "addgitignore");

        Assert.assertTrue(elementsHelper.isElementClickable(newRepository.addlicenseButton, 1), "addlicenseButton should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(newRepository.addlicenseButton, 1), "addlicense");

        Assert.assertTrue(elementsHelper.isElementClickable(newRepository.importRepositoryLink, 1), "importRepositoryLink should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(newRepository.importRepositoryLink, 1), "import a repository");

    }
}

   /* @Test(priority = 4)
    public void importRepository() {
        elementsHelper.clickOnVisibleAndClickableElement(headerTabs.CreateNewMenuButton,10);
        elementsHelper.clickOnVisibleAndClickableElement(importRepository.importRepositoryButton,10);

        Assert.assertTrue(elementsHelper.isElementVisible(importRepository.cloneUrlField,1),"cloneUrl Field is visible");

        Assert.assertTrue(elementsHelper.isElementClickable(importRepository.cancelButton,1),"cancel button should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(importRepository.cancelButton,1),"cancel");

        Assert.assertTrue(elementsHelper.isElementClickable(importRepository.beginImportButton,1),"Begim importButton is clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(importRepository.beginImportButton,1),"begin import");
    }

    @Test(priority = 5)
    public void newGists() {
        elementsHelper.clickOnVisibleAndClickableElement(headerTabs.CreateNewMenuButton,10);
        elementsHelper.clickOnVisibleAndClickableElement(newGists.newGistButton,1);

        Assert.assertTrue(elementsHelper.isElementClickable(newGists.addFile,1),"add file button should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(newGists.addFile,1),"add file");

    }

    @Test(priority = 6)
    public void newOrganization() {
        elementsHelper.clickOnVisibleAndClickableElement(headerTabs.CreateNewMenuButton,10);
        elementsHelper.clickOnVisibleAndClickableElement(newOrganization.newOrganizatoinButton,10);

         Assert.assertTrue(elementsHelper.isElementClickable(newOrganization.blockFreeButton,1),"Block free button shold be clickable");
         Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(newOrganization.blockFreeButton,1),"Join for free");

         Assert.assertTrue(elementsHelper.isElementClickable(newOrganization.blockTeamButton,1),"Team button should be clickable");
         Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(newOrganization.blockTeamButton,1),"Countinue with team");

         Assert.assertTrue(elementsHelper.isElementClickable(newOrganization.blockEnterpriseButton,1),"Enterprise button should be clickable");
         Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(newOrganization.blockEnterpriseButton,1),"Start enterprise trial");


    }

    @Test(priority = 7)
    public void newProject() {
        elementsHelper.clickOnVisibleAndClickableElement(headerTabs.CreateNewMenuButton, 10);
        elementsHelper.clickOnVisibleAndClickableElement(newProject.newProjectButton, 10);

        Assert.assertTrue(elementsHelper.isElementClickable(newProject.templateButton, 1), "template button should be displsyed");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(newProject.templateButton, 1), "Template None");


    }

}

 */









