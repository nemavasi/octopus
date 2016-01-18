package com.ds.my.www.common;

import java.util.List;

/**
 * @author dmitry shalygin on 1/18/2016.
 */
public interface IPosition {

    PositionStatus getStatus();

    void setStatus(PositionStatus status);

    List<IPosition> getSubPositions();

    String getDescription();

    void setDescription(String description);

}
