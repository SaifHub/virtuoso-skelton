package example.runner;

import example.belly.RunBellyTest;
import example.browser.BrowserTest;
import example.wikipedia.RunWikipediaTest;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runners.Suite;
import uk.gov.homeoffice.virtuoso.framework.runner.SuiteRunner;

import java.time.LocalDateTime;

@Suite.SuiteClasses({RunBellyTest.class, RunWikipediaTest.class})

public class RunCukeTests extends SuiteRunner{

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
