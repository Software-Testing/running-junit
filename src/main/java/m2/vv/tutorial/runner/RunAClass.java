package m2.vv.tutorial.runner;


import org.junit.runner.*;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

public class RunAClass {


    public static void main(String[] args) {

        JUnitCore core = new JUnitCore();
        Result result = core.run(InputTest.class, AnotherInputTest.class);
        System.out.println("FINISHED");
        System.out.println(String.format("| IGNORED: %d", result.getIgnoreCount()));
        System.out.println(String.format("| FAILURES: %d", result.getFailureCount()));
        System.out.println(String.format("| RUN: %d", result.getRunCount()));

    }

}