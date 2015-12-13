package domain;

import java.util.ArrayList;

import enums.eGame;
import enums.eRank;
import enums.eSuit;

public class RuleDomainModel {

	private int RuleID;
	private String RuleName; 
	private int MaxNumberOfPlayers;
	private int NumberOfCards;
	private int NumberOfJokers;
	private int CommunityCards;
	private int PlayerCardsMin;
	private int PlayerCardsMax;
	private int CommunityCardsMin;
	private int CommunityCardsMax;
	private int PossibleHandCombinations;
	private int[] iCardsToDraw;
	private ArrayList<CardDomainModel> RuleCards = new ArrayList<CardDomainModel>();
	private eGame Game;

	public RuleDomainModel(eGame gme) {
		switch (gme) {
		case FiveStud: {
			this.RuleID = 1;
			this.RuleName="FiveStud";
			this.MaxNumberOfPlayers = 4;
			this.NumberOfCards = 5;
			this.NumberOfJokers = 0;
			this.PlayerCardsMin = 5;
			this.PlayerCardsMax = 5;
			this.CommunityCardsMin = 0;
			this.CommunityCardsMax = 0;	
			this.PossibleHandCombinations = 1;
			int[] iCardsToDraw = {2,1,1,1};
			this.iCardsToDraw = iCardsToDraw;
			break;
		}
		case FiveStudOneJoker: {
			this.RuleID = 2;
			this.RuleName="FiveStudOneJoker";
			this.MaxNumberOfPlayers = 4;
			this.NumberOfCards = 5;
			this.NumberOfJokers = 1;
			this.PlayerCardsMin = 5;
			this.PlayerCardsMax = 5;			
			this.CommunityCardsMin = 0;
			this.CommunityCardsMax = 0;
			this.PossibleHandCombinations = 1;
			int[] iCardsToDraw = {2,1,1,1};
			this.iCardsToDraw = iCardsToDraw;
			break;
		}
		case FiveStudTwoJoker: {
			this.RuleID = 3;
			this.RuleName="FiveStudTwoJoker";
			this.MaxNumberOfPlayers = 4;
			this.NumberOfCards = 5;
			this.NumberOfJokers = 2;
			this.PlayerCardsMin = 5;
			this.PlayerCardsMax = 5;			
			this.CommunityCardsMin = 0;
			this.CommunityCardsMax = 0;
			this.PossibleHandCombinations = 1;
			int[] iCardsToDraw = {2,1,1,1};
			this.iCardsToDraw = iCardsToDraw;
			break;
		}
		case TexasHoldEm: {
			this.RuleID = 4;
			this.MaxNumberOfPlayers = 8;
			this.NumberOfCards = 2;
			this.NumberOfJokers = 0;
			this.PlayerCardsMin = 0;
			this.PlayerCardsMax = 2;			
			this.CommunityCardsMin = 3;
			this.CommunityCardsMax = 5;
			this.PossibleHandCombinations = 21;
			int[] iCardsToDraw = {2,3,1,1};
			this.iCardsToDraw = iCardsToDraw;	
			break;
		}
		case Omaha: {
			this.RuleID = 5;
			this.MaxNumberOfPlayers = 6;
			this.NumberOfCards = 4;
			this.NumberOfJokers = 0;
			this.PlayerCardsMin = 2;
			this.PlayerCardsMax = 2;			
			this.CommunityCardsMin = 3;
			this.CommunityCardsMax = 5;
			this.PossibleHandCombinations = 60;
			int[] iCardsToDraw = {2,2,3,1,1};
			this.iCardsToDraw = iCardsToDraw;	
			break;
		}
		case SuperOmaha: {
			this.RuleID = 6;
			this.MaxNumberOfPlayers = 6;
			this.NumberOfCards = 4;
			this.NumberOfJokers = 0;
			this.PlayerCardsMin = 0;
			this.PlayerCardsMax = 2;			
			this.CommunityCardsMin = 3;
			this.CommunityCardsMax = 5;
			this.PossibleHandCombinations = 81;
			int[] iCardsToDraw = {2,2,3,1,1};
			this.iCardsToDraw = iCardsToDraw;				
			break;
		}
		case SevenDraw: {
			this.RuleID = 7;
			this.MaxNumberOfPlayers = 4;
			this.NumberOfCards = 7;
			this.NumberOfJokers = 0;
			this.PlayerCardsMin = 5;
			this.PlayerCardsMax = 5;			
			this.CommunityCardsMin = 0;
			this.CommunityCardsMax = 0;
			this.PossibleHandCombinations = 21;
			int[] iCardsToDraw = {1,1,1,1,1,1,1};
			this.iCardsToDraw = iCardsToDraw;				
			break;
		}		
		case DeucesWild: {
			this.RuleID = 8;
			this.MaxNumberOfPlayers = 4;
			this.NumberOfCards = 5;
			this.NumberOfJokers = 0;
			this.RuleCards.add(new CardDomainModel(eSuit.DIAMONDS, eRank.TWO, 40));
			this.RuleCards.add(new CardDomainModel(eSuit.HEARTS, eRank.TWO, 1));
			this.RuleCards.add(new CardDomainModel(eSuit.SPADES, eRank.TWO, 14));
			this.RuleCards.add(new CardDomainModel(eSuit.CLUBS, eRank.TWO, 27));
			this.PlayerCardsMin = 5;
			this.PlayerCardsMax = 5;			
			this.CommunityCardsMin = 0;
			this.CommunityCardsMax = 0;
			this.PossibleHandCombinations = 1;
			int[] iCardsToDraw = {1,1,1,1,1};
			this.iCardsToDraw = iCardsToDraw;	
			break;
		}
		case AcesAndEights: {
			this.RuleID = 9;
			this.MaxNumberOfPlayers = 4;
			this.NumberOfCards = 2;
			this.NumberOfJokers = 0;
			this.RuleCards.add(new CardDomainModel(eSuit.DIAMONDS, eRank.ACE, 52));
			this.RuleCards.add(new CardDomainModel(eSuit.HEARTS, eRank.ACE, 13));
			this.RuleCards.add(new CardDomainModel(eSuit.SPADES, eRank.ACE, 26));
			this.RuleCards.add(new CardDomainModel(eSuit.CLUBS, eRank.ACE, 39));
			this.RuleCards.add(new CardDomainModel(eSuit.DIAMONDS, eRank.EIGHT, 46));
			this.RuleCards.add(new CardDomainModel(eSuit.HEARTS, eRank.EIGHT, 7));
			this.RuleCards.add(new CardDomainModel(eSuit.SPADES, eRank.EIGHT, 20));
			this.RuleCards.add(new CardDomainModel(eSuit.CLUBS, eRank.EIGHT, 33));
			this.PlayerCardsMin = 5;
			this.PlayerCardsMax = 5;			
			this.CommunityCardsMin = 0;
			this.CommunityCardsMax = 0;
			this.PossibleHandCombinations = 1;
			int[] iCardsToDraw = {1,1,1,1,1};
			this.iCardsToDraw = iCardsToDraw;	
			break;
		}
		}
	}

	public int GetMaxNumberOfPlayers() {
		return this.MaxNumberOfPlayers;
	}

	public int GetNumberOfCards() {
		return this.NumberOfCards;
	}

	public int GetNumberOfJokers() {
		return this.NumberOfJokers;
	}
	
	public int GetCommunityCardsCount()
	{
		return this.CommunityCards;
	}
	
	public ArrayList<CardDomainModel> GetRuleCards()
	{
		return this.RuleCards;
	}
}
