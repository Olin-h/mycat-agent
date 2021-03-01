package io.mycat.agent.dto;

public class ChartDataDto {
    private String[] xAxisData;
    private String[] seriesData;

    public String[] getxAxisData() {
        return xAxisData;
    }

    public void setxAxisData(String[] xAxisData) {
        this.xAxisData = xAxisData;
    }

    public String[] getSeriesData() {
        return seriesData;
    }

    public void setSeriesData(String[] seriesData) {
        this.seriesData = seriesData;
    }
}
