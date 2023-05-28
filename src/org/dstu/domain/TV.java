package org.dstu.domain;

public class TV extends Display {
    private String OperationSystem;
    private boolean supportSmartTV;
    private boolean supportWifi;

    public TV() {
    }

    public TV(String[] line) {
        super(line[2], line[3], line[1]);
        OperationSystem = line[4];
        supportSmartTV = Boolean.parseBoolean(line[5]);
        supportWifi = Boolean.parseBoolean(line[6]);
    }

    public String getOperationSystem() {
        return OperationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        OperationSystem = operationSystem;
    }

    public boolean isSupportSmartTV() {
        return supportSmartTV;
    }

    public void setSupportSmartTV(boolean supportSmartTV) {
        this.supportSmartTV = supportSmartTV;
    }

    public boolean isSupportWifi() {
        return supportWifi;
    }

    public void setSupportWifi(boolean supportWifi) {
        this.supportWifi = supportWifi;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("TV: ");
        builder.append(super.toString());
        builder.append(" | Operation system: ");
        builder.append(OperationSystem);
        builder.append(" | Support smart tv: ");
        builder.append(supportSmartTV);
        builder.append(" | Support wifi: ");
        builder.append(supportWifi);
        return builder.toString();
    }
}
