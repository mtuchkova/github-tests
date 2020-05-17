package tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HeaderTabs;

public class HeaderTabsTest extends TestBase {
    HeaderTabs headerTabs = new HeaderTabs();

    @Test(groups = {"git_test"})
    public void HeaderTabs() {
        Assert.assertTrue(elementsHelper.isElementClickable(headerTabs.headerTabPullRequests, 5), "pullRequestsButton should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(headerTabs.headerTabPullRequests, 1), "Pull requests");

        Assert.assertTrue(elementsHelper.isElementClickable(headerTabs.headerTabIssues, 1), "issuesYouCreatedButton should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(headerTabs.headerTabIssues, 1), "Issues");

        Assert.assertTrue(elementsHelper.isElementClickable(headerTabs.headerTabMarketplace, 1), " marketplaceButton should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(headerTabs.headerTabMarketplace, 1), "Marketplace");

        Assert.assertTrue(elementsHelper.isElementClickable(headerTabs.headerTabExplore, 1), "exploreButton should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(headerTabs.headerTabExplore, 1), "Explore");

        Assert.assertTrue(elementsHelper.isElementClickable(headerTabs.createNewMenuButton,1));
    }
}
