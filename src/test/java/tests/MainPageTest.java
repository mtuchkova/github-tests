package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class MainPageTest extends TestBase{
    HeaderTabs headerTabs = new HeaderTabs();
    MainPage mainPage =new MainPage();

    @Test(groups = {"git_test"})
    public void MainPage() {
        elementsHelper.clickOnVisibleAndClickableElement(headerTabs.viewProfileAndMoreButton,10);
        elementsHelper.clickOnVisibleAndClickableElement(mainPage.SignedInAsButton,10);

        Assert.assertTrue(elementsHelper.isElementClickable(mainPage.OverviewButton,5));
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(mainPage.OverviewButton,5),"Overview");

        Assert.assertTrue(elementsHelper.isElementClickable(mainPage.RepositoriesButton,5));
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(mainPage.RepositoriesButton,5),"Repositories 3");

        Assert.assertTrue(elementsHelper.isElementClickable(mainPage.ProjectsButton,5));
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(mainPage.ProjectsButton,5),"Projects 0");

        Assert.assertTrue(elementsHelper.isElementClickable(mainPage.StarsButton,5));
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(mainPage.StarsButton,5),"Stars 0");

        Assert.assertTrue(elementsHelper.isElementClickable(mainPage.FollowersButton,5));
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(mainPage.FollowersButton,5),"Followers 0");

        Assert.assertTrue(elementsHelper.isElementClickable(mainPage.FollowingButton,5));
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(mainPage.FollowingButton,5),"Following 1");

        Assert.assertTrue(elementsHelper.isElementClickable(mainPage.EditProfileButton,5));
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(mainPage.EditProfileButton,5),"Edit profile");

        Assert.assertTrue(elementsHelper.isElementClickable(mainPage.ShowMoreActivityButton,5));
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(mainPage.ShowMoreActivityButton,5),"Show more activity");
    }
}
