package pages;

import org.openqa.selenium.By;

public class NewRepository {
        public By newrepositoryButton = By.cssSelector("[data-ga-click='Header, create new repository']");
        public By ownerButton = By.cssSelector("[id='repository-owner']");
        public By addGitignoreButton = By.cssSelector("[class='details-reset details-overlay select-menu']");
        public By addLicenseButton = By.cssSelector("[class='details-reset details-overlay d-inline-block']");
        public By importRepositoryLink = By.cssSelector("[data-ga-click='Create Repository, import repository, location:repo new']");
    }
