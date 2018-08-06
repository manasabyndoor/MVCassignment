package com.factory;

import java.util.ResourceBundle;

import com.acceptinterface.Accept;
import com.displatinterface.Display;

public class MessageFactory {
	public static class MesssageFactory {
		public static Accept display() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
			
		
		
		ResourceBundle bundle =ResourceBundle.getBundle("context");
		String providerStr = bundle.getString("provider");
		Display provider=(Display) Class.forName(providerStr).newInstance();
		String rendererStr = bundle.getString("renderer");
		Accept renderer=(Accept) Class.forName(rendererStr).newInstance();
		renderer.getid();
		
		return renderer;
		
		

		}
	}
}


