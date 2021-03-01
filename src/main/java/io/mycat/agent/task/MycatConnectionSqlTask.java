package io.mycat.agent.task;

import io.mycat.agent.entity.MycatServer;
import io.mycat.agent.entity.MycatServerExample;
import io.mycat.agent.dto.QueryResult;
import io.mycat.agent.mapper.MycatServerMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.Base64;
import java.util.List;
import java.util.Map;

/**
 * Created by xqy on 18/4/28.
 */
public class MycatConnectionSqlTask extends AbstractTask {
    private static final Logger logger = LoggerFactory.getLogger(MycatConnectionSqlTask.class);
    private static final String SHOW_SQL = "show @@connection.sql";
    public final static long DELAY_TIME = 1 * 60 * 1000;

    @Resource
    MycatServerMapper mycatServerMapper;

    //    @Scheduled(fixedDelay = DELAY_TIME)
    public void execute() {
        logger.debug(SHOW_SQL + " task:" + DELAY_TIME + " ms");
        MycatServerExample mycatServerExample = new MycatServerExample();
        List<MycatServer> mycatServerList = mycatServerMapper.selectByExample(mycatServerExample);
        for (MycatServer server : mycatServerList) {
            logger.debug("server " + server.toString());
            String host = server.getServerHost();
            String port = server.getManagerPort().toString();
            String username = server.getUser();
            String password = new String(Base64.getDecoder().decode(server.getPassword()));
            QueryResult<List<Map<Object, Object>>> statusQueryResult = getQueryResult(host, port, SHOW_SQL, username, password);

            if (!statusQueryResult.isSuccess()) {
                continue;
            }

            List<Map<Object, Object>> statusList = statusQueryResult.getData();
            logger.debug(String.valueOf(statusList.size()));

            statusList.stream().forEach(o -> {

            });
        }
    }

}
