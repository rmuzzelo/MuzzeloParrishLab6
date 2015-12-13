package pokerBase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import Logic.GameRuleCardsBLL;
import domain.DeckDomainModel;
import domain.GamePlayDomainModel;
import domain.GameRuleCardsDomainModel;
import domain.GameRuleDomainModel;
import domain.RuleDomainModel;

public class GamePlay extends GamePlayDomainModel {

	private ArrayList<Player> GamePlayers = new ArrayList<Player>();
	private ArrayList<GamePlayPlayerHand> GamePlayerHand = new ArrayList<GamePlayPlayerHand>();
	private ArrayList<GamePlayPlayerHand> GameCommonHand = new ArrayList<GamePlayPlayerHand>();
	//private Rule rle;
	private Deck GameDeck = null;
	private GameRuleDomainModel gr;
	
	public GamePlay(GameRuleDomainModel gr)
	{
		this.setGameID(gr.getRULEID());
		this.setNbrOfCards(gr.getPLAYERNUMBEROFCARDS());
		this.setMaxNbrOfPlayers(gr.getMAXNUMBEROFPLAYERS());
		this.setNbrOfJokers(gr.getNUMBEROFJOKERS());
		//this.setWildCards(rle.GetRuleCards());
		this.gr = gr;
	}

	public GameRuleDomainModel getGameRuleDomainModel()
	{
		return this.gr;
	}
	public ArrayList<Player> getGamePlayers() {
		return GamePlayers;
	}

	public void setGamePlayers(ArrayList<Player> gamePlayers) {
		GamePlayers = gamePlayers;
	}
	
	public void addPlayerToGame(Player p)
	{
		GamePlayers.add(p);
	}

	public Deck getGameDeck() {
		return GameDeck;
	}

	public void setGameDeck(Deck gameDeck) {
		GameDeck = gameDeck;
	}
	
	public void addGamePlayPlayerHand(GamePlayPlayerHand GPPH)
	{
		GamePlayerHand.add(GPPH);
	}
	
	public void addGamePlayCommonHand(GamePlayPlayerHand GPCH)
	{
		GameCommonHand.add(GPCH);
	}

	public GamePlayPlayerHand FindCommonHand(GamePlay gme)
	{
		GamePlayPlayerHand GPCH = null;
		for (GamePlayPlayerHand GPPH: GameCommonHand)
		{
			if (GPPH.getGame().getGameID() == gme.getGameID())
			{
				GPCH = GPPH;
			}
		}		
		return GPCH;
	}
	
	public GamePlayPlayerHand FindPlayerGame(GamePlay gme, Player p)
	{
		GamePlayPlayerHand GPPHReturn = null;
		
	
		for (GamePlayPlayerHand GPPH: GamePlayerHand)
		{
			if (p.getiPlayerPosition() == GPPH.getPlayer().getiPlayerPosition())
			{
				GPPHReturn = GPPH;
			}
		}
		return GPPHReturn;
	}
	
	public static ArrayList<Integer> getiCardsToDraw(GameRuleDomainModel gr){
		
		ArrayList<Integer> iCardsToDraw = GameRuleCardsBLL.getiCardsToDraw(gr.getRULEID());
		
		return iCardsToDraw;
	}

	
	
}
