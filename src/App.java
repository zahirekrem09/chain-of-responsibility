/**
 * @author Zahir Ekrem SARITEKE
 * @project Default (Template) Project
 * @created 17 September Tuesday 2024 - 13:09
 */
public class App {
    public static void main(String[] args) {
        RequestHandler loginHandler = new LoginHandler();
        RequestHandler accountHandler = new AccountHandler();
        RequestHandler orderHandler = new OrderHandler();
        loginHandler.setNextHandler(accountHandler);
        accountHandler.setNextHandler(orderHandler);

        Request request = new Request(RequestType.LOGIN, " Ik beheer het login probleem");
        loginHandler.handleRequest(request);

        request = new Request(RequestType.ACCOUNT, "Ik beheer het accountbeheer probleem");
        loginHandler.handleRequest(request);

        request = new Request(RequestType.ORDER, "Ik beheer het bestellings probleem");
        loginHandler.handleRequest(request);


    }
}