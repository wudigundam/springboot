package com.sylinx.event;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EventListenerExample {

    @EventListener
    public void handleApplicationReady(ApplicationReadyEvent applicationReadyEvent) {
        System.out.println("起動完了後、該当メソッドを呼び出される");
        // 根据实际的业务来code
        // DB
        // 访问个网站
        // 认证
        // 启动某些线程
    }

    @EventListener
    public void handleContextStopped(ContextStoppedEvent contextStoppedEvent) {
        System.out.println("起動停止後、該当メソッドを呼び出される");
    }
}
