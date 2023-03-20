package chain_of_responsibility;

public abstract class RaiseHandler {
    
    private RaiseHandler successor;

    public void setSuccessor(RaiseHandler s) {
        successor = s;
    }

    public void handleRaise(RaiseRequest request) {
        if (successor != null) {
            successor.handleRaise(request);
        }
    }
}
