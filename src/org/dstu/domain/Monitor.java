package org.dstu.domain;

public class Monitor extends Display {
    private boolean isCurved;
    private boolean sensorScreen;
    private boolean supportHDR;

    public Monitor() {
    }

    public Monitor(String[] line) {
        super(line[1], line[2], line[3]);
        isCurved = Boolean.parseBoolean(line[4]);
        sensorScreen = Boolean.parseBoolean(line[5]);
        supportHDR = Boolean.parseBoolean(line[6]);
    }

    public boolean isCurved() {
        return isCurved;
    }

    public void setCurved(boolean curved) {
        isCurved = curved;
    }

    public boolean isSensorScreen() {
        return sensorScreen;
    }

    public void setSensorScreen(boolean sensorScreen) {
        this.sensorScreen = sensorScreen;
    }

    public boolean isSupportHDR() {
        return supportHDR;
    }

    public void setSupportHDR(boolean supportHDR) {
        this.supportHDR = supportHDR;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Monitor. ");
        builder.append(super.toString());
        builder.append(" | is curved: ");
        builder.append(isCurved);
        builder.append(" | is sensor screen: ");
        builder.append(sensorScreen);
        builder.append(" | support hdr: ");
        builder.append(supportHDR);
        return builder.toString();
    }
}
