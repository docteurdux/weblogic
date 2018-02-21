package sandcastle.ejb;

import javax.ejb.Stateless;

import sandcastle.ejb.api.HelloStateless;

@Stateless
public class SandcastleStateless implements HelloStateless {

	public String hello() {
		return "Hello from " + this.getClass().getName();
	}
	
}
