package chain_of_responsibility;

public class ManagerRaiseRequest extends RaiseHandler{
    private final double allowedRaisePercentage = 5;

    public void handleRaise(RaiseRequest request) {
        if (request.getPercentageRequest() <= allowedRaisePercentage) {
            System.out.println(request.getPercentageRequest() + "% raise approved.");
        } else {
            super.handleRaise(request);
        }
    }
}
