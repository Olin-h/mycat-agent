package io.mycat.agent.controller;

import io.mycat.agent.dto.RestResponse;
import io.mycat.agent.service.HealthCheckService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/health-check")
public class HealthCheckController {
    @Resource
    private HealthCheckService healthCheckService;

    /**
     * 检查是否有远程用户具有超级权限
     *
     * @param serverId
     * @return
     * @throws
     * @Title: superPriv
     */
    @RequestMapping(value = "/super-priv/{serverId}", method = {RequestMethod.POST, RequestMethod.GET})
    @CrossOrigin(origins = "*")
    public RestResponse<Object> superPriv(@PathVariable Long serverId) {
        return healthCheckService.superPriv(serverId);
    }

    /**
     * 检查是否有用户的密码是弱密码
     *
     * @param serverId
     * @return
     * @throws
     * @Title: weakPassword
     */
    @RequestMapping(value = "/weak-password/{serverId}", method = {RequestMethod.POST, RequestMethod.GET})
    @CrossOrigin(origins = "*")
    public RestResponse<Object> weakPassword(@PathVariable Long serverId) {
        return healthCheckService.weakPassword(serverId);
    }

    /**
     * 检查是否有锁等待
     *
     * @param serverId
     * @return
     * @throws
     * @Title: lockWait
     */
    @RequestMapping(value = "/lock-wait/{serverId}", method = {RequestMethod.POST, RequestMethod.GET})
    @CrossOrigin(origins = "*")
    public RestResponse<Object> lockWait(@PathVariable Long serverId) {
        return healthCheckService.lockWait(serverId);
    }

    /**
     * 检查是否有未完成的事务
     *
     * @param serverId
     * @return
     * @throws
     * @Title: transaction
     */
    @RequestMapping(value = "/transaction/{serverId}", method = {RequestMethod.POST, RequestMethod.GET})
    @CrossOrigin(origins = "*")
    public RestResponse<Object> transaction(@PathVariable Long serverId) {
        return healthCheckService.transaction(serverId);
    }

    /**
     * 检查是否有慢查询
     *
     * @param serverId
     * @return
     * @throws
     * @Title: slow
     */
    @RequestMapping(value = "/slow/{serverId}", method = {RequestMethod.POST, RequestMethod.GET})
    @CrossOrigin(origins = "*")
    public RestResponse<Object> slow(@PathVariable Long serverId) {
        return healthCheckService.slow(serverId);
    }

    /**
     * 检查是否存在非UTF8(UTF8MB4)的编码
     *
     * @param serverId
     * @return
     * @throws
     * @Title: charset
     */
    @RequestMapping(value = "/charset/{serverId}", method = {RequestMethod.POST, RequestMethod.GET})
    @CrossOrigin(origins = "*")
    public RestResponse<Object> charset(@PathVariable Long serverId) {
        return healthCheckService.charset(serverId);
    }

    /**
     * 检查复制状态是否正常
     *
     * @param serverId
     * @return
     * @throws
     * @Title: replication
     */
    @RequestMapping(value = "/replication/{serverId}", method = {RequestMethod.POST, RequestMethod.GET})
    @CrossOrigin(origins = "*")
    public RestResponse<Object> replication(@PathVariable Long serverId) {
        return healthCheckService.replication(serverId);
    }

    /**
     * 检查是否存在无用索引
     *
     * @param serverId
     * @return
     * @throws
     * @Title: unusedIndex
     */
    @RequestMapping(value = "/unused-index/{serverId}", method = {RequestMethod.POST, RequestMethod.GET})
    @CrossOrigin(origins = "*")
    public RestResponse<Object> unusedIndex(@PathVariable Long serverId) {
        return healthCheckService.unusedIndex(serverId);
    }

    /**
     * 检查是否存在没有设置主键的表
     *
     * @param serverId
     * @return
     * @throws
     * @Title: noPrimaryKey
     */
    @RequestMapping(value = "/no-primary-key/{serverId}", method = {RequestMethod.POST, RequestMethod.GET})
    @CrossOrigin(origins = "*")
    public RestResponse<Object> noPrimaryKey(@PathVariable Long serverId) {
        return healthCheckService.noPrimaryKey(serverId);
    }

    /**
     * 检查索引基数是否存在异常
     *
     * @param serverId
     * @return
     * @throws
     * @Title: indexCardinality
     */
    @RequestMapping(value = "/index-cardinality/{serverId}", method = {RequestMethod.POST, RequestMethod.GET})
    @CrossOrigin(origins = "*")
    public RestResponse<Object> indexCardinality(@PathVariable Long serverId) {
        return healthCheckService.indexCardinality(serverId);
    }

    /**
     * 检查是否存在冗余索引
     *
     * @param serverId
     * @return
     * @throws
     * @Title: redundantIndex
     */
    @RequestMapping(value = "/redundant-index/{serverId}", method = {RequestMethod.POST, RequestMethod.GET})
    @CrossOrigin(origins = "*")
    public RestResponse<Object> redundantIndex(@PathVariable Long serverId) {
        return healthCheckService.redundantIndex(serverId);
    }
}
