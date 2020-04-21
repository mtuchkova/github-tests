import org.openqa.selenium.By;

public class ImportRepository {
    public By importRepositoryButton = By.cssSelector("[data-ga-click='Header, import a repository']");
    public By cloneUrlField = By.cssSelector("[aria-describedby='repo-url-warning repo-url-error']");
    public By cancelButton = By.cssSelector("[class='float-right btn btn-invisible']");
    public By beginImportButton = By.cssSelector("[class='btn btn-primary'][data-disable-with='Preparing import…']");

}
