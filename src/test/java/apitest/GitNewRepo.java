package apitest;

import static io.restassured.RestAssured.given;

public class GitNewRepo {
    private  final String TOKEN="f403ef107385ec4a23d0859926cb16384059d8b5";
    private final String URL ="https://api.github.com/";
    public static void main(String[] args) {
        GitNewRepo gitNewRepo = new GitNewRepo();
        gitNewRepo.createNewRepo();
    }
            public void createNewRepo(){
            given()
                    .param("repository","Hello")
                    .header("Authorization","Bearer "+ TOKEN)
                    .when()
                    .post(URL +"user/repos")
                    .then().statusCode(200);

        }
}
