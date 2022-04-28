package karate;

import com.intuit.karate.junit5.Karate;

public class KarateRunner {

	@Karate.Test
	Karate hellotest() {
		return Karate.run("user").relativeTo(getClass());
	}
}
