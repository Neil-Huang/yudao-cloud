package cn.iocoder.yudao.framework.operatelog.config;

import cn.iocoder.yudao.module.system.api.logger.OperateLogApi;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/**
 * 操作日志使用到 Feign 的配置项
 *
 * @author 芋道源码
 */
@Configuration(proxyBeanMethods = false)
@EnableFeignClients(clients = OperateLogApi.class) // 主要是引入相关的 API 服务
public class YudaoOperateLogRpcAutoConfiguration {

}
