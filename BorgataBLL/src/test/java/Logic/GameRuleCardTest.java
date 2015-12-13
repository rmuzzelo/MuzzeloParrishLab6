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

import domain.GameRuleCardsDomainModel;
import Logic.GameRuleBLL;

public class GameRuleCardTest {

	private static ArrayList<GameRuleCardsDomainModel> grCards;
	
	@Test
	public void GetRules()
	{
		grCards = GameRuleCardsBLL.getRuleCards(1);
		
		assertTrue(grCards.size() > 0);
		
	}
	
}
