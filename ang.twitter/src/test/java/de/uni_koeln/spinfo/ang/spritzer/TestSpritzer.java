package de.uni_koeln.spinfo.ang.spritzer;

import java.io.IOException;
import java.util.Properties;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestSpritzer {

	private static Spritzer sprit;

	@BeforeClass
	public static void init() {

		sprit = new Spritzer();

	}

	@Ignore
	@Test
	public void testListenStream() throws InterruptedException, IOException {

		Properties prop = sprit.getAccess();

		String consumerKey = prop.getProperty("consumerKey");
		String consumerSecret = prop.getProperty("consumerSecret");
		String token = prop.getProperty("token");
		String tokenSecret = prop.getProperty("tokenSecret");

		sprit.listenStream(consumerKey, consumerSecret, token, tokenSecret);

	}

}
