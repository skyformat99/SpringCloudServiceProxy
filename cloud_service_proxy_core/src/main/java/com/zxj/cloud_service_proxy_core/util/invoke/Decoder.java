package com.zxj.cloud_service_proxy_core.util.invoke;

import java.io.IOException;
import java.lang.reflect.Type;

/**
 * 序列化 编码
 * @author zhuxiujie
 * @since 2018/3/18
 */

public interface Decoder {

    Object decoder(String row,Type clazz) throws IOException;
}
