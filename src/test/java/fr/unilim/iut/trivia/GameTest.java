package fr.unilim.iut.trivia;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;

public class GameTest {
	@Test
	public void test_checkTriviaAgainstGoldenMaster()throws IOException{
		GoldenMaster goldenMaster=new GoldenMaster();
		for(int seed=0;seed<1000;seed++){
			String expected=goldenMaster.getGoldenMaster(seed);
			String actual=goldenMaster.getGameResult(seed);
			assertEquals(expected,actual);
		}
	} 
}
