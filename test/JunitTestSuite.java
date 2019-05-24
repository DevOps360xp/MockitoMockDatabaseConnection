import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.javacodegeeks.simpleJUnit.JunitAnnotation;
import com.javacodegeeks.simpleJUnit.TestAssertions;
import com.javacodegeeks.simpleJUnit.TestJUnit;

@RunWith(Suite.class)

@Suite.SuiteClasses({ 	JunitAnnotation.class, 
						TestAssertions.class, 
						TestJUnit.class })

public class JunitTestSuite {
}
