package chain_of_responsibility;

public class CEORaiseRequest extends RaiseHandler{
    private final double allowedRaisePercentage = 5;

    @Override
    public void handleRaise(RaiseRequest request) {
        if (request.getPercentageRequest() <= allowedRaisePercentage) {
            System.out.println(request.getPercentageRequest() + "% raise approved.");
        } else {
            super.handleRaise(request);
        }
    }
}