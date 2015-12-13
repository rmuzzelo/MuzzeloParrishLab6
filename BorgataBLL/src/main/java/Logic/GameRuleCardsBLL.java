package Logic;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import base.GameRuleCardsDAL;
import domain.GameRuleCardsDomainModel; 





public class GameRuleCardsBLL {
	
	public static ArrayList<GameRuleCardsDomainModel> getRuleCards(int RuleID){
		ArrayList<GameRuleCardsDomainModel> grC = new ArrayList<GameRuleCardsDomainModel>();
		
		for (GameRuleCardsDomainModel grCards: GameRuleCardsDAL.getRuleCards())
		{
			if (grCards.getRULEID() == RuleID)
			{
				grC.add(grCards);
			}
		}
		
		return grC;

	}
	
	public static HashMap<String, GameRuleCardsDomainModel> getRuleCardsHashSet(int RuleID){
		HashMap<String, GameRuleCardsDomainModel> HashRuleCardsSet = new HashMap();
		
		for (GameRuleCardsDomainModel grCards: getRuleCards(RuleID))
		{
			String keyVal =  "" + grCards.getRULECARDID();
			
			HashRuleCardsSet.put(keyVal, grCards);
		}
		return HashRuleCardsSet;
		
	}
	
	public static ArrayList<Integer> getiCardsToDraw(int RuleID){
		ArrayList<Integer> iCardsToDraw = new ArrayList<Integer>();
		for (Map.Entry<String, GameRuleCardsDomainModel>  y: getRuleCardsHashSet(RuleID).entrySet()){
			int NumberCards = y.getValue().getNBROFCARDS();
			iCardsToDraw.add(NumberCards);
		}
		
		return iCardsToDraw;
	}
}
