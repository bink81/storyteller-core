package com.marzeta.storyteller.stories;

import org.junit.Assert;
import org.junit.Test;

public class WarEndsTest {
	@Test
	public void testName() throws Exception {
		WarEnds story = new WarEnds();
		story.init();

		story.run();

		Assert.assertTrue(story.isFinished());
	}
}
