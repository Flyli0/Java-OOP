package SIS4.t2;

public class PowerSocket{
	private int U;
	public PowerSocket(int U) {
		this.U = U;
	}
	public boolean charge(Pluggable device) {
		if(device.plug())return true;
		if(device.unplug())return false;
		return false;
	}
}
