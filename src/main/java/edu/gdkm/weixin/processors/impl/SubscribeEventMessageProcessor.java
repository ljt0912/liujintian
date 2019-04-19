package edu.gdkm.weixin.processors.impl;

import edu.gdkm.weixin.domain.event.EventInMessage;
import edu.gdkm.weixin.processors.EventMessageProcessor;

public class SubscribeEventMessageProcessor implements EventMessageProcessor {

	@Override
	public void onMessage(EventInMessage event) {
		// TODO Auto-generated method stub
		System.out.println("处理关注消息："+event);
	}

}
