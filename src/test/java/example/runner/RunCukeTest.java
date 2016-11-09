package example.runner;

import example.belly.RunBelly;
import example.homeoffice.copy.RunHomeoffice;
import example.wikipedia.RunWikipedia;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runners.Suite;
import uk.gov.homeoffice.virtuoso.framework.runner.SuiteRunner;

import java.time.LocalDateTime;

@Suite.SuiteClasses({RunBelly.class, RunHomeoffice.class,RunWikipedia.class})

public class RunCukeTest extends SuiteRunner{

    @BeforeClass
    public final static void setup() {
                registerRunID("Running example tests");
        System.out.println(LocalDateTime.now() + ": Testing starting");
    }

    @AfterClass
    public final static void tearDown() {
        System.out.println(LocalDateTime.now() + ": Testing completed");
    }
}
