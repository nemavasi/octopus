package com.ds.my.www.common;

import java.util.List;
import java.util.Set;

/**
 * @author dmitry shalygin on 1/18/2016.
 */
public interface IPosition {

    PositionStatus getStatus();

    IPosition setStatus(PositionStatus status);

    Set<IPosition> getSubPositions();

    IPosition addSubPosition(IPosition subPosition);

    IPosition removeSubPosition(IPosition subPosition);

    String getDescription();

    IPosition setDescription(String description);

    Set<IPosition> getMustTakenBeforePositions();

    IPosition addMustTakenBeforePosition(IPosition position);

    IPosition removeMustTakenBeforePosition(IPosition position);

    boolean isAtom();


}
