package practice;

public class TV {
	  int channel=1, volumeLevel=1;
	    String brand="undefined";
	    boolean on=false;
	    
	    
	    public TV(){
	      System.out.println("Creating TV object using no Args- constructor");
	    }
	    public TV(String brand){
	      this.brand=brand;
	      System.out.println("Creating TV object using 1 arg - constructor");
	    }
	    
	    public void setVolumeLevel(int volumeLevel){
	      if (volumeLevel>=1 && volumeLevel<=7 && on==true){
	    this.volumeLevel=volumeLevel;
	      }
	      else{
	        System.out.println("ERROR: TV is either OFF or invalid Volume level"); 
	      }
	    }
	    public int getVolumeLevel(){
	    return volumeLevel;
	    }
	    public void setChannel(int channel){
	      if (channel>0 && channel<=120){
	    this.channel=channel;
	      }
	      else{
	        System.out.println("ERROR: TV is either OFF or invalid Channel");
	      }
	    }
	    public int getChannel(){
	    return channel;
	    }
	    public void setBrand(String brand){
	    this.brand=brand;
	    }
	    public String getBrand(){
	    return brand;
	    }
	  
	    public void channelUp(){
	      channel++;
	    }
	    public void channelDown(){
	      channel--;
	    }
	    public void volumeUp(){
	      volumeLevel++;
	    }
	    public void volumeDown(){
	      volumeLevel--;
	    }
	    
	    public void isOn(){
	      on=true;
	    }
	    public void turnOn(){
	      if (on){
	        System.out.println("TV is already ON");
	      }
	      else{
	        on=true;
	      }
	    }
	    public void turnOff(){
	       if (on==false){
	        System.out.println("TV is already OFF");
	      }
	      else{
	        on=false;
	      }
	    }
	    }
	    
