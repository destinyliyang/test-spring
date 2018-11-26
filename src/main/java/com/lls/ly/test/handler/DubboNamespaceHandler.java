package com.lls.ly.test.handler;

import com.lls.ly.test.parser.EmptyBeanDefinitionParser;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author ShenHuaJie
 * @version 2016年5月20日 下午3:19:19
 */
public class DubboNamespaceHandler extends NamespaceHandlerSupport {

    @Override
    public void init() {
        registerBeanDefinitionParser("application", new EmptyBeanDefinitionParser());
    }

}
