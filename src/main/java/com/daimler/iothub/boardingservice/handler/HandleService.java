package com.daimler.iothub.boardingservice.handler;

import com.rabbitmq.client.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.listener.api.ChannelAwareMessageListener;
import org.springframework.stereotype.Service;

@Service
public class HandleService implements ChannelAwareMessageListener {
    private static final Logger logger = LoggerFactory.getLogger(HandleService.class);
    @Override
    public void onMessage(Message message, Channel channel) throws Exception {
      //test comments
       logger.info( message.getMessageProperties().getConsumerQueue()+":"+new String(message.getBody()));

    }
}
