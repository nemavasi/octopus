package com.ds.my.octopus.www.common;

import java.util.Set;

/**
 * @author dmitry shalygin on 1/18/2016.
 */
public interface IPosition {

    String getCode();

    void setCode(String code);

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
