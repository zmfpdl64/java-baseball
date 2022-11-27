package baseball.model;

public class KeepGoing {
    private Boolean keepGoing = true;

    public Boolean getKeepGoing() {
        return this.keepGoing;
    }
    public void Stop() {
        this.keepGoing = false;
    }

}
