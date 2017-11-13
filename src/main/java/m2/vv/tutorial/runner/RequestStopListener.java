package m2.vv.tutorial.runner;

import org.junit.runner.Description;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;
import org.junit.runner.notification.RunNotifier;

public class RequestStopListener extends RunListener {

    private int count;
    private RunNotifier notifier;


    public RequestStopListener(RunNotifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void testStarted(Description description) throws Exception {
        System.out.println(description.getDisplayName());
        count++;
    }

    @Override
    public void testFailure(Failure failure) throws Exception {
        notifier.pleaseStop();
    }

    public int getCount() { return count; }


}
