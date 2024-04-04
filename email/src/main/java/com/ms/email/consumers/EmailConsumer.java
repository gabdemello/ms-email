package com.ms.email.consumers;

import com.ms.email.dtos.EmailDto;
import com.ms.email.models.EmailModel;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.BeanUtils;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EmailConsumer {

    @RabbitListener(queues = "${broker.queue.email.name}")
    public void listenEmailQueue(@Payload EmailDto emailDto){
        var emailModel = new EmailModel();
        BeanUtils.copyProperties(emailDto, emailModel);


    }
}
