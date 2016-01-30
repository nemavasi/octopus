package com.ds.my.octopus.www.common;

import java.util.Set;

/**
 * @author dmitry shalygin on 1/19/2016.
 */
public interface IPositionsCatalog {

    Set<IPosition> getPositions();

    IPosition createPosition(String code);

    IPosition getPositionByCode(String code);


}
