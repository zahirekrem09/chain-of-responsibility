/**
 * @author Zahir Ekrem SARITEKE
 * @project chain-of-responsibility-opdracht
 * @created 17 September Tuesday 2024 - 13:12
 */
abstract class RequestHandler {
    protected RequestHandler nextHandler;

    public void setNextHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(Request request);

    public abstract boolean canHandleRequest(Request request);
    public abstract String name();
}
