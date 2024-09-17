/**
 * @author Zahir Ekrem SARITEKE
 * @project chain-of-responsibility-opdracht
 * @created 17 September Tuesday 2024 - 13:25
 */
class OrderHandler extends RequestHandler {

    @Override
    public boolean canHandleRequest(Request request) {
        return request.getRequestType() == RequestType.ORDER;
    }
    @Override
    public String name() {
        return "OrderHandler";
    }

    @Override
    public void handleRequest(Request request) {
        if (canHandleRequest(request)) {
            //Ik beheer het accountbeheer probleem
            System.out.printf("Van %s:  %s\n", name(), request.getRequestDescription());
        } else {
            if (nextHandler != null) {
                nextHandler.handleRequest(request);
            } else {
                System.out.println("Niks afgehandel in OrderHandler");
            }
        }
    }

}