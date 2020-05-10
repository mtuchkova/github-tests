package pages;

import org.openqa.selenium.By;

public class NewProject {
    public By newProjectButton = By.cssSelector("[data-ga-click='Header, create new project']");
    public By projectBoardName = By.cssSelector("[class='form-control form-control js-quick-submit required']");
    public By createProjectButton = By.cssSelector("[class='btn btn-primary flex-auto float-none float-md-left']");
}

