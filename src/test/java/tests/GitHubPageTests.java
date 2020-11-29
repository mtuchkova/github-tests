package tests;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import pages.*;

public class GitHubPageTests extends TestBase{
    HeaderTabs headerTabs = new HeaderTabs();
    NewRepository newRepository = new NewRepository();
    ImportRepository importRepository = new ImportRepository();
    NewGist newGist = new NewGist();
    NewOrganization newOrganization = new NewOrganization();
    NewProject newProject = new NewProject();


    @Test(priority = 1,groups = {"git_test"})
    public void newRepository() {
        elementsHelper.clickOnVisibleAndClickableElement(headerTabs.createNewMenuButton, 10);
        elementsHelper.clickOnVisibleAndClickableElement(newRepository.newrepositoryButton, 10);

        Assert.assertTrue(elementsHelper.isElementClickable(newRepository.ownerButton, 5), "ownerButton should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(newRepository.ownerButton, 1), "mtuchkova");

        Assert.assertTrue(elementsHelper.isElementClickable(newRepository.addGitignoreButton, 1), "addgitignoreButton should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(newRepository.addGitignoreButton, 1), "Add .gitignore: None");

        Assert.assertTrue(elementsHelper.isElementClickable(newRepository.addLicenseButton, 1), "addlicenseButton should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(newRepository.addLicenseButton, 1), "Add a license: None");

        Assert.assertTrue(elementsHelper.isElementClickable(newRepository.importRepositoryLink, 1), "importRepositoryLink should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(newRepository.importRepositoryLink, 1), "Import a repository.");
    }

    @Ignore
    @Test(priority = 2,groups = {"git_test"})
    public void importRepository() {
        elementsHelper.clickOnVisibleAndClickableElement(headerTabs.createNewMenuButton, 10);
        elementsHelper.clickOnVisibleAndClickableElement(importRepository.importRepositoryButton, 10);

        Assert.assertTrue(elementsHelper.isElementVisible(importRepository.cloneUrlField, 1), "cloneUrl Field is visible");
        Assert.assertTrue(elementsHelper.isElementClickable(importRepository.cancelButton, 1), "cancel button should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(importRepository.cancelButton, 1), "Cancel");

        Assert.assertTrue(elementsHelper.isElementClickable(importRepository.beginImportButton, 1), "Begin importButton is clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(importRepository.beginImportButton, 1), "Begin import");
    }
    @Test(priority = 3,groups = {"git_test"})
    public void newGist() {

        System.out.println("--------------------------------");
        elementsHelper.clickOnVisibleAndClickableElement(headerTabs.createNewMenuButton, 15);
        elementsHelper.clickOnVisibleAndClickableElement(newGist.newGistButton, 15);

        Assert.assertTrue(elementsHelper.isElementClickable(newGist.addFile, 5), "add file button should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(newGist.addFile, 1), "Add file");
        elementsHelper.clickOnVisibleAndClickableElement(newGist.backToGitHubButton,1);
    }
    @Test(priority = 4,groups = {"git_test"})
    public void newOrganization() {
        System.out.println("--------------------------------");
        elementsHelper.clickOnVisibleAndClickableElement(headerTabs.createNewMenuButton, 10);
        elementsHelper.clickOnVisibleAndClickableElement(newOrganization.newOrganizatoinButton, 10);

        Assert.assertTrue(elementsHelper.isElementClickable(newOrganization.blockFreeButton, 1), "Block free button shold be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(newOrganization.blockFreeButton, 1), "Join for free");

        Assert.assertTrue(elementsHelper.isElementClickable(newOrganization.blockTeamButton, 1), "Team button should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(newOrganization.blockTeamButton, 1), "Continue with Team");

        Assert.assertTrue(elementsHelper.isElementClickable(newOrganization.blockEnterpriseButton, 1), "Enterprise button should be clickable");
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(newOrganization.blockEnterpriseButton, 1), "Start Enterprise trial");
    }
   @Test(priority = 5,groups = {"git_test"})
    public void newProject() {
        elementsHelper.clickOnVisibleAndClickableElement(headerTabs.createNewMenuButton, 10);
        elementsHelper.clickOnVisibleAndClickableElement(newProject.newProjectButton, 10);

        Assert.assertTrue(elementsHelper.isElementPresent(newProject.projectBoardName, 10), "  Project board name should be presence");
        elementsHelper.textInputField(newProject.projectBoardName,5,"HardCore");

        Assert.assertTrue(elementsHelper.isElementClickable(newProject.createProjectButton,15));
        Assert.assertEquals(elementsHelper.getElementTextVisibilityOf(newProject.createProjectButton,1),"Create project");

    }
}











