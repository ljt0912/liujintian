package edu.gdkm.weixin.processors;

import edu.gdkm.weixin.domain.event.EventInMessage;

public interface UserRepository {
	public void onMessage(EventInMessage event);
}
