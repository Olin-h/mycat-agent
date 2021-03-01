package io.mycat.agent.controller;


import io.mycat.agent.dto.PagedDto;
import io.mycat.agent.entity.InnodbLockWaits;
import io.mycat.agent.entity.InnodbTrx;
import io.mycat.agent.service.InnodbService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/innodb")
public class InnodbController {
    @Resource
    private InnodbService innodbService;

    @RequestMapping("/status/{serverId}")
    @CrossOrigin(origins = "*")
    public String getStatus(@PathVariable Long serverId) {
        return innodbService.getStatus(serverId);
    }

    @RequestMapping("/trx/{serverId}")
    @CrossOrigin(origins = "*")
    public PagedDto<InnodbTrx> getTrxs(@PathVariable Long serverId) {
        return innodbService.getInnodbTrxs(serverId);
    }

    @RequestMapping("/lockwaits/{serverId}")
    @CrossOrigin(origins = "*")
    public PagedDto<InnodbLockWaits> getLockWaits(@PathVariable Long serverId) {
        return innodbService.getInnodbLockWaits(serverId);
    }
}
