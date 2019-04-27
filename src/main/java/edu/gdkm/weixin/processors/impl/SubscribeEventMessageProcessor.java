package edu.gdkm.weixin.processors.impl;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.gdkm.weixin.domain.event.EventInMessage;
import edu.gdkm.weixin.processors.EventMessageProcessor;

public class SubscribeEventMessageProcessor implements EventMessageProcessor {
	private static final Logger LOG = LoggerFactory.getLogger(SubscribeEventMessageProcessor.class);
	@Override
	public void onMessage(EventInMessage event) {
		// TODO Auto-generated method stub
		System.out.println("处理关注消息："+event);
	}

}
