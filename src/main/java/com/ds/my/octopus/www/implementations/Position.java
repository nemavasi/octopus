package com.ds.my.octopus.www.implementations;

import com.ds.my.octopus.www.common.IPosition;
import com.ds.my.octopus.www.common.PositionStatus;

import java.util.HashSet;
import java.util.Set;

/**
 * @author dmitry shalygin on 1/18/2016.
 */
public class Position implements IPosition {

    private String code;
    private PositionStatus status;
    private Set<IPosition> subPositions;
    private Set<IPosition> mustTakenBeforePositions;
    private String description;

    public Position(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


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
            throw new RuntimeException("Subposition is null!");
        }

        if (this.equals(subPosition)) {
            throw new RuntimeException("This position == subposition");
        }

        if (subPositions == null) subPositions = new HashSet<IPosition>();
        subPositions.add(subPosition);
        return this;
    }

    public IPosition removeSubPosition(IPosition subPosition) {
        if (subPosition == null) {
            throw new RuntimeException("Subposition is null!");
        }

        if (subPositions == null) {
            throw new RuntimeException("Set of the subpositions is null!");
        }
        if (!subPositions.contains(subPosition)) {
            throw new RuntimeException("Set of the subpositions does not contain this subposition!");
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
            throw new RuntimeException("Adding position is null!");
        }

        if (this.equals(position)) {
            throw new RuntimeException("This position == mustTaken position");
        }

        if (mustTakenBeforePositions == null) mustTakenBeforePositions = new HashSet<IPosition>();
        mustTakenBeforePositions.add(position);
        return this;
    }

    public IPosition removeMustTakenBeforePosition(IPosition position) {
        if (position == null) {
            throw new RuntimeException("Removing position is null!");
        }

        if (mustTakenBeforePositions == null) {
            throw new RuntimeException("Set of the mustTakenBeforePositions is null!");

        }
        if (!mustTakenBeforePositions.contains(position)) {
            throw new RuntimeException("Set of the mustTakenBeforePositions does not contain this position!");
        }
        mustTakenBeforePositions.remove(position);
        if (mustTakenBeforePositions.size() == 0) {
            mustTakenBeforePositions = null;
        }

        return this;
    }

    public boolean isAtom() {
        return subPositions == null;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null) return false;
        if (this == obj) return true;
        if (obj.getClass() != this.getClass()) return false;
        Position pos = (Position) obj;
        if (this.code.equalsIgnoreCase(pos.code)) return true;

        return false;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        int sumOfCharCodes = 0;
        char[] symvols = code.toLowerCase().toCharArray();
        for (char c : symvols) {
            sumOfCharCodes += c;
        }
        result = prime * result + sumOfCharCodes;
        return result;
    }
}
