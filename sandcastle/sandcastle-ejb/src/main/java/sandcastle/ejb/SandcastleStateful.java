package sandcastle.ejb;

import javax.ejb.Stateful;

import sandcastle.ejb.api.HelloStateful;

@Stateful
public class SandcastleStateful implements HelloStateful {

	public String hello() {
		return "Hello from " + this.getClass().getName();
	}
	
}
