package edu.gdkm.weixin.service;

import edu.gdkm.weixin.domain.InMessage;
import edu.gdkm.weixin.domain.OUtMessage;

public interface MessageService {

	OUtMessage onMessage(InMessage msg);
}
