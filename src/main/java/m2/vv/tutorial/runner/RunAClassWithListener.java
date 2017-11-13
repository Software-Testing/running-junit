package m2.vv.tutorial.runner;

import org.junit.runner.*;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;
import org.junit.runner.notification.RunNotifier;

public class RunAClassWithListener {


    public static void main(String[] args) {
        JUnitCore core = new JUnitCore();

        core.addListener( new RunListener() {

            @Override
            public void testRunStarted(Description description) throws Exception {
                System.out.println("RUN STARTED");
            }

            @Override
            public void testStarted(Description description) throws Exception {
                System.out.println("TEST STARTED: " +  description.getDisplayName());
            }

            @Override
            public void testFailure(Failure failure) throws Exception {
                System.out.println("FAILURE: " + failure.getMessage());
            }

            @Override
            public void testIgnored(Description description) throws Exception {
                System.out.println("TEST IGNORED: " + description.getDisplayName());
            }

            @Override
            public void testFinished(Description description) throws Exception {
                System.out.println("TEST FINISHED: " + description.getDisplayName());
            }


            @Override
            public void testRunFinished(Result result) throws Exception {
                System.out.println("RUN FINISHED");
                System.out.println(String.format("| IGNORED: %d", result.getIgnoreCount()));
                System.out.println(String.format("| FAILURES: %d", result.getFailureCount()));
                System.out.println(String.format("| RUN: %d", result.getRunCount()));
            }

        } );

        core.run(InputTest.class, AnotherInputTest.class);
    }
}
