package com.ds.my.www.implementations;

import com.ds.my.www.common.IPosition;
import com.ds.my.www.common.PositionStatus;

import java.util.List;

/**
 * @author dmitry shalygin on 1/18/2016.
 */
public class Position implements IPosition{
    private PositionStatus status;
    private List<IPosition> subPositions;
    private String description;

    public PositionStatus getStatus() {
        return status;
    }

    public void setStatus(PositionStatus status) {
        this.status = status;
    }

    public List<IPosition> getSubPositions() {
        return subPositions;
    }

    public void setSubPositions(List<IPosition> subPositions) {
        this.subPositions = subPositions;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
