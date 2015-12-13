package Logic;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import domain.GameRuleDomainModel;
import Logic.GameRuleBLL;

public class GameRuleTest {

	private static ArrayList<GameRuleDomainModel> gr;
	
	
	@Test
	public void GetRules()
	{
		gr = GameRuleBLL.getRules();
		
		assertTrue(gr.size() > 0);
		
	}
	
}
