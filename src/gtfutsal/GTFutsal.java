/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gtfutsal;
import java.util.ArrayList;
import java.util.Calendar;
/**
 *
 * @author bacha
 */
public class GTFutsal {
    
    private final ArrayList<String> playerList;
    
    public GTFutsal(){
    
        playerList= new ArrayList();
        
    }
    
    public boolean addPlayer(String playerName){
        if(!playerName.equals("")){
            playerList.add(playerName);
            return true;
        }
        return false;
    }
    
    
    public String getDate(){
        Calendar c = Calendar.getInstance();
        return c.get(Calendar.YEAR)+"/"+c.get(Calendar.MONTH)+"/"+c.get(Calendar.DAY_OF_MONTH);
    }
    
    public ArrayList getPlayer(){
        return playerList;
    }
    
}
