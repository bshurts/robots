/*
Copyright 2013 (c) Illinois Tech Robotics <robotics.iit@gmail.com>

Permission is hereby granted, free of charge, to any person obtaining
a copy of this software and associated documentation files (the
"Software"), to deal in the Software without restriction, including
without limitation the rights to use, copy, modify, merge, publish,
distribute, sublicense, and/or sell copies of the Software, and to
permit persons to whom the Software is furnished to do so, subject to
the following conditions:

The above copyright notice and this permission notice shall be
included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
*/
package robots;

import common.Communication;
import common.Event;
import common.EventEnum;
import common.Queue;
import common.Robot;

public class Reaper extends Robot{

    public enum Buttons {
            LEFT, DOWN, RIGHT, UP, L1, R1, L2, R2, SELECT, START, LEFTCLICK, RIGHTCLICK
        }

	public Reaper(Queue q, Communication c){
		super(q,c);
	}
	
	public void on_failsafe(Event ev){
		
	}

	public void on_command_code(Event ev){
		
	}
	
	public void on_heartbeat(Event ev) {
		
	}
	
	public void on_status(Event ev){
		
	}
	
	public void on_axis_change(Event ev){
		//dividing by two gives full range for victors
		if(ev.getIndex()==1){
			int temp = (ev.getValue()-127)/4+127;
			comm.sendEvent(new Event(EventEnum.ROBOT_EVENT_JOY_AXIS,(short)1,temp));
		}
		if(ev.getIndex()==2){
			int temp = ((ev.getValue() - 127)*(-1)/8)+127;
			comm.sendEvent(new Event(EventEnum.ROBOT_EVENT_JOY_AXIS,(short)2,temp));
		}
		
	}
	
	public void on_button_down(Event ev){
        
	    switch(ev.getIndex()){
           // case 0://left
           //     comm.sendEvent(new Event(EventEnum.ROBOT_EVENT_CMD_FAILSAFE,(short)0,0));
           //     break;
           // case 1://down
           //     comm.sendEvent(new Event(EventEnum.ROBOT_EVENT_CMD_FAILSAFE,(short)0,0));
           //     break;
           // case 2://right
           //     comm.sendEvent(new Event(EventEnum.ROBOT_EVENT_CMD_FAILSAFE,(short)0,0));
           //     break;
           // case 3://up
           //     comm.sendEvent(new Event(EventEnum.ROBOT_EVENT_CMD_FAILSAFE,(short)0,0));
           //     break;
           // case 4://l1
           //     comm.sendEvent(new Event(EventEnum.ROBOT_EVENT_CMD_FAILSAFE,(short)0,0));
           //     break;
           // case 5://r1
           //     comm.sendEvent(new Event(EventEnum.ROBOT_EVENT_CMD_FAILSAFE,(short)0,0));
           //     break;
           // case 6://l2
           //     comm.sendEvent(new Event(EventEnum.ROBOT_EVENT_CMD_FAILSAFE,(short)0,0));
           //     break;
           // case 7://r2
           //     comm.sendEvent(new Event(EventEnum.ROBOT_EVENT_CMD_FAILSAFE,(short)0,0));
           //     break;
           // case 8://select
           //     comm.sendEvent(new Event(EventEnum.ROBOT_EVENT_CMD_FAILSAFE,(short)0,0));
           //     break;
           // case 9://start
           //     comm.sendEvent(new Event(EventEnum.ROBOT_EVENT_CMD_FAILSAFE,(short)0,0));
           //     break;
           // case 10://leftclick
           //     comm.sendEvent(new Event(EventEnum.ROBOT_EVENT_CMD_FAILSAFE,(short)0,0));
           //     break;
           // case 11://rightclick
           //     comm.sendEvent(new Event(EventEnum.ROBOT_EVENT_CMD_FAILSAFE,(short)0,0));
           //     break;
        }
	}
	
	public void on_button_up(Event ev){
		
	}
	
	public void on_joy_hat(Event ev){
		
	}
	
	public void on_joy_status(Event ev){
		comm.sendEvent(new Event(EventEnum.ROBOT_EVENT_CMD_FAILSAFE,(short)0,0));		
	}
	
	public void on_keyboard(Event ev) {
		
	}
	
	public void on_key_status(Event ev){
		
	}
	
	public void on_display(Event ev) {
		
	}
	
	public void on_1hz_timer(Event ev){
		
	}
	
	public void on_10hz_timer(Event ev){
		
	}
	
	public void on_25hz_timer(Event ev){
		
	}
	
	public void on_50hz_timer(Event ev){
		
	}
	
	public void on_100hz_timer(Event ev){
		
	}
	
	public void on_motor(Event ev){
		
	}
	
	public void on_solenoid(Event ev) {
		
	}
	
	public void on_pose(Event ev) {
		
	}
	
	public void on_adc(Event ev) {
		
	}

	public void on_variable(Event ev){
		
	}
	
	public void on_imu(Event ev){
		
	}
	
	public void on_encoder(Event ev){
		
	}

	public void on_eeprom(Event ev) {
		
	}

	public void on_io(Event ev) {
		
	}
	
	public void on_shutdown(Event ev){
		
	}
	
	public void on_unknown_command(Event ev){
		
	}

}
