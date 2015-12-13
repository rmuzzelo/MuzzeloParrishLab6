package Logic;
import java.util.ArrayList;
import java.util.HashMap;

import base.GameRuleDAL;
import domain.GameRuleDomainModel; 





public class GameRuleBLL {
	
	public static ArrayList<GameRuleDomainModel> getRules(){
		return GameRuleDAL.getRules();	
	}
	
	public static HashMap<String,GameRuleDomainModel> getRuleHashMap(){
		HashMap<String,GameRuleDomainModel> HashRuleMap = new HashMap();
		for(GameRuleDomainModel gr: getRules()){
			HashRuleMap.put(gr.getRULENAME(), gr);
		}
		return HashRuleMap;
	}
}
