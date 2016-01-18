package com.ds.my.www.common;

import java.util.List;

/**
 * @author dmitry shalygin on 1/18/2016.
 */
public interface IPosition {
    PositionStatus getStatus();
    List<IPosition> getSubPositions();
}
