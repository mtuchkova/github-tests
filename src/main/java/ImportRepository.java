import org.openqa.selenium.By;

public class ImportRepository {
    public By importRepositoryButton = By.cssSelector("[data-ga-click='Header, import a repository']");
    public By cloneUrlField = By.cssSelector("#vcs_url");
    public By cancelButton = By.cssSelector("#new_repository > div.form-actions.border-top.pt-4 > a");
    public By beginImportButton = By.cssSelector("#new_repository > div.form-actions.border-top.pt-4 > button");

}
