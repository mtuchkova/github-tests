package pages;

import org.openqa.selenium.By;

public class ImportRepository {
    public By importRepositoryButton = By.cssSelector("[data-ga-click='Header, import a repository']");
    public By cloneUrlField = By.cssSelector("[id='vcs_url']");
    public By cancelButton = By.cssSelector("[class='float-right btn btn-invisible']");
    public By beginImportButton = By.cssSelector("[class='btn btn-primary']");
}
