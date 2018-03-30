import java.util.Date;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
    }

    public void start() {
        this.startTime = new Date().getTime();
    }

    public void stop() {
        this.endTime = new Date().getTime();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }

}