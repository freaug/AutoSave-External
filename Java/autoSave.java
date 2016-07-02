import com.cycling74.max.*;

public class autoSave extends MaxObject
{
	//declaring vars, clock, patcher, and seconds counter
	MaxClock c1;
	MaxPatcher p;
	int count = 0;

	//Method that's called on creation
	public autoSave(Atom[] args){
	
		//Debugging
		post("Initialized");
		//Call a clock
		c1 = new MaxClock(this,"startOnLoad");
		//start clock
		c1.tick();
		//get patcher name
		p = this.getParentPatcher();
		//initial save, called when the template is loaded
		p.send("write", null);
	}
	//method that clock calls, starts when patch is loaded
	public void startOnLoad(){
		//add one second
		count++;
		//wait one second 	
		c1.delay(1000.0);
		//uncomment for debugging
		//post(count + "  seconds has passed");
		
		//if it's been 5 minutes then save the file
		if(count >= 180){
			//tell the patcher to save
			p.send("write",null);
			//reset second count to zero
			count = 0;
			//uncomment for debugging	
			//post("project saved");
		}
	}
	//method to clear memory
	public void notifyDeleted(){
		//releases memory that clock was using	
		c1.release();
	}
    
}





