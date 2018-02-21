package sandcastle.ejb;

import javax.ejb.Singleton;

import sandcastle.ejb.api.HelloSingleton;

@Singleton
public class SandcastleSingleton implements HelloSingleton {

	public String hello() {
		return "Hello from " + this.getClass().getName();
	}

}
