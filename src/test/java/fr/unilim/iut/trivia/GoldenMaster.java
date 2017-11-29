package fr.unilim.iut.trivia;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;

import org.apache.commons.io.FileUtils;

import fr.unilim.iut.games.trivia.runner.GameRunner;

public class GoldenMaster{
	public String getGameResult(long seed){
		ByteArrayOutputStream consoleStream=new ByteArrayOutputStream();
		PrintStream printStream = new PrintStream(consoleStream);
		System.setOut(printStream);
		GameRunner.play(new Random(seed));
		return consoleStream.toString();
	}
	
	public void generateGoldenMaster() throws IOException{
		for(long seed=0;seed<1000;seed++){
			FileUtils.writeStringToFile(new File("goldenMasterData/"+seed+".txt"), getGameResult(0),"UTF-8");
		}
	}
	
	public String getGoldenMaster(long seed) throws IOException{
		return this.getGameResult(seed);
	} 
	
}
