package com.cg.renderer;

import com.cg.provider.MessageProvider;

public class PDFMessageRenderer implements MessageRenderer {

	private MessageProvider provider;
	@Override
	public void renderer() {
		System.out.println(provider.getMessage()+ " on PDF");
		
	}

	@Override
	public void setMessageProvider(MessageProvider provider) {
		this.provider=provider;
		
	}

}
