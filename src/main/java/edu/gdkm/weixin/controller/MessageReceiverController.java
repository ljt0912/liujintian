package edu.gdkm.weixin.controller;
//import java.io.IOException;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.fasterxml.jackson.core.JsonParseException;
//import com.fasterxml.jackson.databind.JsonMappingException;
//import com.fasterxml.jackson.dataformat.xml.XmlMapper;
//
//import edu.gdkm.domain.image.ImageInMessage;
//import edu.gdkm.weixin.service.MessageConvertHelper;
//import edu.gdkm.wexin.domain.InMessage;


// Controller（控制器），其实就相当于是Servlet，但是Spring MVC把所有的Servlet相关API都屏蔽掉了！
// 屏蔽的好处：不需要依赖Tomcat就可以实现单元测试。
//@RestController // 基于RESTful风格的WEB服务的控制器
//@RequestMapping("/liujintian/weixin/reciver") // 访问哪个路径的时候，被此控制器处理
//public class MessageReceiverController {
   
	// 自动从Spring的容器里面获取一个消息服务出来，用于处理转换后的消息。现在还未实现消息的处理。
	// 能够自动根据接口和实现的关系，自动把合适类型的对象放进来。

	// 日志记录器
//	private static final Logger LOG = LoggerFactory.getLogger(MessageReceiverController.class);

	// 这种是属性注入，相当于是XML文件中的<property>元素
//	@Autowired
//	private XmlMapper xmlMapper;
//	@Autowired
//	private RedisTemplate<String, ? extends ImageInMessage> inMessageTemplate;

	// 注意：控制器里面必须要有处理器方法（Handler Method）才能执行操作，才不会404
	// 处理GET请求，HTTP协议支持GET、POST、PUT、DELETE等请求方式，都有对应的注解
//	@GetMapping
//	public String echo(//
//			@RequestParam("signature") String signature, //
//			@RequestParam("timestamp") String timestamp, //
//			@RequestParam("nonce") String nonce, //
//			@RequestParam("echostr") String echostr//
	//
//	) {
//		return echostr;
//	}

//	@PostMapping
	// @RequestBody注解表示把请求内容获取出来，并且转换为String传入给xml参数。
//	public String onMessage(//
//			@RequestParam("signature") String signature, //
//			@RequestParam("timestamp") String timestamp, //
//			@RequestParam("nonce") String nonce, //
//			@RequestBody String xml) throws JsonParseException, JsonMappingException, IOException {
		// 收到消息
		// {}是占位符，第一个{}会把第二个参数的值自动填入
		// LOG.trace必须要求日志记录器的配置为trace级别才能输出
//		LOG.trace("收到的消息原文：\n{}\n------------------------------", xml);
		// 转换消息

		// 转换消息1.获取消息的类型
//		String type = xml.substring(xml.indexOf("<MsgType><![CDATA[") + 18);
//		type = type.substring(0, type.indexOf("]"));
		// 转换消息2.根据消息类型，把XML转换为对应类型的对象
//		if (type.equals("text")) {
//			InMessage x = new TextInMessage();
//		} else if (type.equals("image")) {
//			InMessage x = new ImageInMessage();
//		} else if (type.equals("vioce")) {
//			InMessage x = new TextInMessage();
//		} else if (type.equals("video")) {
//			InMessage x = new TextInMessage();
//		}

		// InMessage inMessage = MessageConvertHelper.convert(xml);

//		InMessage inMessage = convert(xml);
//
//		if (inMessage == null) {
//			LOG.error("消息无法转换！原文：\n{}\n", xml);
//			// 消息无法转换
//			return "success";
//		}
//
//		LOG.debug("转换后的消息对象\n{}\n", inMessage);

		// 最好使用自己的拼音名作为前缀，后缀是消息类型
//		String channel = "kemao_2_" + inMessage.getMsgType();
		// 把消息丢入队列
		// 1.完成对象的序列化
//		ByteArrayOutputStream bos = new ByteArrayOutputStream();// 字节输出流
//		ObjectOutputStream out = new ObjectOutputStream(bos);
//		out.writeObject(inMessage);
//
//		byte[] data = bos.toByteArray();// 序列化之后的字节数组

		// 2.把序列化后对象放入队列里面
//		inMessageTemplate.execute(new RedisCallback<InMessage>() {
//
//			@Override
//			public InMessage doInRedis(RedisConnection connection) throws DataAccessException {
//				// 建议不同的人分开前缀
//				
//				connection.publish(channel.getBytes(), data);
//
//				return null;
//			}
//		});

		// 直接把对象发送出去，调用ValueSerializer来实现对象的序列化和反序列
//		inMessageTemplate.convertAndSend(channel, inMessage);

		// 消费队列中的消息
		// 产生客服消息

//		return "success";
//	}

//	private InMessage convert(String xml) throws JsonParseException, JsonMappingException, IOException {
//		Class<? extends InMessage> c = MessageConvertHelper.getClass(xml);
//		InMessage msg = xmlMapper.readValue(xml, c);
//		return msg;
//	}
//}
