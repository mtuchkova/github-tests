package apitest;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class GitHubApi {
    private  final String TOKEN="f403ef107385ec4a23d0859926cb16384059d8b5";
    private final String URL ="https://api.github.com/";
    public static void main(String[] args){
        GitHubApi gitHubApi = new GitHubApi();
        gitHubApi.getRepos();
        gitHubApi.createNewRepo();
    }
    public void getRepos(){
        given()
                .header("Authorization","Bearer "+ TOKEN)
                .when()
                .get(URL +"user/repos")
                .then().log().all()
                .log().cookies()
                .statusCode(200);
    }
    public void createNewRepo() {
        given().header("Authorization", "Bearer " + TOKEN)
                .contentType(ContentType.JSON)
                .body(
                        "{\n" +
                                "  \"name\": \"Tests\",\n" +
                                "  \"description\": \"This is your first repository\",\n" +
                                "  \"homepage\": \"https://github.com\",\n" +
                                "  \"private\": false,\n" +
                                "  \"has_issues\": true,\n" +
                                "  \"has_projects\": true,\n" +
                                "  \"has_wiki\": true\n" +
                                "}"
                )
                .when()
                .post(URL + "user/repos")
                .then().log().all()
                .log().cookies()
                .statusCode(201);
    }
}