package chain_of_responsibility;

public class RaiseRequest {
    private double percentageRequest;

    public RaiseRequest(double percentage) {
        percentageRequest = percentage;
    }

    public double getPercentageRequest() {
        return this.percentageRequest;
    }

    public void setPercentageRequest(double percentageRequest) {
        this.percentageRequest = percentageRequest;
    }

}
