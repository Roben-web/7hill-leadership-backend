import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        port(getHerokuAssignedPort());
        staticFiles.externalLocation("public");

        post("/register", (req, res) -> {
            String name = req.queryParams("name");
            String email = req.queryParams("email");
            String message = req.queryParams("message");

            System.out.println("New submission:");
            System.out.println("Name: " + name);
            System.out.println("Email: " + email);
            System.out.println("Message: " + message);

            res.type("text/html");
            return "<h2>Thank you, " + name + "!<br>We have received your message.</h2>";
        });
    }

    static int getHerokuAssignedPort() {
        String port = System.getenv("PORT");
        return (port != null) ? Integer.parseInt(port) : 4567;
    }
}
