package com.ds.my.www.implementations;

import com.ds.my.www.common.IPosition;
import com.ds.my.www.common.PositionStatus;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

/**
 * @author dmitry shalygin on 1/18/2016.
 */
public class Position implements IPosition {

    private final static Logger logger = Logger.getLogger(Position.class.getCanonicalName());
    private PositionStatus status;
    private Set<IPosition> subPositions;
    private Set<IPosition> mustTakenBeforePositions;
    private String description;

    public PositionStatus getStatus() {
        return status;
    }

    public Position setStatus(PositionStatus status) {
        this.status = status;
        return this;
    }

    public Set<IPosition> getSubPositions() {
        return subPositions;
    }

    public IPosition addSubPosition(IPosition subPosition) {
        if (subPosition == null) {
            logger.info("Subposition is null!");
            return this;
        }

        if (subPositions == null) subPositions = new HashSet<IPosition>();
        subPositions.add(subPosition);
        return this;
    }

    public IPosition removeSubPosition(IPosition subPosition) {
        if (subPosition == null) {
            logger.info("Subposition is null!");
            return this;
        }

        if (subPositions == null) {
            logger.info("Set of the subPositions is null!");
            return this;
        }
        if (!subPositions.contains(subPosition)) {
            logger.info("Subposition is not in the set!");
            return this;
        }
        subPositions.remove(subPosition);
        if (subPositions.size() == 0) {
            subPositions = null;
        }

        return this;
    }

    public String getDescription() {
        return description;
    }

    public Position setDescription(String description) {
        this.description = description;
        return this;
    }

    public Set<IPosition> getMustTakenBeforePositions() {
        return mustTakenBeforePositions;
    }

    public IPosition addMustTakenBeforePosition(IPosition position) {
        if (position == null) {
            logger.info("Subposition is null!");
            return this;
        }

        if (mustTakenBeforePositions == null) mustTakenBeforePositions = new HashSet<IPosition>();
        mustTakenBeforePositions.add(position);
        return this;
    }

    public IPosition removeMustTakenBeforePosition(IPosition position) {
        if (position == null) {
            logger.info("Position is null!");
            return this;
        }

        if (mustTakenBeforePositions == null) {
            logger.info("Set of the mustTakenBeforePositions is null!");
            return this;
        }
        if (!mustTakenBeforePositions.contains(position)) {
            logger.info("Position is not in the set!");
            return this;
        }
        mustTakenBeforePositions.remove(position);
        if (mustTakenBeforePositions.size() == 0) {
            mustTakenBeforePositions = null;
        }

        return this;
    }

    public boolean isAtom(){
        return subPositions==null;
    }

}
