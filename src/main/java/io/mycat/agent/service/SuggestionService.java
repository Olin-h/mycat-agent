package io.mycat.agent.service;

public interface SuggestionService {
    /**
     * 根据指定MySQL节点状态，获取优化建议
     *
     * @param serverId
     * @return
     * @throws
     * @Title: getSuggestion
     */
    Object getSuggestion(Long serverId);
}
