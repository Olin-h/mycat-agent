package io.mycat.agent.util;


import io.mycat.agent.entity.MysqlStatusHistory;

import java.util.ArrayList;
import java.util.List;

public class SysSampleUtil<T> {
    /**
     * 在传入的MySQL状态指标中，进行系统采样，获取指定数量的样本数据
     *
     * @param list
     * @param count 样本数量
     * @return
     * @throws
     * @Title: sysSample
     */
    public static List<MysqlStatusHistory> getSysSample(List<MysqlStatusHistory> list, int count) {
        List<MysqlStatusHistory> sampleList = null;
        int size = list.size();
        if (size <= count) {
            sampleList = list;
        } else {
            //计算现有数据量与样本数量的倍数
            int multiple = size / count;
            sampleList = new ArrayList<>();
            //以倍数作为步长，从原数据集合中取样
            for (int i = 0; i < size; i = i + multiple) {
                sampleList.add(list.get(i));
            }
        }

        return sampleList;
    }
}
