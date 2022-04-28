package karate;

import com.intuit.karate.junit5.Karate;

public class KarateTest {

	/*
	 * @Karate.Test Karate test() { return
	 * Karate.run("sample1").relativeTo(getClass()); }
	 */
	
	@Karate.Test
	Karate testOne() {
		return Karate.run("sample1").relativeTo(getClass());
	}
	
	@Karate.Test
	Karate testfullpath() {
		return Karate.run("classpath:karate/sample2.feature");
	}
}
