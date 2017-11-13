package m2.vv.tutorial.runner;

import org.junit.runner.*;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;
import org.junit.runner.notification.RunNotifier;
import org.junit.runner.notification.StoppedByUserException;

public class RunUntilFirstFailure {


    public static void main(String[] args) {

        Class<?>[] classes = { InputTest.class, AnotherInputTest.class };
        Request request = Request.classes(new Computer(), classes);
        Runner runner = request.getRunner();
        RunNotifier notifier = new RunNotifier();
        RequestStopListener listener = new RequestStopListener(notifier);

        try {

            notifier.addFirstListener(listener);
            runner.run(notifier);
        }
        catch(StoppedByUserException exc) {
            System.out.println("Process stopped");
        }
        System.out.print("Tests executed: ");
        System.out.println(listener.getCount());

    }

}
