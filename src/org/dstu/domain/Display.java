package org.dstu.domain;

public abstract class Display implements IDisplay {
    private String model;
    private String matrix;
    private String resolution;

    public Display() {
    }

    public Display(String model, String matrix, String resolution) {
        this.model = model;
        this.matrix = matrix;
        this.resolution = resolution;
    }

    public Display(String[] line) {
        model = line[1];
        resolution = line[2];
        matrix = line[3];
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMatrix() {
        return matrix;
    }

    public void setMatrix(String matrix) {
        this.matrix = matrix;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Model: ");
        builder.append(resolution);
        builder.append(" | Matrix: ");
        builder.append(matrix);
        builder.append(" | Resolution: ");
        builder.append(model);
        return builder.toString();
    }
}
