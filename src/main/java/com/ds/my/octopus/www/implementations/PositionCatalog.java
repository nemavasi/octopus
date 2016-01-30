package com.ds.my.octopus.www.implementations;

import com.ds.my.octopus.www.common.IPosition;
import com.ds.my.octopus.www.common.IPositionsCatalog;

import java.util.Set;

/**
 * @author dmitry shalygin on 1/19/2016.
 */
public class PositionCatalog implements IPositionsCatalog {

    private Set<IPosition> positions;

    public Set<IPosition> getPositions() {
        return positions;
    }

    public IPosition createPosition(String code) {
        return null;
    }

    public IPosition getPositionByCode(String code) {
        return null;
    }
}
